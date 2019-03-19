package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFiItem extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wi-Fi 设备密码
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object WiFiItem {
  @scala.inline
  def apply(BSSID: java.lang.String = null, SSID: java.lang.String = null, password: java.lang.String = null): WiFiItem = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID)
    if (SSID != null) __obj.updateDynamic("SSID")(SSID)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[WiFiItem]
  }
}

