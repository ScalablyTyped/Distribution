package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Devices.Sms.ISmsMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network operator notification. */
trait NetworkOperatorNotificationEventDetails extends StObject {
  
  /**
    * Used to indicate if tethering is permitted for a device. If it is not, a reason can be provided.
    * @param allow true if tethering is permitted; otherwise, false.
    * @param entitlementFailureReason The reason tethering is not permitted.
    */
  def authorizeTethering(allow: Boolean, entitlementFailureReason: String): Unit
  
  /** Gets the data-coding scheme (DCS) of the received message. */
  var encodingType: Double
  
  /** Gets the message for the network operator notification. */
  var message: String
  
  /** Gets a unique identifier for the mobile broadband account that received the notification. */
  var networkAccountId: String
  
  /** Gets the type of the network notification. */
  var notificationType: NetworkOperatorEventMessageType
  
  /** Gets the identifier of the provisioned rule that matched and triggered the notification. */
  var ruleId: String
  
  /** Gets an SMS message for the mobile broadband account that received the notification. */
  var smsMessage: ISmsMessage
}
object NetworkOperatorNotificationEventDetails {
  
  inline def apply(
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
  
  extension [Self <: NetworkOperatorNotificationEventDetails](x: Self) {
    
    inline def setAuthorizeTethering(value: (Boolean, String) => Unit): Self = StObject.set(x, "authorizeTethering", js.Any.fromFunction2(value))
    
    inline def setEncodingType(value: Double): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: NetworkOperatorEventMessageType): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setSmsMessage(value: ISmsMessage): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
  }
}
