package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWifiList extends StObject {
  
  /** Wi-Fi 设备bssid */
  var BSSID: String
  
  /** Wi-Fi 设备ssid */
  var SSID: String
  
  /** Wi-Fi 设备密码 */
  var password: String
}
object SetWifiList {
  
  inline def apply(BSSID: String, SSID: String, password: String): SetWifiList = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWifiList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetWifiList] (val x: Self) extends AnyVal {
    
    inline def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
  }
}
