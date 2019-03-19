package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBluetoothDevicesDiscoverySuccess extends js.Object {
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
}

object StopBluetoothDevicesDiscoverySuccess {
  @scala.inline
  def apply(errMsg: java.lang.String = null): StopBluetoothDevicesDiscoverySuccess = {
    val __obj = js.Dynamic.literal()
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[StopBluetoothDevicesDiscoverySuccess]
  }
}

