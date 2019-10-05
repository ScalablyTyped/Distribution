package typings.twilioDashChat.libMessageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedEventArgs extends js.Object {
  var message: typings.twilioDashChat.libMessageMod.Message
  var updateReasons: js.Array[UpdateReason]
}

object UpdatedEventArgs {
  @scala.inline
  def apply(message: typings.twilioDashChat.libMessageMod.Message, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(message = message, updateReasons = updateReasons)
  
    __obj.asInstanceOf[UpdatedEventArgs]
  }
}

