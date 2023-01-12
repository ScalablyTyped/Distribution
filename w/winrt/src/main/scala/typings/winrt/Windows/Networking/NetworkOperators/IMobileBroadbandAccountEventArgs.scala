package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandAccountEventArgs extends StObject {
  
  var networkAccountId: String
}
object IMobileBroadbandAccountEventArgs {
  
  inline def apply(networkAccountId: String): IMobileBroadbandAccountEventArgs = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccountEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMobileBroadbandAccountEventArgs] (val x: Self) extends AnyVal {
    
    inline def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
  }
}
