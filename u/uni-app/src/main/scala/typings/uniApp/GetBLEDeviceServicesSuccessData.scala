package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesSuccessData extends js.Object {
  /**
    * 该服务是否为主服务
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object GetBLEDeviceServicesSuccessData {
  @scala.inline
  def apply(isPrimary: js.UndefOr[Boolean] = js.undefined, uuid: String = null): GetBLEDeviceServicesSuccessData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessData]
  }
}

