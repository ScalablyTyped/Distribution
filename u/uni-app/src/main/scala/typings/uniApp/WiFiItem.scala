package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiFiItem extends StObject {
  
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.undefined
  
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.undefined
  
  /**
    * Wi-Fi 设备密码
    */
  var password: js.UndefOr[String] = js.undefined
}
object WiFiItem {
  
  @scala.inline
  def apply(): WiFiItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiItem]
  }
  
  @scala.inline
  implicit class WiFiItemMutableBuilder[Self <: WiFiItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
  }
}
