package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about a tethering client. */
trait NetworkOperatorTetheringClient extends StObject {
  
  /** Gets a list of hostnames used by this tethering client. */
  var hostNames: IVectorView[HostName]
  
  /** Gets the MAC address of this tethering client. */
  var macAddress: String
}
object NetworkOperatorTetheringClient {
  
  inline def apply(hostNames: IVectorView[HostName], macAddress: String): NetworkOperatorTetheringClient = {
    val __obj = js.Dynamic.literal(hostNames = hostNames.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringClient]
  }
  
  extension [Self <: NetworkOperatorTetheringClient](x: Self) {
    
    inline def setHostNames(value: IVectorView[HostName]): Self = StObject.set(x, "hostNames", value.asInstanceOf[js.Any])
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
  }
}
