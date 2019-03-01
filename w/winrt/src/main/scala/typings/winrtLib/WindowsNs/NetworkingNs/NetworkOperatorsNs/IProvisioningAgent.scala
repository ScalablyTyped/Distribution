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
    getProvisionedProfile: js.Function2[ProfileMediaType, java.lang.String, ProvisionedProfile],
    provisionFromXmlDocumentAsync: js.Function1[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProvisionFromXmlDocumentResults]
    ]
  ): IProvisioningAgent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getProvisionedProfile")(getProvisionedProfile)
    __obj.updateDynamic("provisionFromXmlDocumentAsync")(provisionFromXmlDocumentAsync)
    __obj.asInstanceOf[IProvisioningAgent]
  }
}

