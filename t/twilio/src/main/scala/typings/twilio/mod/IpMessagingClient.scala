package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "IpMessagingClient")
@js.native
class IpMessagingClient () extends Client {
  def this(sid: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, options: ClientOptions) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  var credentials: CredentialResource = js.native
  var services: ServiceResource = js.native
}

