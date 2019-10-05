package typings.wegameDashApi.wx

import typings.wegameDashApi.wx.types.TouchData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onTouchStart")
@js.native
object onTouchStart extends js.Object {
  // --触摸事件
  /**
    * 监听开始始触摸事件
    */
  def apply(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
}

