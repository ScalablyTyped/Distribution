package typings.twilioDashChat.libChannelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedEventArgs extends js.Object {
  var channel: typings.twilioDashChat.libChannelMod.Channel
  var updateReasons: js.Array[UpdateReason]
}

object UpdatedEventArgs {
  @scala.inline
  def apply(channel: typings.twilioDashChat.libChannelMod.Channel, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(channel = channel, updateReasons = updateReasons)
  
    __obj.asInstanceOf[UpdatedEventArgs]
  }
}

