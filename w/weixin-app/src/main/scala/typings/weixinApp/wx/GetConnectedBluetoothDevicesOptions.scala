package typings.weixinApp.wx

import typings.weixinApp.devicesArrayBluetoothDevi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.Array[String]
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    services: js.Array[String],
    success: devicesArrayBluetoothDevi => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

