package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectWifiOption extends StObject {
  
  /** Wi-Fi 设备 BSSID */
  var BSSID: js.UndefOr[String] = js.native
  
  /** Wi-Fi 设备 SSID */
  var SSID: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ConnectWifiCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ConnectWifiFailCallback] = js.native
  
  /** 跳转到系统设置页进行连接，仅安卓生效
    *
    * 最低基础库： `2.12.0` */
  var maunal: js.UndefOr[Boolean] = js.native
  
  /** Wi-Fi 设备密码 */
  var password: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ConnectWifiSuccessCallback] = js.native
}
object ConnectWifiOption {
  
  @scala.inline
  def apply(SSID: String, password: String): ConnectWifiOption = {
    val __obj = js.Dynamic.literal(SSID = SSID.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectWifiOption]
  }
  
  @scala.inline
  implicit class ConnectWifiOptionMutableBuilder[Self <: ConnectWifiOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ WifiError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ WifiError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMaunal(value: Boolean): Self = StObject.set(x, "maunal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaunalUndefined: Self = StObject.set(x, "maunal", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ WifiError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
