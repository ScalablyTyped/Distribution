package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBluetoothDevicesDiscoverySuccess extends js.Object {
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}

object StopBluetoothDevicesDiscoverySuccess {
  @scala.inline
  def apply(errMsg: String = null): StopBluetoothDevicesDiscoverySuccess = {
    val __obj = js.Dynamic.literal()
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBluetoothDevicesDiscoverySuccess]
  }
}

