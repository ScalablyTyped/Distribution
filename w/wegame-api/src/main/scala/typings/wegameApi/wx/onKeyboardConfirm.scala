package typings.wegameApi.wx

import typings.wegameApi.AnonValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onKeyboardConfirm")
@js.native
object onKeyboardConfirm extends js.Object {
  /**
    * 监听用户点击键盘 Confirm 按钮时的事件
    * @param callback.res.value 键盘输入的当前值
    */
  def apply(callback: js.Function1[/* res */ AnonValueString, Unit]): Unit = js.native
}

