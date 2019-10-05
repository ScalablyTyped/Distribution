package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_X
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
  def apply(cb: js.Function1[/* res */ Anon_X, Unit]): Unit = js.native
}

