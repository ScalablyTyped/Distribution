package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWifiList_ extends js.Object {
  /** Wi-Fi 设备bssid */
  var BSSID: String
  /** Wi-Fi 设备ssid */
  var SSID: String
  /** Wi-Fi 设备密码 */
  var password: String
}

object SetWifiList_ {
  @scala.inline
  def apply(BSSID: String, SSID: String, password: String): SetWifiList_ = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetWifiList_]
  }
}

