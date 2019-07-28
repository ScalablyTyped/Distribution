package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----蓝牙
trait OpenBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: js.Any): Unit
}

object OpenBluetoothAdapterOptions {
  @scala.inline
  def apply(success: js.Any => Unit, complete: /* res */ js.Any => Unit = null, fail: js.Any => Unit = null): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
}

