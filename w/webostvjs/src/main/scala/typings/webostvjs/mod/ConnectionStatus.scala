package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStatus extends StObject {
  
  /**
    * Indicates whether the internet connection is available.
    * - true: The internet connection is available.
    * - false: The internet connection is unavailable.
    */
  var isInternetConnectionAvailable: Boolean
  
  /**
    * The object that contains information about the state of the WiFi connection.
    */
  var wifi: WifiStatus
  
  /**
    * The object that contains information about the state of the WiFi direct connection.
    */
  var wifiDirect: WifiDirectStatus
  
  /**
    * The object that contains information about the state of the wired connection.
    */
  var wired: WiredStatus
}
object ConnectionStatus {
  
  inline def apply(
    isInternetConnectionAvailable: Boolean,
    wifi: WifiStatus,
    wifiDirect: WifiDirectStatus,
    wired: WiredStatus
  ): ConnectionStatus = {
    val __obj = js.Dynamic.literal(isInternetConnectionAvailable = isInternetConnectionAvailable.asInstanceOf[js.Any], wifi = wifi.asInstanceOf[js.Any], wifiDirect = wifiDirect.asInstanceOf[js.Any], wired = wired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  
  extension [Self <: ConnectionStatus](x: Self) {
    
    inline def setIsInternetConnectionAvailable(value: Boolean): Self = StObject.set(x, "isInternetConnectionAvailable", value.asInstanceOf[js.Any])
    
    inline def setWifi(value: WifiStatus): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
    
    inline def setWifiDirect(value: WifiDirectStatus): Self = StObject.set(x, "wifiDirect", value.asInstanceOf[js.Any])
    
    inline def setWired(value: WiredStatus): Self = StObject.set(x, "wired", value.asInstanceOf[js.Any])
  }
}
