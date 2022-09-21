package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeTagLogManager extends StObject {
  
  /** [RealtimeTagLogManager.addFilterMsg(string msg)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeTagLogManager.addFilterMsg.html)
    *
    * 添加过滤关键字
    *
    * 最低基础库： `2.16.0` */
  def addFilterMsg(/** 是setFilterMsg的添加接口。用于设置多个过滤关键字。 */
  msg: String): Unit = js.native
  
  def error(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: String): Unit = js.native
  def error(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: js.Array[Any]): Unit = js.native
  def error(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: Double): Unit = js.native
  /** [RealtimeTagLogManager.error(string key, Object|Array.&lt;any&gt;|number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeTagLogManager.error.html)
    *
    * 写 error 日志
    *
    * 最低基础库： `2.16.0` */
  def error(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: IAnyObject): Unit = js.native
  
  def info(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: String): Unit = js.native
  def info(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: js.Array[Any]): Unit = js.native
  def info(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: Double): Unit = js.native
  /** [RealtimeTagLogManager.info(string key, Object|Array.&lt;any&gt;|number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeTagLogManager.info.html)
    *
    * 写 info 日志
    *
    * 最低基础库： `2.16.0` */
  def info(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: IAnyObject): Unit = js.native
  
  /** [RealtimeTagLogManager.setFilterMsg(string msg)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeTagLogManager.setFilterMsg.html)
    *
    * 设置过滤关键字
    *
    * 最低基础库： `2.16.0` */
  def setFilterMsg(/** 过滤关键字，最多不超过1Kb，可以在小程序管理后台根据设置的内容搜索得到对应的日志。 */
  msg: String): Unit = js.native
  
  def warn(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: String): Unit = js.native
  def warn(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: js.Array[Any]): Unit = js.native
  def warn(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: Double): Unit = js.native
  /** [RealtimeTagLogManager.warn(string key, Object|Array.&lt;any&gt;|number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeTagLogManager.warn.html)
    *
    * 写 warn 日志
    *
    * 最低基础库： `2.16.0` */
  def warn(/** 日志的 key */
  key: String, /** 日志的值，每次调用的参数的总大小不超过5Kb */
  value: IAnyObject): Unit = js.native
}
