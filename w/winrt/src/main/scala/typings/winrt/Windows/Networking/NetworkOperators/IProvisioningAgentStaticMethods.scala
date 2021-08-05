package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProvisioningAgentStaticMethods extends StObject {
  
  def createFromNetworkAccountId(networkAccountId: String): ProvisioningAgent
}
object IProvisioningAgentStaticMethods {
  
  inline def apply(createFromNetworkAccountId: String => ProvisioningAgent): IProvisioningAgentStaticMethods = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
    __obj.asInstanceOf[IProvisioningAgentStaticMethods]
  }
  
  extension [Self <: IProvisioningAgentStaticMethods](x: Self) {
    
    inline def setCreateFromNetworkAccountId(value: String => ProvisioningAgent): Self = StObject.set(x, "createFromNetworkAccountId", js.Any.fromFunction1(value))
  }
}
