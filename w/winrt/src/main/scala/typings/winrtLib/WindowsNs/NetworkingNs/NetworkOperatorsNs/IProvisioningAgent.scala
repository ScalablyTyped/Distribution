package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProvisioningAgent extends js.Object {
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: java.lang.String): ProvisionedProfile
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProvisionFromXmlDocumentResults]
}

