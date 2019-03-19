package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesSuccessData extends js.Object {
  /**
    * 该服务是否为主服务
    */
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object GetBLEDeviceServicesSuccessData {
  @scala.inline
  def apply(isPrimary: js.UndefOr[scala.Boolean] = js.undefined, uuid: java.lang.String = null): GetBLEDeviceServicesSuccessData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessData]
  }
}

