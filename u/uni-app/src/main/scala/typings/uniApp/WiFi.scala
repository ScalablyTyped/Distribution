package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiFi extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 是否安全
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Wi-Fi 信号强度
    */
  var signalStrength: js.UndefOr[Double] = js.native
}

object WiFi {
  @scala.inline
  def apply(): WiFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFi]
  }
  @scala.inline
  implicit class WiFiOps[Self <: WiFi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBSSID(value: String): Self = this.set("BSSID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBSSID: Self = this.set("BSSID", js.undefined)
    @scala.inline
    def setSSID(value: String): Self = this.set("SSID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSID: Self = this.set("SSID", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSignalStrength(value: Double): Self = this.set("signalStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalStrength: Self = this.set("signalStrength", js.undefined)
  }
  
}

