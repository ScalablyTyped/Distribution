package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrunkInstance extends InstanceResource {
  var credentialLists: CredentialListResource = js.native
  var ipAccessControlLists: IPAccessControlListResource = js.native
  var originationUrls: OriginationURLResource = js.native
  @JSName("phoneNumbers")
  var phoneNumbers_Original: PhoneNumberResource = js.native
  def phoneNumbers(resourceSid: java.lang.String): PhoneNumberInstance = js.native
}

