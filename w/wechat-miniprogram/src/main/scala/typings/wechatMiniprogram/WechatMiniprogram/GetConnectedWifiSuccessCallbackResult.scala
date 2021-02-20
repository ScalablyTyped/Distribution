package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectedWifiSuccessCallbackResult extends StObject {
  
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
  implicit class GetConnectedWifiSuccessCallbackResultMutableBuilder[Self <: GetConnectedWifiSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifi(value: WifiInfo): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
  }
}
