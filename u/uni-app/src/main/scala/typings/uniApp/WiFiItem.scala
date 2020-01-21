package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFiItem extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.undefined
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.undefined
  /**
    * Wi-Fi 设备密码
    */
  var password: js.UndefOr[String] = js.undefined
}

object WiFiItem {
  @scala.inline
  def apply(BSSID: String = null, SSID: String = null, password: String = null): WiFiItem = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiItem]
  }
}

