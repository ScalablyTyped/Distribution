package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesSuccess extends js.Object {
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 设备服务列表
    */
  var services: js.UndefOr[js.Array[GetBLEDeviceServicesSuccessData]] = js.undefined
}

object GetBLEDeviceServicesSuccess {
  @scala.inline
  def apply(errMsg: String = null, services: js.Array[GetBLEDeviceServicesSuccessData] = null): GetBLEDeviceServicesSuccess = {
    val __obj = js.Dynamic.literal()
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesSuccess]
  }
}

