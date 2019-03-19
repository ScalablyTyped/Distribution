package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFi extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wi-Fi 是否安全
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Wi-Fi 信号强度
    */
  var signalStrength: js.UndefOr[scala.Double] = js.undefined
}

object WiFi {
  @scala.inline
  def apply(
    BSSID: java.lang.String = null,
    SSID: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    signalStrength: scala.Int | scala.Double = null
  ): WiFi = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID)
    if (SSID != null) __obj.updateDynamic("SSID")(SSID)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (signalStrength != null) __obj.updateDynamic("signalStrength")(signalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFi]
  }
}

