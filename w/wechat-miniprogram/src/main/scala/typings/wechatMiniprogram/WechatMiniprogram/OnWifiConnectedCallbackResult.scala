package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnWifiConnectedCallbackResult extends js.Object {
  /** [WifiInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/WifiInfo.html)
    *
    * Wi-Fi 信息 */
  var wifi: WifiInfo = js.native
}

object OnWifiConnectedCallbackResult {
  @scala.inline
  def apply(wifi: WifiInfo): OnWifiConnectedCallbackResult = {
    val __obj = js.Dynamic.literal(wifi = wifi.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnWifiConnectedCallbackResult]
  }
  @scala.inline
  implicit class OnWifiConnectedCallbackResultOps[Self <: OnWifiConnectedCallbackResult] (val x: Self) extends AnyVal {
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
    def setWifi(value: WifiInfo): Self = this.set("wifi", value.asInstanceOf[js.Any])
  }
  
}

