package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for the AccountAdded and AccountRemoved events. */
trait MobileBroadbandAccountEventArgs extends StObject {
  
  /** Gets the network account Id that was added or removed. */
  var networkAccountId: String
}
object MobileBroadbandAccountEventArgs {
  
  inline def apply(networkAccountId: String): MobileBroadbandAccountEventArgs = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccountEventArgs]
  }
  
  extension [Self <: MobileBroadbandAccountEventArgs](x: Self) {
    
    inline def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
  }
}
