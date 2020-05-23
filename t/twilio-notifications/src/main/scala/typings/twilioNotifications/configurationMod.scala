package typings.twilioNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  @js.native
  class Configuration protected () extends js.Object {
    def this(token: String) = this()
    def this(token: String, options: js.Any) = this()
    var _token: js.Any = js.native
    val registrarUrl: String = js.native
    def token: String = js.native
    def updateToken(token: String): Unit = js.native
  }
  
}

