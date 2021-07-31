package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiFi extends StObject {
  
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.undefined
  
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.undefined
  
  /**
    * Wi-Fi 是否安全
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Wi-Fi 信号强度
    */
  var signalStrength: js.UndefOr[Double] = js.undefined
}
object WiFi {
  
  @scala.inline
  def apply(): WiFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFi]
  }
  
  @scala.inline
  implicit class WiFiMutableBuilder[Self <: WiFi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "signalStrength", js.undefined)
  }
}
