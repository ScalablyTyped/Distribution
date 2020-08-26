package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a revision to a chat message. */
@js.native
trait ChatMessageChange extends js.Object {
  /** Gets the type of change made to a chat message, such as created, modified, etc. */
  var changeType: ChatMessageChangeType = js.native
  /** Gets the updated message text. */
  var message: ChatMessage = js.native
}

object ChatMessageChange {
  @scala.inline
  def apply(changeType: ChatMessageChangeType, message: ChatMessage): ChatMessageChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageChange]
  }
  @scala.inline
  implicit class ChatMessageChangeOps[Self <: ChatMessageChange] (val x: Self) extends AnyVal {
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
    def setChangeType(value: ChatMessageChangeType): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: ChatMessage): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

