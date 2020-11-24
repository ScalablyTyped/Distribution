package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeLogManager extends js.Object {
  
  /** [RealtimeLogManager.addFilterMsg(string msg)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.addFilterMsg.html)
    *
    * 添加过滤关键字
    *
    * 最低基础库： `2.8.1` */
  def addFilterMsg(/** 是setFilterMsg的添加接口。用于设置多个过滤关键字。 */
  msg: String): Unit = js.native
  
  /** [RealtimeLogManager.error()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.error.html)
    *
    * 写 error 日志
    *
    * 最低基础库： `2.7.1` */
  def error(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过5Kb */
  args: js.Any*): Unit = js.native
  
  /** [RealtimeLogManager.in(Page pageInstance)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.in.html)
    *
    * 设置实时日志page参数所在的页面
    *
    * 最低基础库： `2.9.1` */
  def in(/** page实例 */
  pageInstance: TrivialInstance): Unit = js.native
  
  /** [RealtimeLogManager.info()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.info.html)
    *
    * 写 info 日志
    *
    * 最低基础库： `2.7.1` */
  def info(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过5Kb */
  args: js.Any*): Unit = js.native
  
  /** [RealtimeLogManager.setFilterMsg(string msg)](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.setFilterMsg.html)
    *
    * 设置过滤关键字
    *
    * 最低基础库： `2.7.3` */
  def setFilterMsg(/** 过滤关键字，最多不超过1Kb，可以在小程序管理后台根据设置的内容搜索得到对应的日志。 */
  msg: String): Unit = js.native
  
  /** [RealtimeLogManager.warn()](https://developers.weixin.qq.com/miniprogram/dev/api/base/debug/RealtimeLogManager.warn.html)
    *
    * 写 warn 日志
    *
    * 最低基础库： `2.7.1` */
  def warn(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过5Kb */
  args: js.Any*): Unit = js.native
}
object RealtimeLogManager {
  
  @scala.inline
  def apply(
    addFilterMsg: String => Unit,
    error: /* repeated */ js.Any => Unit,
    in: TrivialInstance => Unit,
    info: /* repeated */ js.Any => Unit,
    setFilterMsg: String => Unit,
    warn: /* repeated */ js.Any => Unit
  ): RealtimeLogManager = {
    val __obj = js.Dynamic.literal(addFilterMsg = js.Any.fromFunction1(addFilterMsg), error = js.Any.fromFunction1(error), in = js.Any.fromFunction1(in), info = js.Any.fromFunction1(info), setFilterMsg = js.Any.fromFunction1(setFilterMsg), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[RealtimeLogManager]
  }
  
  @scala.inline
  implicit class RealtimeLogManagerOps[Self <: RealtimeLogManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddFilterMsg(value: String => Unit): Self = this.set("addFilterMsg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn(value: TrivialInstance => Unit): Self = this.set("in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterMsg(value: String => Unit): Self = this.set("setFilterMsg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
