package typings.twilioChat.messageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedEventArgs extends js.Object {
  var message: typings.twilioChat.messageMod.Message
  var updateReasons: js.Array[UpdateReason]
}

object UpdatedEventArgs {
  @scala.inline
  def apply(message: typings.twilioChat.messageMod.Message, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedEventArgs]
  }
}

