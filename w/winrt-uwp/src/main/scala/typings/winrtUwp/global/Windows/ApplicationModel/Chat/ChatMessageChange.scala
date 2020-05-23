package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a revision to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChange")
@js.native
abstract class ChatMessageChange ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChange {
  /** Gets the type of change made to a chat message, such as created, modified, etc. */
  /* CompleteClass */
  override var changeType: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangeType = js.native
  /** Gets the updated message text. */
  /* CompleteClass */
  override var message: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessage = js.native
}

