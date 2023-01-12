package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the message notification triggered from a registered background task. A chat app can receive notifications of incoming messages or send events by setting a task trigger and task entry point. */
trait ChatMessageNotificationTriggerDetails extends StObject {
  
  /** Gets the message associated with the notification. This is either an incoming message or an outgoing message with a send status event. */
  var chatMessage: ChatMessage
  
  /** Gets a Boolean value indicating if the background task should issue a toast notification for the message. */
  var shouldDisplayToast: Boolean
  
  /** Gets a Boolean value indicating if the Windows Action Center should be updated with the message. */
  var shouldUpdateActionCenter: Boolean
  
  /** Gets a Boolean value indicating if the background task should update the app’s lock screen count. */
  var shouldUpdateBadge: Boolean
  
  /** Gets a Boolean value indicating that the background task should update the app's tile count for the message. */
  var shouldUpdateDetailText: Boolean
}
object ChatMessageNotificationTriggerDetails {
  
  inline def apply(
    chatMessage: ChatMessage,
    shouldDisplayToast: Boolean,
    shouldUpdateActionCenter: Boolean,
    shouldUpdateBadge: Boolean,
    shouldUpdateDetailText: Boolean
  ): ChatMessageNotificationTriggerDetails = {
    val __obj = js.Dynamic.literal(chatMessage = chatMessage.asInstanceOf[js.Any], shouldDisplayToast = shouldDisplayToast.asInstanceOf[js.Any], shouldUpdateActionCenter = shouldUpdateActionCenter.asInstanceOf[js.Any], shouldUpdateBadge = shouldUpdateBadge.asInstanceOf[js.Any], shouldUpdateDetailText = shouldUpdateDetailText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageNotificationTriggerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageNotificationTriggerDetails] (val x: Self) extends AnyVal {
    
    inline def setChatMessage(value: ChatMessage): Self = StObject.set(x, "chatMessage", value.asInstanceOf[js.Any])
    
    inline def setShouldDisplayToast(value: Boolean): Self = StObject.set(x, "shouldDisplayToast", value.asInstanceOf[js.Any])
    
    inline def setShouldUpdateActionCenter(value: Boolean): Self = StObject.set(x, "shouldUpdateActionCenter", value.asInstanceOf[js.Any])
    
    inline def setShouldUpdateBadge(value: Boolean): Self = StObject.set(x, "shouldUpdateBadge", value.asInstanceOf[js.Any])
    
    inline def setShouldUpdateDetailText(value: Boolean): Self = StObject.set(x, "shouldUpdateDetailText", value.asInstanceOf[js.Any])
  }
}
