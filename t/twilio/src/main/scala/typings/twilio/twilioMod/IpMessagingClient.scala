package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "IpMessagingClient")
@js.native
class IpMessagingClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  var credentials: CredentialResource = js.native
  var services: ServiceResource = js.native
}

