package typings.weixinApp.anon

import typings.weixinApp.wx.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Devices extends js.Object {
  var devices: js.Array[BluetoothDevice]
}

object Devices {
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
}

