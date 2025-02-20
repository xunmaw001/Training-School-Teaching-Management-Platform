package com.entity.view;

import com.entity.JigouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 机构信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 10:06:46
 */
@TableName("jigouxinxi")
public class JigouxinxiView  extends JigouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JigouxinxiView(){
	}
 
 	public JigouxinxiView(JigouxinxiEntity jigouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jigouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
