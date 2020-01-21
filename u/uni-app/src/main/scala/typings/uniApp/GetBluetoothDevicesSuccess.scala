package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothDevicesSuccess extends js.Object {
  /**
    * uuid 对应的的已连接设备列表
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.undefined
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}

object GetBluetoothDevicesSuccess {
  @scala.inline
  def apply(devices: js.Array[BluetoothDeviceInfo] = null, errMsg: String = null): GetBluetoothDevicesSuccess = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothDevicesSuccess]
  }
}

