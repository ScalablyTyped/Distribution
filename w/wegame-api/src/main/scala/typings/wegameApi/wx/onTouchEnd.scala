package typings.wegameApi.wx

import typings.wegameApi.wx.types.TouchData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onTouchEnd")
@js.native
object onTouchEnd extends js.Object {
  /**
    * 监听触摸结束事件
    */
  def apply(cb: js.Function1[/* res */ TouchData, Unit]): Unit = js.native
}

