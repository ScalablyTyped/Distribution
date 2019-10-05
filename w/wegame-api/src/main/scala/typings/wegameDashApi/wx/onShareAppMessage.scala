package typings.wegameDashApi.wx

import typings.wegameDashApi.wx.types.ShareOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onShareAppMessage")
@js.native
object onShareAppMessage extends js.Object {
  /**
    * 监听用户点击右上角菜单的“转发”按钮时触发的事件
    */
  def apply(cb: js.Function0[ShareOption]): Unit = js.native
}

