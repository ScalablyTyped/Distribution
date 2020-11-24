package typings.twilioNotifications

import typings.std.Transport
import typings.twilioNotifications.configurationMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-notifications/lib/registrar.connector", JSImport.Namespace)
@js.native
object registrarConnectorMod extends js.Object {
  
  @js.native
  abstract class Connector protected ()
    extends typings.twilioNotifications.connectorMod.Connector {
    def this(config: Configuration) = this()
  }
  
  /**
    * Manages the registrations on ERS service.
    * Deduplicates registrations and manages them automatically
    */
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
