package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningAgent extends IProvisioningAgent

object ProvisioningAgent {
  @scala.inline
  def apply(
    getProvisionedProfile: (ProfileMediaType, String) => ProvisionedProfile,
    provisionFromXmlDocumentAsync: String => IAsyncOperation[ProvisionFromXmlDocumentResults]
  ): ProvisioningAgent = {
    val __obj = js.Dynamic.literal(getProvisionedProfile = js.Any.fromFunction2(getProvisionedProfile), provisionFromXmlDocumentAsync = js.Any.fromFunction1(provisionFromXmlDocumentAsync))
    __obj.asInstanceOf[ProvisioningAgent]
  }
}

