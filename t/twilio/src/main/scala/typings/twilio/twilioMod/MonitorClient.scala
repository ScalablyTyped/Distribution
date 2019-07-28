package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "MonitorClient")
@js.native
class MonitorClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  var alerts: AlertResource = js.native
  var events: EventResource = js.native
}

