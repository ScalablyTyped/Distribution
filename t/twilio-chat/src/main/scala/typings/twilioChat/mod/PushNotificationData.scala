package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional data for a given push notification.
  */
trait PushNotificationData extends StObject {
  
  /**
    * SID of the conversation.
    */
  var conversationSid: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the message in the conversation.
    */
  var messageIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * SID of the message in the conversation.s
    */
  var messageSid: js.UndefOr[String] = js.undefined
}
object PushNotificationData {
  
  inline def apply(): PushNotificationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationData]
  }
  
  extension [Self <: PushNotificationData](x: Self) {
    
    inline def setConversationSid(value: String): Self = StObject.set(x, "conversationSid", value.asInstanceOf[js.Any])
    
    inline def setConversationSidUndefined: Self = StObject.set(x, "conversationSid", js.undefined)
    
    inline def setMessageIndex(value: Double): Self = StObject.set(x, "messageIndex", value.asInstanceOf[js.Any])
    
    inline def setMessageIndexUndefined: Self = StObject.set(x, "messageIndex", js.undefined)
    
    inline def setMessageSid(value: String): Self = StObject.set(x, "messageSid", value.asInstanceOf[js.Any])
    
    inline def setMessageSidUndefined: Self = StObject.set(x, "messageSid", js.undefined)
  }
}
