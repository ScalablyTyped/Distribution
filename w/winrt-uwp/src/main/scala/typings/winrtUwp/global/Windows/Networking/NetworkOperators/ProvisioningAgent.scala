package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an agent that provisions connectivity and subscription information with a network provider. */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
/** Creates a new instance of a ProvisioningAgent . */
class ProvisioningAgent ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisioningAgent
object ProvisioningAgent {
  
  /**
    * Creates a provisioning agent for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the provisioning agent.
    * @return The provisioning agent for the mobile device associated with the supplied network account ID.
    */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent.createFromNetworkAccountId")
  @js.native
  def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisioningAgent = js.native
}
