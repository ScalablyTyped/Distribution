package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisioningAgent extends js.Object {
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: java.lang.String): ProvisionedProfile
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProvisionFromXmlDocumentResults]
}

object IProvisioningAgent {
  @scala.inline
  def apply(
    getProvisionedProfile: (ProfileMediaType, java.lang.String) => ProvisionedProfile,
    provisionFromXmlDocumentAsync: java.lang.String => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProvisionFromXmlDocumentResults]
  ): IProvisioningAgent = {
    val __obj = js.Dynamic.literal(getProvisionedProfile = js.Any.fromFunction2(getProvisionedProfile), provisionFromXmlDocumentAsync = js.Any.fromFunction1(provisionFromXmlDocumentAsync))
  
    __obj.asInstanceOf[IProvisioningAgent]
  }
}

