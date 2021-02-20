package typings.twilioNotifications

import typings.std.Transport
import typings.twilioNotifications.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrarConnectorMod {
  
  @JSImport("twilio-notifications/lib/registrar.connector", "Connector")
  @js.native
  abstract class Connector protected ()
    extends typings.twilioNotifications.connectorMod.Connector {
    def this(config: Configuration) = this()
  }
  
  /**
    * Manages the registrations on ERS service.
    * Deduplicates registrations and manages them automatically
    */
  @JSImport("twilio-notifications/lib/registrar.connector", "RegistrarConnector")
  @js.native
  class RegistrarConnector protected ()
    extends typings.twilioNotifications.connectorMod.Connector {
    /**
      * Creates new instance of the ERS registrar
      *
      * @param Object configuration
      * @param string notificationId
      * @param string channelType
      * @param Array messageTypes
      */
    def this(channelType: String, context: js.Any, transport: Transport, config: Configuration) = this()
    
    val channelType: js.Any = js.native
    
    val context: js.Any = js.native
    
    var persistedToken: js.Any = js.native
    
    var register: js.Any = js.native
    
    var registrationId: js.Any = js.native
    
    val transport: js.Any = js.native
  }
}
