package typings.wechatMiniprogram.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("clearInterval")
@js.native
object clearInterval extends js.Object {
  
  /** [clearInterval(number intervalID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearInterval.html)
    *
    * 取消由 setInterval 设置的定时器。 */
  def apply(/** 要取消的定时器的 ID */
  intervalID: Double): Unit = js.native
}
