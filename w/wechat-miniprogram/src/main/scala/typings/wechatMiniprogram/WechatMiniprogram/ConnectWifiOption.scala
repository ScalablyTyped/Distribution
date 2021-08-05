package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectWifiOption extends StObject {
  
  /** Wi-Fi 设备 BSSID */
  var BSSID: js.UndefOr[String] = js.undefined
  
  /** Wi-Fi 设备 SSID */
  var SSID: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ConnectWifiCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ConnectWifiFailCallback] = js.undefined
  
  /** 跳转到系统设置页进行连接，仅安卓生效
    *
    * 最低基础库： `2.12.0` */
  var maunal: js.UndefOr[Boolean] = js.undefined
  
  /** Wi-Fi 设备密码 */
  var password: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ConnectWifiSuccessCallback] = js.undefined
}
object ConnectWifiOption {
  
  inline def apply(SSID: String, password: String): ConnectWifiOption = {
    val __obj = js.Dynamic.literal(SSID = SSID.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectWifiOption]
  }
  
  extension [Self <: ConnectWifiOption](x: Self) {
    
    inline def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    inline def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    inline def setComplete(value: /* res */ WifiError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ WifiError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMaunal(value: Boolean): Self = StObject.set(x, "maunal", value.asInstanceOf[js.Any])
    
    inline def setMaunalUndefined: Self = StObject.set(x, "maunal", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ WifiError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
