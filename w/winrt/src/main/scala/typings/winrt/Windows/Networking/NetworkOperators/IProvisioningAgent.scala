package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisioningAgent extends js.Object {
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): ProvisionedProfile
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[ProvisionFromXmlDocumentResults]
}

object IProvisioningAgent {
  @scala.inline
  def apply(
    getProvisionedProfile: (ProfileMediaType, String) => ProvisionedProfile,
    provisionFromXmlDocumentAsync: String => IAsyncOperation[ProvisionFromXmlDocumentResults]
  ): IProvisioningAgent = {
    val __obj = js.Dynamic.literal(getProvisionedProfile = js.Any.fromFunction2(getProvisionedProfile), provisionFromXmlDocumentAsync = js.Any.fromFunction1(provisionFromXmlDocumentAsync))
    __obj.asInstanceOf[IProvisioningAgent]
  }
}

