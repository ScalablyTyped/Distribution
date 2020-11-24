package typings.wechatMiniprogram.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("clearTimeout")
@js.native
object clearTimeout extends js.Object {
  
  /** [clearTimeout(number timeoutID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearTimeout.html)
    *
    * 取消由 setTimeout 设置的定时器。 */
  def apply(/** 要取消的定时器的 ID */
  timeoutID: Double): Unit = js.native
}
