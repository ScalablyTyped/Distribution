package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedWifiRes extends js.Object {
  /**
    * 接口调用成功的回调函数
    */
  var wifi: js.UndefOr[WiFi] = js.undefined
}

object GetConnectedWifiRes {
  @scala.inline
  def apply(wifi: WiFi = null): GetConnectedWifiRes = {
    val __obj = js.Dynamic.literal()
    if (wifi != null) __obj.updateDynamic("wifi")(wifi)
    __obj.asInstanceOf[GetConnectedWifiRes]
  }
}

