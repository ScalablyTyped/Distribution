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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encodingType")(encodingType)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("networkAccountId")(networkAccountId)
    __obj.updateDynamic("notificationType")(notificationType)
    __obj.updateDynamic("ruleId")(ruleId)
    __obj.updateDynamic("smsMessage")(smsMessage)
    __obj.asInstanceOf[INetworkOperatorNotificationEventDetails]
  }
}

