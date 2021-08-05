package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 提供预设的 Wi-Fi 信息列表 */
trait WifiData extends StObject {
  
  /** Wi-Fi 的 BSSID */
  var BSSID: js.UndefOr[String] = js.undefined
  
  /** Wi-Fi 的 SSID */
  var SSID: js.UndefOr[String] = js.undefined
  
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[String] = js.undefined
}
object WifiData {
  
  inline def apply(): WifiData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WifiData]
  }
  
  extension [Self <: WifiData](x: Self) {
    
    inline def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    inline def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    inline def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
  }
}
