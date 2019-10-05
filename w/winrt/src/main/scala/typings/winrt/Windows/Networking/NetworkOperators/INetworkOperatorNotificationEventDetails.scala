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
    val __obj = js.Dynamic.literal(encodingType = encodingType, message = message, networkAccountId = networkAccountId, notificationType = notificationType, ruleId = ruleId, smsMessage = smsMessage)
  
    __obj.asInstanceOf[INetworkOperatorNotificationEventDetails]
  }
}

