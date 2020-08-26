package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWifiListOptions extends js.Object {
  /** Wi-Fi 列表数据 */
  var wifiList: js.Array[WiFi] = js.native
}

object GetWifiListOptions {
  @scala.inline
  def apply(wifiList: js.Array[WiFi]): GetWifiListOptions = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWifiListOptions]
  }
  @scala.inline
  implicit class GetWifiListOptionsOps[Self <: GetWifiListOptions] (val x: Self) extends AnyVal {
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
    def setWifiListVarargs(value: WiFi*): Self = this.set("wifiList", js.Array(value :_*))
    @scala.inline
    def setWifiList(value: js.Array[WiFi]): Self = this.set("wifiList", value.asInstanceOf[js.Any])
  }
  
}

