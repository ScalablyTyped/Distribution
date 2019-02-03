package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
class ProvisioningAgent () extends IProvisioningAgent {
  /* CompleteClass */
  override def getProvisionedProfile(mediaType: ProfileMediaType, profileName: java.lang.String): ProvisionedProfile = js.native
  /* CompleteClass */
  override def provisionFromXmlDocumentAsync(provisioningXmlDocument: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProvisionFromXmlDocumentResults] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
object ProvisioningAgent extends js.Object {
  def createFromNetworkAccountId(networkAccountId: java.lang.String): winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProvisioningAgent = js.native
}

