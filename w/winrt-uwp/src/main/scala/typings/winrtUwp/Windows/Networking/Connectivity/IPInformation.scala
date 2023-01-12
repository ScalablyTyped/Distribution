package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the association between an IP address and an adapter on the network. */
trait IPInformation extends StObject {
  
  /** Retrieves the network adapter associated with the IP address. */
  var networkAdapter: NetworkAdapter
  
  /** Retrieves the length of the prefix, or network part of the IP address. */
  var prefixLength: Double
}
object IPInformation {
  
  inline def apply(networkAdapter: NetworkAdapter, prefixLength: Double): IPInformation = {
    val __obj = js.Dynamic.literal(networkAdapter = networkAdapter.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPInformation] (val x: Self) extends AnyVal {
    
    inline def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    inline def setPrefixLength(value: Double): Self = StObject.set(x, "prefixLength", value.asInstanceOf[js.Any])
  }
}
