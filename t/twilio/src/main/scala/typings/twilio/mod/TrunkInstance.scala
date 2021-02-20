package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrunkInstance extends InstanceResource {
  
  var credentialLists: CredentialListResource = js.native
  
  var ipAccessControlLists: IPAccessControlListResource = js.native
  
  var originationUrls: OriginationURLResource = js.native
  
  def phoneNumbers(resourceSid: String): PhoneNumberInstance = js.native
  @JSName("phoneNumbers")
  var phoneNumbers_Original: PhoneNumberResource = js.native
}
