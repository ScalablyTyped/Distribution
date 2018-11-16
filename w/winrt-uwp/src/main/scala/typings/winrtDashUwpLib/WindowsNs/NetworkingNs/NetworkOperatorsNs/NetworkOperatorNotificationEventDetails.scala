package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network operator notification. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails")
@js.native
abstract class NetworkOperatorNotificationEventDetails () extends js.Object {
  /** Gets the data-coding scheme (DCS) of the received message. */
  var encodingType: scala.Double = js.native
  /** Gets the message for the network operator notification. */
  var message: java.lang.String = js.native
  /** Gets a unique identifier for the mobile broadband account that received the notification. */
  var networkAccountId: java.lang.String = js.native
  /** Gets the type of the network notification. */
  var notificationType: NetworkOperatorEventMessageType = js.native
  /** Gets the identifier of the provisioned rule that matched and triggered the notification. */
  var ruleId: java.lang.String = js.native
  /** Gets an SMS message for the mobile broadband account that received the notification. */
  var smsMessage: winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage = js.native
  /**
                   * Used to indicate if tethering is permitted for a device. If it is not, a reason can be provided.
                   * @param allow true if tethering is permitted; otherwise, false.
                   * @param entitlementFailureReason The reason tethering is not permitted.
                   */
  def authorizeTethering(allow: scala.Boolean, entitlementFailureReason: java.lang.String): scala.Unit = js.native
}

