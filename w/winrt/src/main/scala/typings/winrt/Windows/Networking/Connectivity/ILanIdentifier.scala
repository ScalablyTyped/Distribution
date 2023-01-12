package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanIdentifier extends StObject {
  
  var infrastructureId: LanIdentifierData
  
  var networkAdapterId: String
  
  var portId: LanIdentifierData
}
object ILanIdentifier {
  
  inline def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): ILanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILanIdentifier] (val x: Self) extends AnyVal {
    
    inline def setInfrastructureId(value: LanIdentifierData): Self = StObject.set(x, "infrastructureId", value.asInstanceOf[js.Any])
    
    inline def setNetworkAdapterId(value: String): Self = StObject.set(x, "networkAdapterId", value.asInstanceOf[js.Any])
    
    inline def setPortId(value: LanIdentifierData): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
  }
}
