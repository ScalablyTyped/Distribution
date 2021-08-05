package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkOperatorNotificationEventDetails extends StObject {
  
  var encodingType: Double
  
  var message: String
  
  var networkAccountId: String
  
  var notificationType: NetworkOperatorEventMessageType
  
  var ruleId: String
  
  var smsMessage: ISmsMessage
}
object INetworkOperatorNotificationEventDetails {
  
  inline def apply(
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
  
  extension [Self <: INetworkOperatorNotificationEventDetails](x: Self) {
    
    inline def setEncodingType(value: Double): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: NetworkOperatorEventMessageType): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setSmsMessage(value: ISmsMessage): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
  }
}
