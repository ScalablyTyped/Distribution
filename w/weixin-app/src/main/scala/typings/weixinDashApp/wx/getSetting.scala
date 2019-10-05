package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getSetting")
@js.native
object getSetting extends js.Object {
  /**
  	 * 获取用户的当前设置。
  	 * 注：返回值中只会出现小程序已经向用户请求过的权限。
  	 * @version 1.2.0
  	 */
  def apply(options: OpenSettingOptions): Unit = js.native
}

