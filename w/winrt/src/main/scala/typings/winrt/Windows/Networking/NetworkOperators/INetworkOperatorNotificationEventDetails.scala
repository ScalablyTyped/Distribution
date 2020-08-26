package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetworkOperatorNotificationEventDetails extends js.Object {
  var encodingType: Double = js.native
  var message: String = js.native
  var networkAccountId: String = js.native
  var notificationType: NetworkOperatorEventMessageType = js.native
  var ruleId: String = js.native
  var smsMessage: ISmsMessage = js.native
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
  @scala.inline
  implicit class INetworkOperatorNotificationEventDetailsOps[Self <: INetworkOperatorNotificationEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncodingType(value: Double): Self = this.set("encodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkAccountId(value: String): Self = this.set("networkAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationType(value: NetworkOperatorEventMessageType): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmsMessage(value: ISmsMessage): Self = this.set("smsMessage", value.asInstanceOf[js.Any])
  }
  
}

