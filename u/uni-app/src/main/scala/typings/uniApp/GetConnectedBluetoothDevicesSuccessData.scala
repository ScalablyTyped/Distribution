package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesSuccessData extends js.Object {
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[String] = js.undefined
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[String] = js.undefined
}

object GetConnectedBluetoothDevicesSuccessData {
  @scala.inline
  def apply(deviceId: String = null, name: String = null): GetConnectedBluetoothDevicesSuccessData = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessData]
  }
}

