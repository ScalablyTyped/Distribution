package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFi extends js.Object {
  /** Wi-Fi 的BSSID */
  var BSSID: java.lang.String
  /** Wi-Fi 的SSID */
  var SSID: java.lang.String
  /** Wi-Fi 是否安全 */
  var secure: scala.Boolean
  /** Wi-Fi 信号强度 */
  var signalStrength: scala.Double
}

object WiFi {
  @scala.inline
  def apply(
    BSSID: java.lang.String,
    SSID: java.lang.String,
    secure: scala.Boolean,
    signalStrength: scala.Double
  ): WiFi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BSSID")(BSSID)
    __obj.updateDynamic("SSID")(SSID)
    __obj.updateDynamic("secure")(secure)
    __obj.updateDynamic("signalStrength")(signalStrength)
    __obj.asInstanceOf[WiFi]
  }
}

