package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 getDevices 接口
  		 */
  var deviceId: java.lang.String
  /**
  		 * 成功则返回本机蓝牙适配器状态
  		 */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: weixinDashAppLib.Anon_Services with ErrMsgResponse): scala.Unit
}

object GetBLEDeviceServicesOptions {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    success: js.Function1[weixinDashAppLib.Anon_Services with ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
}

