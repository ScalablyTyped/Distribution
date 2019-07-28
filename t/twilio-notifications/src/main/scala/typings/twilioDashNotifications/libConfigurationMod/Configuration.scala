package typings.twilioDashNotifications.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/configuration", "Configuration")
@js.native
class Configuration protected () extends js.Object {
  def this(token: String) = this()
  def this(token: String, options: js.Any) = this()
  var _token: js.Any = js.native
  val registrarUrl: String = js.native
  val token: String = js.native
  def updateToken(token: String): Unit = js.native
}

