package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFi extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.undefined
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.undefined
  /**
    * Wi-Fi 是否安全
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * Wi-Fi 信号强度
    */
  var signalStrength: js.UndefOr[Double] = js.undefined
}

object WiFi {
  @scala.inline
  def apply(
    BSSID: String = null,
    SSID: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    signalStrength: js.UndefOr[Double] = js.undefined
  ): WiFi = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signalStrength)) __obj.updateDynamic("signalStrength")(signalStrength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFi]
  }
}

