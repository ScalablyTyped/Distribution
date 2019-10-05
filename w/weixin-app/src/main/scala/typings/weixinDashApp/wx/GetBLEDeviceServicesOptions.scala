package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_Services
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 getDevices 接口
  		 */
  var deviceId: String
  /**
  		 * 成功则返回本机蓝牙适配器状态
  		 */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: Anon_Services with ErrMsgResponse): Unit
}

object GetBLEDeviceServicesOptions {
  @scala.inline
  def apply(
    deviceId: String,
    success: Anon_Services with ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
}

