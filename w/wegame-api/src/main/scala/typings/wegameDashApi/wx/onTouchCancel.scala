package typings.wegameDashApi.wx

import typings.wegameDashApi.wx.types.TouchData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onTouchCancel")
@js.native
object onTouchCancel extends js.Object {
  /**
    * 监听触点失效事件
    */
  def apply(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
}

