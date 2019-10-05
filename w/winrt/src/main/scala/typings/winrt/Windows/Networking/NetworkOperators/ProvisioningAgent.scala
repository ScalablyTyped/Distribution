package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
class ProvisioningAgent () extends IProvisioningAgent {
  /* CompleteClass */
  override def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): ProvisionedProfile = js.native
  /* CompleteClass */
  override def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[ProvisionFromXmlDocumentResults] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
object ProvisioningAgent extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): ProvisioningAgent = js.native
}

