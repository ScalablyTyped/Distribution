package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedWifiOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetConnectedWifiOptions(wifi: WiFi): Unit
}

object GetConnectedWifiOptions {
  @scala.inline
  def apply(success: WiFi => Unit, complete: /* res */ js.Any => Unit = null, fail: js.Any => Unit = null): GetConnectedWifiOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetConnectedWifiOptions]
  }
}

