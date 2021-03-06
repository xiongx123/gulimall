package com.xiongchao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiongchao.common.utils.PageUtils;
import com.xiongchao.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author xiongchao
 * @email xiongchao@gmail.com
 * @date 2020-12-27 09:41:39
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

