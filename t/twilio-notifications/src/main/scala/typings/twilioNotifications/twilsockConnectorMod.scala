package typings.twilioNotifications

import typings.twilioNotifications.configurationMod.Configuration
import typings.twilioNotifications.connectorMod.Connector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/twilsock.connector", JSImport.Namespace)
@js.native
object twilsockConnectorMod extends js.Object {
  /**
    * Registrar connector implementation for twilsock
    */
  @js.native
  class TwilsockConnector protected () extends Connector {
    def this(context: js.Any, twilsock: js.Any, config: Configuration) = this()
    var context: js.Any = js.native
    val twilsock: js.Any = js.native
    var updateContextRequest: js.Any = js.native
    def setNotificationId(args: js.Any*): Unit = js.native
  }
  
}

