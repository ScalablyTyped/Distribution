package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisioningAgentStaticMethods extends js.Object {
  def createFromNetworkAccountId(networkAccountId: java.lang.String): ProvisioningAgent
}

object IProvisioningAgentStaticMethods {
  @scala.inline
  def apply(createFromNetworkAccountId: js.Function1[java.lang.String, ProvisioningAgent]): IProvisioningAgentStaticMethods = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = createFromNetworkAccountId)
  
    __obj.asInstanceOf[IProvisioningAgentStaticMethods]
  }
}

