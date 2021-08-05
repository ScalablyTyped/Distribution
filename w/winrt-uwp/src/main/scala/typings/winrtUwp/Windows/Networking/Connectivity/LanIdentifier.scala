package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents physical identification data for a specific NetworkAdapter object. */
trait LanIdentifier extends StObject {
  
  /** Gets a LanIdentifierData object containing locality identification information for the network adapter's connection. */
  var infrastructureId: LanIdentifierData
  
  /** Gets the adapter GUID that identifies the network adapter to associate with the locality information. */
  var networkAdapterId: String
  
  /** Gets a LanIdentifierData object containing the port ID from the Link Layer Discovery Protocol (LLDP) locality information for an Ethernet type network adapter. */
  var portId: LanIdentifierData
}
object LanIdentifier {
  
  inline def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): LanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanIdentifier]
  }
  
  extension [Self <: LanIdentifier](x: Self) {
    
    inline def setInfrastructureId(value: LanIdentifierData): Self = StObject.set(x, "infrastructureId", value.asInstanceOf[js.Any])
    
    inline def setNetworkAdapterId(value: String): Self = StObject.set(x, "networkAdapterId", value.asInstanceOf[js.Any])
    
    inline def setPortId(value: LanIdentifierData): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
  }
}
