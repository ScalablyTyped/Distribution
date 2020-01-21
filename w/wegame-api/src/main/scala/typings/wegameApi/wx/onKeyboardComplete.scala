package typings.wegameApi.wx

import typings.wegameApi.AnonValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onKeyboardComplete")
@js.native
object onKeyboardComplete extends js.Object {
  /**
    * 监听监听键盘收起的事件
    * @param callback.res.value 键盘输入的当前值
    */
  def apply(callback: js.Function1[/* res */ AnonValueString, Unit]): Unit = js.native
}

