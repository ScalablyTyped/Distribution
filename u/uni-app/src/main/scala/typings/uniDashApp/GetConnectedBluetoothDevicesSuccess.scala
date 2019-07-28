package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesSuccess extends js.Object {
  /**
    * 搜索到的设备列表
    */
  var devices: js.UndefOr[js.Array[GetConnectedBluetoothDevicesSuccessData]] = js.undefined
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}

object GetConnectedBluetoothDevicesSuccess {
  @scala.inline
  def apply(devices: js.Array[GetConnectedBluetoothDevicesSuccessData] = null, errMsg: String = null): GetConnectedBluetoothDevicesSuccess = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccess]
  }
}

