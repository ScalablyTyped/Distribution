package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onDeviceMotionChange")
@js.native
object onDeviceMotionChange extends js.Object {
  /**
    * 监听设备方向变化事件。频率根据 wx.startDeviceMotionListening() 的 interval 参数。可以使用 wx.stopDeviceMotionListening() 停止监听。
    */
  def apply(callback: js.Function1[/* res */ Anon_Alpha, Unit]): Unit = js.native
}

