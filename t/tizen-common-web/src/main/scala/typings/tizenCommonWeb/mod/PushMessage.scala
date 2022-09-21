package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushMessage extends StObject {
  
  /**
    * An attribute to store the push notification message that may include an alert message to the user.
    */
  val alertMessage: String
  
  /**
    * An attribute to store the push notification data.
    *
    * This data is the message that the sender wants to send and its length must be less than 1 KB.
    */
  val appData: String
  
  /**
    * An attribute to store the date/time when a push notification message is received.
    */
  val date: js.Date
  
  /**
    * An attribute to store the full push notification message.
    *
    * @since 3.0
    */
  val message: String
  
  /**
    * The request ID assigned by the sender.
    *
    * @since 3.0
    */
  val requestId: String
  
  /**
    * The name of the sender of the notification.
    *
    * @since 3.0
    */
  val sender: String
  
  /**
    * The session information of the notification.
    *
    * @since 3.0
    */
  val sessionInfo: String
}
object PushMessage {
  
  inline def apply(
    alertMessage: String,
    appData: String,
    date: js.Date,
    message: String,
    requestId: String,
    sender: String,
    sessionInfo: String
  ): PushMessage = {
    val __obj = js.Dynamic.literal(alertMessage = alertMessage.asInstanceOf[js.Any], appData = appData.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushMessage]
  }
  
  extension [Self <: PushMessage](x: Self) {
    
    inline def setAlertMessage(value: String): Self = StObject.set(x, "alertMessage", value.asInstanceOf[js.Any])
    
    inline def setAppData(value: String): Self = StObject.set(x, "appData", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
  }
}
