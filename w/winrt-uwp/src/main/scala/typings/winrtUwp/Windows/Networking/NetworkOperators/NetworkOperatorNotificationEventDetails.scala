package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Devices.Sms.ISmsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network operator notification. */
@js.native
trait NetworkOperatorNotificationEventDetails extends js.Object {
  
  /**
    * Used to indicate if tethering is permitted for a device. If it is not, a reason can be provided.
    * @param allow true if tethering is permitted; otherwise, false.
    * @param entitlementFailureReason The reason tethering is not permitted.
    */
  def authorizeTethering(allow: Boolean, entitlementFailureReason: String): Unit = js.native
  
  /** Gets the data-coding scheme (DCS) of the received message. */
  var encodingType: Double = js.native
  
  /** Gets the message for the network operator notification. */
  var message: String = js.native
  
  /** Gets a unique identifier for the mobile broadband account that received the notification. */
  var networkAccountId: String = js.native
  
  /** Gets the type of the network notification. */
  var notificationType: NetworkOperatorEventMessageType = js.native
  
  /** Gets the identifier of the provisioned rule that matched and triggered the notification. */
  var ruleId: String = js.native
  
  /** Gets an SMS message for the mobile broadband account that received the notification. */
  var smsMessage: ISmsMessage = js.native
}
object NetworkOperatorNotificationEventDetails {
  
  @scala.inline
  def apply(
    authorizeTethering: (Boolean, String) => Unit,
    encodingType: Double,
    message: String,
    networkAccountId: String,
    notificationType: NetworkOperatorEventMessageType,
    ruleId: String,
    smsMessage: ISmsMessage
  ): NetworkOperatorNotificationEventDetails = {
    val __obj = js.Dynamic.literal(authorizeTethering = js.Any.fromFunction2(authorizeTethering), encodingType = encodingType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorNotificationEventDetails]
  }
  
  @scala.inline
  implicit class NetworkOperatorNotificationEventDetailsOps[Self <: NetworkOperatorNotificationEventDetails] (val x: Self) extends AnyVal {
    
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
    def setAuthorizeTethering(value: (Boolean, String) => Unit): Self = this.set("authorizeTethering", js.Any.fromFunction2(value))
    
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
