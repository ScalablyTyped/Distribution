package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the message notification triggered from a registered background task. A chat app can receive notifications of incoming messages or send events by setting a task trigger and task entry point. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageNotificationTriggerDetails")
@js.native
abstract class ChatMessageNotificationTriggerDetails ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageNotificationTriggerDetails {
  /** Gets the message associated with the notification. This is either an incoming message or an outgoing message with a send status event. */
  /* CompleteClass */
  override var chatMessage: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessage = js.native
  /** Gets a Boolean value indicating if the background task should issue a toast notification for the message. */
  /* CompleteClass */
  override var shouldDisplayToast: Boolean = js.native
  /** Gets a Boolean value indicating if the Windows Action Center should be updated with the message. */
  /* CompleteClass */
  override var shouldUpdateActionCenter: Boolean = js.native
  /** Gets a Boolean value indicating if the background task should update the app’s lock screen count. */
  /* CompleteClass */
  override var shouldUpdateBadge: Boolean = js.native
  /** Gets a Boolean value indicating that the background task should update the app's tile count for the message. */
  /* CompleteClass */
  override var shouldUpdateDetailText: Boolean = js.native
}

