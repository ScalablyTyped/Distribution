package typings.twilioNotifications

import typings.std.Transport
import typings.twilioNotifications.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    /* private */ val channelType: js.Any = js.native
    
    /* private */ val context: js.Any = js.native
    
    /* private */ var persistedToken: js.Any = js.native
    
    /* private */ var register: js.Any = js.native
    
    /* private */ var registrationId: js.Any = js.native
    
    /* private */ val transport: js.Any = js.native
  }
}
