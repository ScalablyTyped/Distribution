package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeLogManager extends StObject {
  
  /** [RealtimeLogManager.addFilterMsg(string msg)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.addFilterMsg.html)
    *
    * 添加过滤关键字，暂不支持在插件使用
    *
    * 最低基础库： `2.8.1` */
  def addFilterMsg(/** 是setFilterMsg的添加接口。用于设置多个过滤关键字。 */
  msg: String): Unit
  
  /** [RealtimeLogManager.error()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.error.html)
    *
    * 写 error 日志，暂不支持在插件使用
    *
    * 最低基础库： `2.7.1` */
  def error(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过5Kb */
  args: Any*): Unit
  
  /** [RealtimeLogManager.in(Page pageInstance)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.in.html)
    *
    * 设置实时日志page参数所在的页面，暂不支持在插件使用
    *
    * 最低基础库： `2.9.1` */
  def in(/** page实例 */
  pageInstance: TrivialInstance): Unit
  
  /** [RealtimeLogManager.info()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.info.html)
    *
    * 写 info 日志，暂不支持在插件使用
    *
    * 最低基础库： `2.7.1` */
  def info(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过5Kb */
  args: Any*): Unit
  
  /** [RealtimeLogManager.setFilterMsg(string msg)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.setFilterMsg.html)
    *
    * 设置过滤关键字，暂不支持在插件使用
    *
    * 最低基础库： `2.7.3` */
  def setFilterMsg(/** 过滤关键字，最多不超过1Kb，可以在小程序管理后台根据设置的内容搜索得到对应的日志。 */
  msg: String): Unit
  
  /** [[RealtimeTagLogManager](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeTagLogManager.html) RealtimeLogManager.tag(string tagName)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.tag.html)
    *
    * 获取给定标签的日志管理器实例，目前只支持在插件使用
    *
    * 最低基础库： `2.16.0` */
  def tag(/** 标签名 */
  tagName: String): RealtimeTagLogManager
  
  /** [RealtimeLogManager.warn()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.warn.html)
    *
    * 写 warn 日志，暂不支持在插件使用
    *
    * 最低基础库： `2.7.1` */
  def warn(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过5Kb */
  args: Any*): Unit
}
object RealtimeLogManager {
  
  inline def apply(
    addFilterMsg: String => Unit,
    error: /* repeated */ Any => Unit,
    in: TrivialInstance => Unit,
    info: /* repeated */ Any => Unit,
    setFilterMsg: String => Unit,
    tag: String => RealtimeTagLogManager,
    warn: /* repeated */ Any => Unit
  ): RealtimeLogManager = {
    val __obj = js.Dynamic.literal(addFilterMsg = js.Any.fromFunction1(addFilterMsg), error = js.Any.fromFunction1(error), in = js.Any.fromFunction1(in), info = js.Any.fromFunction1(info), setFilterMsg = js.Any.fromFunction1(setFilterMsg), tag = js.Any.fromFunction1(tag), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[RealtimeLogManager]
  }
  
  extension [Self <: RealtimeLogManager](x: Self) {
    
    inline def setAddFilterMsg(value: String => Unit): Self = StObject.set(x, "addFilterMsg", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setIn(value: TrivialInstance => Unit): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setSetFilterMsg(value: String => Unit): Self = StObject.set(x, "setFilterMsg", js.Any.fromFunction1(value))
    
    inline def setTag(value: String => RealtimeTagLogManager): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
