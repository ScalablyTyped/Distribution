package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connected network. */
trait NetworkItem extends StObject {
  
  /**
    * Gets a NetworkTypes value indicating the network type for a NetworkItem .
    * @return The type of a network.
    */
  def getNetworkTypes(): NetworkTypes
  
  /** Gets the network ID. */
  var networkId: String
}
object NetworkItem {
  
  inline def apply(getNetworkTypes: () => NetworkTypes, networkId: String): NetworkItem = {
    val __obj = js.Dynamic.literal(getNetworkTypes = js.Any.fromFunction0(getNetworkTypes), networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkItem]
  }
  
  extension [Self <: NetworkItem](x: Self) {
    
    inline def setGetNetworkTypes(value: () => NetworkTypes): Self = StObject.set(x, "getNetworkTypes", js.Any.fromFunction0(value))
    
    inline def setNetworkId(value: String): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
  }
}
