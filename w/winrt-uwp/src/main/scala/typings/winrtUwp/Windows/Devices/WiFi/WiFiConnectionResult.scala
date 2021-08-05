package typings.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the results of an attempt to connect to a Wi-Fi network. */
trait WiFiConnectionResult extends StObject {
  
  /** Gets the connection result value. */
  var connectionStatus: WiFiConnectionStatus
}
object WiFiConnectionResult {
  
  inline def apply(connectionStatus: WiFiConnectionStatus): WiFiConnectionResult = {
    val __obj = js.Dynamic.literal(connectionStatus = connectionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiConnectionResult]
  }
  
  extension [Self <: WiFiConnectionResult](x: Self) {
    
    inline def setConnectionStatus(value: WiFiConnectionStatus): Self = StObject.set(x, "connectionStatus", value.asInstanceOf[js.Any])
  }
}
