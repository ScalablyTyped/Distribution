package typings.winrt.global.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
class ProvisioningAgent ()
  extends typings.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent {
  /* CompleteClass */
  override def getProvisionedProfile(mediaType: typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType, profileName: String): typings.winrt.Windows.Networking.NetworkOperators.ProvisionedProfile = js.native
  /* CompleteClass */
  override def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[
    typings.winrt.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults
  ] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
object ProvisioningAgent extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent = js.native
}

