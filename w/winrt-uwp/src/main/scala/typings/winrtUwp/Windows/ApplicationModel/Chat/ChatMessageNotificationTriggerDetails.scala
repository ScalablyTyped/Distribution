package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the message notification triggered from a registered background task. A chat app can receive notifications of incoming messages or send events by setting a task trigger and task entry point. */
trait ChatMessageNotificationTriggerDetails extends js.Object {
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
}

