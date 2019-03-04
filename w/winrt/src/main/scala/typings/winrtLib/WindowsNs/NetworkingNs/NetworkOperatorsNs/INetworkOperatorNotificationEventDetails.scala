package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkOperatorNotificationEventDetails extends js.Object {
  var encodingType: scala.Double
  var message: java.lang.String
  var networkAccountId: java.lang.String
  var notificationType: NetworkOperatorEventMessageType
  var ruleId: java.lang.String
  var smsMessage: winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage
}

object INetworkOperatorNotificationEventDetails {
  @scala.inline
  def apply(
    encodingType: scala.Double,
    message: java.lang.String,
    networkAccountId: java.lang.String,
    notificationType: NetworkOperatorEventMessageType,
    ruleId: java.lang.String,
    smsMessage: winrtLib.WindowsNs.DevicesNs.SmsNs.ISmsMessage
  ): INetworkOperatorNotificationEventDetails = {
    val __obj = js.Dynamic.literal(encodingType = encodingType, message = message, networkAccountId = networkAccountId, notificationType = notificationType, ruleId = ruleId, smsMessage = smsMessage)
  
    __obj.asInstanceOf[INetworkOperatorNotificationEventDetails]
  }
}

