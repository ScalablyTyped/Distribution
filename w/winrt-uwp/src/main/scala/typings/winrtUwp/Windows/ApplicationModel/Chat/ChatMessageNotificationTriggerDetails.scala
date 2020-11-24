package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the message notification triggered from a registered background task. A chat app can receive notifications of incoming messages or send events by setting a task trigger and task entry point. */
@js.native
trait ChatMessageNotificationTriggerDetails extends js.Object {
  
  /** Gets the message associated with the notification. This is either an incoming message or an outgoing message with a send status event. */
  var chatMessage: ChatMessage = js.native
  
  /** Gets a Boolean value indicating if the background task should issue a toast notification for the message. */
  var shouldDisplayToast: Boolean = js.native
  
  /** Gets a Boolean value indicating if the Windows Action Center should be updated with the message. */
  var shouldUpdateActionCenter: Boolean = js.native
  
  /** Gets a Boolean value indicating if the background task should update the app’s lock screen count. */
  var shouldUpdateBadge: Boolean = js.native
  
  /** Gets a Boolean value indicating that the background task should update the app's tile count for the message. */
  var shouldUpdateDetailText: Boolean = js.native
}
object ChatMessageNotificationTriggerDetails {
  
  @scala.inline
  def apply(
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
  implicit class ChatMessageNotificationTriggerDetailsOps[Self <: ChatMessageNotificationTriggerDetails] (val x: Self) extends AnyVal {
    
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
    def setChatMessage(value: ChatMessage): Self = this.set("chatMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldDisplayToast(value: Boolean): Self = this.set("shouldDisplayToast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUpdateActionCenter(value: Boolean): Self = this.set("shouldUpdateActionCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUpdateBadge(value: Boolean): Self = this.set("shouldUpdateBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUpdateDetailText(value: Boolean): Self = this.set("shouldUpdateDetailText", value.asInstanceOf[js.Any])
  }
}
