package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "LookupsClient")
@js.native
class LookupsClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  @JSName("phoneNumbers")
  var phoneNumbers_Original: PhoneNumberResource = js.native
  def phoneNumbers(resourceSid: String): PhoneNumberInstance = js.native
}

