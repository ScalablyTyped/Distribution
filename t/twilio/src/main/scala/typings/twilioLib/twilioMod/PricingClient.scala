package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "PricingClient")
@js.native
class PricingClient () extends Client {
  def this(sid: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, options: ClientOptions) = this()
  var messaging: PricingMessagingResource = js.native
  var phoneNumbers: PricingPhoneNumberResource = js.native
  var voice: PricingVoiceResource = js.native
}

