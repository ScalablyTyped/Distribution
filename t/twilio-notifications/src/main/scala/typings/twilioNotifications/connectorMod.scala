package typings.twilioNotifications

import typings.node.eventsMod.EventEmitter
import typings.std.Set
import typings.twilioNotifications.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorMod {
  
  @JSImport("twilio-notifications/lib/connector", "Connector")
  @js.native
  abstract class Connector protected () extends EventEmitter {
    def this(config: Configuration) = this()
    
    val config: Configuration = js.native
    
    val currentState: RegistrationState = js.native
    
    val desiredState: RegistrationState = js.native
    
    var hasActiveAttempt: js.Any = js.native
    
    var persistRegistration: js.Any = js.native
    
    /* protected */ def removeRegistration(): js.Promise[Unit] = js.native
    
    def setNotificationId(notificationId: String): Unit = js.native
    
    def subscribe(messageType: String): js.Promise[Unit] = js.native
    
    def unsubscribe(messageType: String): js.Promise[Unit] = js.native
    
    /* protected */ def updateRegistration(registration: RegistrationState, reasons: Set[UpdateReason]): js.Promise[RegistrationState] = js.native
    
    def updateToken(token: String): Unit = js.native
  }
  
  @JSImport("twilio-notifications/lib/connector", "RegistrationState")
  @js.native
  class RegistrationState () extends StObject {
    def this(token: String) = this()
    def this(token: String, notificationId: String) = this()
    def this(token: Unit, notificationId: String) = this()
    def this(token: String, notificationId: String, messageTypes: Set[String]) = this()
    def this(token: String, notificationId: Unit, messageTypes: Set[String]) = this()
    def this(token: Unit, notificationId: String, messageTypes: Set[String]) = this()
    def this(token: Unit, notificationId: Unit, messageTypes: Set[String]) = this()
    
    var messageTypes: Set[String] = js.native
    
    var notificationId: String = js.native
    
    var token: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioNotifications.twilioNotificationsStrings.twilsock
    - typings.twilioNotifications.twilioNotificationsStrings.gcm
    - typings.twilioNotifications.twilioNotificationsStrings.fcm
    - typings.twilioNotifications.twilioNotificationsStrings.apn
  */
  trait ChannelType extends StObject
  object ChannelType {
    
    @scala.inline
    def apn: typings.twilioNotifications.twilioNotificationsStrings.apn = "apn".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.apn]
    
    @scala.inline
    def fcm: typings.twilioNotifications.twilioNotificationsStrings.fcm = "fcm".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.fcm]
    
    @scala.inline
    def gcm: typings.twilioNotifications.twilioNotificationsStrings.gcm = "gcm".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.gcm]
    
    @scala.inline
    def twilsock: typings.twilioNotifications.twilioNotificationsStrings.twilsock = "twilsock".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.twilsock]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioNotifications.twilioNotificationsStrings.token
    - typings.twilioNotifications.twilioNotificationsStrings.notificationId
    - typings.twilioNotifications.twilioNotificationsStrings.messageType
  */
  trait UpdateReason extends StObject
  object UpdateReason {
    
    @scala.inline
    def messageType: typings.twilioNotifications.twilioNotificationsStrings.messageType = "messageType".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.messageType]
    
    @scala.inline
    def notificationId: typings.twilioNotifications.twilioNotificationsStrings.notificationId = "notificationId".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.notificationId]
    
    @scala.inline
    def token: typings.twilioNotifications.twilioNotificationsStrings.token = "token".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.token]
  }
}
