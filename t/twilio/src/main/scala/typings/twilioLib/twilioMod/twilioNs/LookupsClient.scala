package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupsClient extends Client {
  @JSName("phoneNumbers")
  var phoneNumbers_Original: PhoneNumberResource = js.native
  def phoneNumbers(resourceSid: java.lang.String): PhoneNumberInstance = js.native
}

