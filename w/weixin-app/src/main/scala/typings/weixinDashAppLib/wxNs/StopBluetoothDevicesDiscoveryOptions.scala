package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBluetoothDevicesDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MStopBluetoothDevicesDiscoveryOptions(res: ErrMsgResponse): scala.Unit
}

object StopBluetoothDevicesDiscoveryOptions {
  @scala.inline
  def apply(
    success: js.Function1[ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): StopBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[StopBluetoothDevicesDiscoveryOptions]
  }
}

