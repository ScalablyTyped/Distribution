package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceCharacteristicsSuccessData extends js.Object {
  /**
    * 该特征值支持的操作类型
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object GetBLEDeviceCharacteristicsSuccessData {
  @scala.inline
  def apply(properties: js.Any = null, uuid: java.lang.String = null): GetBLEDeviceCharacteristicsSuccessData = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessData]
  }
}

