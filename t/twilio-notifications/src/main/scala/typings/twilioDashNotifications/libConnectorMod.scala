package typings.twilioDashNotifications

import typings.node.eventsMod.EventEmitter
import typings.std.Set
import typings.twilioDashNotifications.libConfigurationMod.Configuration
import typings.twilioDashNotifications.libConnectorMod.RegistrationState
import typings.twilioDashNotifications.libConnectorMod.UpdateReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/connector", JSImport.Namespace)
@js.native
object libConnectorMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.twilioDashNotifications.twilioDashNotificationsStrings.twilsock
    - typings.twilioDashNotifications.twilioDashNotificationsStrings.gcm
    - typings.twilioDashNotifications.twilioDashNotificationsStrings.fcm
    - typings.twilioDashNotifications.twilioDashNotificationsStrings.apn
  */
  trait ChannelType extends js.Object
  
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
  
  @js.native
  class RegistrationState () extends js.Object {
    def this(token: String) = this()
    def this(token: String, notificationId: String) = this()
    def this(token: String, notificationId: String, messageTypes: Set[String]) = this()
    var messageTypes: Set[String] = js.native
    var notificationId: String = js.native
    var token: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioDashNotifications.twilioDashNotificationsStrings.token
    - typings.twilioDashNotifications.twilioDashNotificationsStrings.notificationId
    - typings.twilioDashNotifications.twilioDashNotificationsStrings.messageType
  */
  trait UpdateReason extends js.Object
  
}

