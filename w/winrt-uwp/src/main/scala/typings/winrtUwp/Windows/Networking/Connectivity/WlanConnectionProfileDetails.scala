package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to access information specific to a WLAN connection. */
trait WlanConnectionProfileDetails extends StObject {
  
  /**
    * Retrieves the Service Set Identifier (SSID) for a WLAN connection.
    * @return The service set identifier (SSID).
    */
  def getConnectedSsid(): String
}
object WlanConnectionProfileDetails {
  
  inline def apply(getConnectedSsid: () => String): WlanConnectionProfileDetails = {
    val __obj = js.Dynamic.literal(getConnectedSsid = js.Any.fromFunction0(getConnectedSsid))
    __obj.asInstanceOf[WlanConnectionProfileDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WlanConnectionProfileDetails] (val x: Self) extends AnyVal {
    
    inline def setGetConnectedSsid(value: () => String): Self = StObject.set(x, "getConnectedSsid", js.Any.fromFunction0(value))
  }
}
