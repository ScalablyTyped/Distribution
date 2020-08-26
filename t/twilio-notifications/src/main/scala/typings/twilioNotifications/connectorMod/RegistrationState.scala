package typings.twilioNotifications.connectorMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/connector", "RegistrationState")
@js.native
class RegistrationState () extends js.Object {
  def this(token: String) = this()
  def this(token: js.UndefOr[scala.Nothing], notificationId: String) = this()
  def this(token: String, notificationId: String) = this()
  def this(
    token: js.UndefOr[scala.Nothing],
    notificationId: js.UndefOr[scala.Nothing],
    messageTypes: Set[String]
  ) = this()
  def this(token: js.UndefOr[scala.Nothing], notificationId: String, messageTypes: Set[String]) = this()
  def this(token: String, notificationId: js.UndefOr[scala.Nothing], messageTypes: Set[String]) = this()
  def this(token: String, notificationId: String, messageTypes: Set[String]) = this()
  var messageTypes: Set[String] = js.native
  var notificationId: String = js.native
  var token: String = js.native
}

