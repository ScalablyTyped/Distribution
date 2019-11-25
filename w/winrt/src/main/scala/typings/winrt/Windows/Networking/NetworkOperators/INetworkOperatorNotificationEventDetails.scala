package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkOperatorNotificationEventDetails extends js.Object {
  var encodingType: Double
  var message: String
  var networkAccountId: String
  var notificationType: NetworkOperatorEventMessageType
  var ruleId: String
  var smsMessage: ISmsMessage
}

object INetworkOperatorNotificationEventDetails {
  @scala.inline
  def apply(
    encodingType: Double,
    message: String,
    networkAccountId: String,
    notificationType: NetworkOperatorEventMessageType,
    ruleId: String,
    smsMessage: ISmsMessage
  ): INetworkOperatorNotificationEventDetails = {
    val __obj = js.Dynamic.literal(encodingType = encodingType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INetworkOperatorNotificationEventDetails]
  }
}

