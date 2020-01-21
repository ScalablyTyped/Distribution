package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a revision to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChange")
@js.native
abstract class ChatMessageChange () extends js.Object {
  /** Gets the type of change made to a chat message, such as created, modified, etc. */
  var changeType: ChatMessageChangeType = js.native
  /** Gets the updated message text. */
  var message: ChatMessage = js.native
}

