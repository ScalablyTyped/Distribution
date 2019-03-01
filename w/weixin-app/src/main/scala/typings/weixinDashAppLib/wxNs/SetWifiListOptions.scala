package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWifiListOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 提供预设的 Wi-Fi 信息列表 */
  var wifiList: js.Array[SetWifiList]
}

object SetWifiListOptions {
  @scala.inline
  def apply(
    wifiList: js.Array[SetWifiList],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetWifiListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wifiList")(wifiList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetWifiListOptions]
  }
}

