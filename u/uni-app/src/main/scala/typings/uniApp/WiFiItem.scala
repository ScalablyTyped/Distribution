package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiFiItem extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 设备密码
    */
  var password: js.UndefOr[String] = js.native
}

object WiFiItem {
  @scala.inline
  def apply(): WiFiItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiItem]
  }
  @scala.inline
  implicit class WiFiItemOps[Self <: WiFiItem] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
  
}

