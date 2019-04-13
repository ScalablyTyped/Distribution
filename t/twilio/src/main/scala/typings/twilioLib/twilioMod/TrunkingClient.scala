package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "TrunkingClient")
@js.native
class TrunkingClient () extends Client {
  def this(sid: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, options: ClientOptions) = this()
  var trunks: TrunkResource = js.native
}

