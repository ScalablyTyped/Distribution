package typings
package twilioDashNotificationsLib.libConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/connector", "RegistrationState")
@js.native
class RegistrationState () extends js.Object {
  def this(token: java.lang.String) = this()
  def this(token: java.lang.String, notificationId: java.lang.String) = this()
  def this(token: java.lang.String, notificationId: java.lang.String, messageTypes: stdLib.Set[java.lang.String]) = this()
  var messageTypes: stdLib.Set[java.lang.String] = js.native
  var notificationId: java.lang.String = js.native
  var token: java.lang.String = js.native
}

