package typings.wegameApi.wx

import typings.wegameApi.AnonWindowHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onWindowResize")
@js.native
object onWindowResize extends js.Object {
  // --窗口
  /**
    * 监听窗口尺寸变化事件
    */
  def apply(cb: js.Function1[/* res */ AnonWindowHeight, Unit]): Unit = js.native
}

