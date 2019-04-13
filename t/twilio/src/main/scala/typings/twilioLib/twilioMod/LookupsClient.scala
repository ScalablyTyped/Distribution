package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "LookupsClient")
@js.native
class LookupsClient () extends Client {
  def this(sid: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, options: ClientOptions) = this()
  @JSName("phoneNumbers")
  var phoneNumbers_Original: PhoneNumberResource = js.native
  def phoneNumbers(resourceSid: java.lang.String): PhoneNumberInstance = js.native
}

