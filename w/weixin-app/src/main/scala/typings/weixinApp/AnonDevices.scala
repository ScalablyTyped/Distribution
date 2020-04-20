package typings.weixinApp

import typings.weixinApp.wx.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDevices extends js.Object {
  var devices: js.Array[BluetoothDevice]
}

object AnonDevices {
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice]): AnonDevices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDevices]
  }
}

