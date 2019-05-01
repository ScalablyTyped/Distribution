package typings
package twilioDashNotificationsLib.libConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/connector", "Connector")
@js.native
abstract class Connector protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(config: twilioDashNotificationsLib.libConfigurationMod.Configuration) = this()
  val config: twilioDashNotificationsLib.libConfigurationMod.Configuration = js.native
  val currentState: RegistrationState = js.native
  val desiredState: RegistrationState = js.native
  var hasActiveAttempt: js.Any = js.native
  var persistRegistration: js.Any = js.native
  /* protected */ def removeRegistration(): js.Promise[scala.Unit] = js.native
  def setNotificationId(notificationId: java.lang.String): scala.Unit = js.native
  def subscribe(messageType: java.lang.String): js.Promise[scala.Unit] = js.native
  def unsubscribe(messageType: java.lang.String): js.Promise[scala.Unit] = js.native
  /* protected */ def updateRegistration(registration: RegistrationState, reasons: stdLib.Set[UpdateReason]): js.Promise[RegistrationState] = js.native
  def updateToken(token: java.lang.String): scala.Unit = js.native
}

