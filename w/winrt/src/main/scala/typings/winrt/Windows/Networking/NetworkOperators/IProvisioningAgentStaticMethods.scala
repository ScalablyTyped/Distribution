package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisioningAgentStaticMethods extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): ProvisioningAgent
}

object IProvisioningAgentStaticMethods {
  @scala.inline
  def apply(createFromNetworkAccountId: String => ProvisioningAgent): IProvisioningAgentStaticMethods = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
  
    __obj.asInstanceOf[IProvisioningAgentStaticMethods]
  }
}

