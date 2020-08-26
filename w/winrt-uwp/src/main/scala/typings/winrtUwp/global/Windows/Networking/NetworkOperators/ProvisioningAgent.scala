package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an agent that provisions connectivity and subscription information with a network provider. */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
/** Creates a new instance of a ProvisioningAgent . */
class ProvisioningAgent ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisioningAgent

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
object ProvisioningAgent extends js.Object {
  /**
    * Creates a provisioning agent for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the provisioning agent.
    * @return The provisioning agent for the mobile device associated with the supplied network account ID.
    */
  def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisioningAgent = js.native
}

