package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanIdentifier extends StObject {
  
  var infrastructureId: LanIdentifierData = js.native
  
  var networkAdapterId: String = js.native
  
  var portId: LanIdentifierData = js.native
}
object ILanIdentifier {
  
  @scala.inline
  def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): ILanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifier]
  }
  
  @scala.inline
  implicit class ILanIdentifierMutableBuilder[Self <: ILanIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfrastructureId(value: LanIdentifierData): Self = StObject.set(x, "infrastructureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAdapterId(value: String): Self = StObject.set(x, "networkAdapterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortId(value: LanIdentifierData): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
  }
}
