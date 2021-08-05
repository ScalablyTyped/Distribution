package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiFi extends StObject {
  
  /** Wi-Fi 的BSSID */
  var BSSID: String
  
  /** Wi-Fi 的SSID */
  var SSID: String
  
  /** Wi-Fi 是否安全 */
  var secure: Boolean
  
  /** Wi-Fi 信号强度 */
  var signalStrength: Double
}
object WiFi {
  
  inline def apply(BSSID: String, SSID: String, secure: Boolean, signalStrength: Double): WiFi = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFi]
  }
  
  extension [Self <: WiFi](x: Self) {
    
    inline def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    inline def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
  }
}
