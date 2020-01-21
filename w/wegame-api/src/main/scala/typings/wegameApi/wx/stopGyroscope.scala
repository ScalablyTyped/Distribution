package typings.wegameApi.wx

import typings.wegameApi.wx.types.Callbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.stopGyroscope")
@js.native
object stopGyroscope extends js.Object {
  // --陀螺仪
  /**
    * 停止监听陀螺仪数据
    */
  def apply(): Unit = js.native
  def apply(cb: Callbacks): Unit = js.native
}

