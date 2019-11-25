package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBluetoothDeviceFoundResult extends js.Object {
  /**
    * 设备列表信息
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.undefined
}

object OnBluetoothDeviceFoundResult {
  @scala.inline
  def apply(devices: js.Array[BluetoothDeviceInfo] = null): OnBluetoothDeviceFoundResult = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothDeviceFoundResult]
  }
}

