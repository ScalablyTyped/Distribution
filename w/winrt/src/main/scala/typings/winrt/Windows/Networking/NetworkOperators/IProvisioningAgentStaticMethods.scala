package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvisioningAgentStaticMethods extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): ProvisioningAgent = js.native
}

object IProvisioningAgentStaticMethods {
  @scala.inline
  def apply(createFromNetworkAccountId: String => ProvisioningAgent): IProvisioningAgentStaticMethods = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
    __obj.asInstanceOf[IProvisioningAgentStaticMethods]
  }
  @scala.inline
  implicit class IProvisioningAgentStaticMethodsOps[Self <: IProvisioningAgentStaticMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateFromNetworkAccountId(value: String => ProvisioningAgent): Self = this.set("createFromNetworkAccountId", js.Any.fromFunction1(value))
  }
  
}

