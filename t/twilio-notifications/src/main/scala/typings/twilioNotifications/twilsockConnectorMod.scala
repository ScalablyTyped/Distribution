package typings.twilioNotifications

import typings.twilioNotifications.configurationMod.Configuration
import typings.twilioNotifications.connectorMod.Connector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockConnectorMod {
  
  /**
    * Registrar connector implementation for twilsock
    */
  @JSImport("twilio-notifications/lib/twilsock.connector", "TwilsockConnector")
  @js.native
  class TwilsockConnector protected () extends Connector {
    def this(context: js.Any, twilsock: js.Any, config: Configuration) = this()
    
    var context: js.Any = js.native
    
    def setNotificationId(args: js.Any*): Unit = js.native
    
    val twilsock: js.Any = js.native
    
    var updateContextRequest: js.Any = js.native
  }
}
