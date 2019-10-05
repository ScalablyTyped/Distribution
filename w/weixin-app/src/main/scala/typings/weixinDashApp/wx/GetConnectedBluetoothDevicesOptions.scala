package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_Devices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.Array[String]
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: Anon_Devices with ErrMsgResponse): Unit
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    services: js.Array[String],
    success: Anon_Devices with ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

