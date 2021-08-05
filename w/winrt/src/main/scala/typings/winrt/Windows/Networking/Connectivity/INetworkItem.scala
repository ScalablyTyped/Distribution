package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkItem extends StObject {
  
  def getNetworkTypes(): NetworkTypes
  
  var networkId: String
}
object INetworkItem {
  
  inline def apply(getNetworkTypes: () => NetworkTypes, networkId: String): INetworkItem = {
    val __obj = js.Dynamic.literal(getNetworkTypes = js.Any.fromFunction0(getNetworkTypes), networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkItem]
  }
  
  extension [Self <: INetworkItem](x: Self) {
    
    inline def setGetNetworkTypes(value: () => NetworkTypes): Self = StObject.set(x, "getNetworkTypes", js.Any.fromFunction0(value))
    
    inline def setNetworkId(value: String): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
  }
}
