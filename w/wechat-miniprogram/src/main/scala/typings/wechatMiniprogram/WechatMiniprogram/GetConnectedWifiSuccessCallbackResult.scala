package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedWifiSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** [WifiInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/WifiInfo.html)
    *
    * Wi-Fi 信息 */
  var wifi: WifiInfo = js.native
}

object GetConnectedWifiSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, wifi: WifiInfo): GetConnectedWifiSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], wifi = wifi.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectedWifiSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetConnectedWifiSuccessCallbackResultOps[Self <: GetConnectedWifiSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setWifi(value: WifiInfo): Self = this.set("wifi", value.asInstanceOf[js.Any])
  }
  
}

