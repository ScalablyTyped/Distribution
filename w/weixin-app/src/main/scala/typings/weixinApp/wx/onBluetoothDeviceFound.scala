package typings.weixinApp.wx

import typings.weixinApp.AnonDevices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onBluetoothDeviceFound")
@js.native
object onBluetoothDeviceFound extends js.Object {
  /**
  	 * 监听寻找到新设备的事件
  	 * @version 1.1.0
  	 */
  def apply(callback: js.Function1[/* res */ AnonDevices, Unit]): Unit = js.native
}

