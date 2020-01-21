package typings.wegameApi.wx

import typings.wegameApi.wx.types.ShareOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.offShareAppMessage")
@js.native
object offShareAppMessage extends js.Object {
  /**
    * 取消监听用户点击右上角菜单的“转发”按钮时触发的事件
    */
  def apply(cb: js.Function0[ShareOption]): Unit = js.native
}

