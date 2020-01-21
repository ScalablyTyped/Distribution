package typings.wegameApi.wx

import typings.wegameApi.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onAccelerometerChange")
@js.native
object onAccelerometerChange extends js.Object {
  // --加速计
  /**
    * 监听加速度数据，频率：5次/秒，接口调用后会自动开始监听，可使用 wx.stopAccelerometer 停止监听。
    */
  def apply(cb: js.Function1[/* res */ AnonX, Unit]): Unit = js.native
}

