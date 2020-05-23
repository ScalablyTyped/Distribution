package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a revision to a chat message. */
trait ChatMessageChange extends js.Object {
  /** Gets the type of change made to a chat message, such as created, modified, etc. */
  var changeType: ChatMessageChangeType
  /** Gets the updated message text. */
  var message: ChatMessage
}

object ChatMessageChange {
  @scala.inline
  def apply(changeType: ChatMessageChangeType, message: ChatMessage): ChatMessageChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageChange]
  }
}

