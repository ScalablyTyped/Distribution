package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "TrunkingClient")
@js.native
class TrunkingClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  var trunks: TrunkResource = js.native
}

