package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProvisioningAgentStaticMethods extends StObject {
  
  def createFromNetworkAccountId(networkAccountId: String): ProvisioningAgent = js.native
}
object IProvisioningAgentStaticMethods {
  
  @scala.inline
  def apply(createFromNetworkAccountId: String => ProvisioningAgent): IProvisioningAgentStaticMethods = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
    __obj.asInstanceOf[IProvisioningAgentStaticMethods]
  }
  
  @scala.inline
  implicit class IProvisioningAgentStaticMethodsMutableBuilder[Self <: IProvisioningAgentStaticMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFromNetworkAccountId(value: String => ProvisioningAgent): Self = StObject.set(x, "createFromNetworkAccountId", js.Any.fromFunction1(value))
  }
}
