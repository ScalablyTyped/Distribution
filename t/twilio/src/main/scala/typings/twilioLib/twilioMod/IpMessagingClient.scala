package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "IpMessagingClient")
@js.native
class IpMessagingClient () extends Client {
  def this(sid: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, options: ClientOptions) = this()
  var credentials: CredentialResource = js.native
  var services: ServiceResource = js.native
}

