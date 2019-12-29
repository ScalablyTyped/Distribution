package typings.twilioDashChat.libPushnotificationMod.PushNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotnew_message
  - typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotadded_to_channel
  - typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotinvited_to_channel
  - typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotremoved_from_channel
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def twilioDotchannelDotadded_to_channel: typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotadded_to_channel = this.cast("twilio.channel.added_to_channel")
  @scala.inline
  def twilioDotchannelDotinvited_to_channel: typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotinvited_to_channel = this.cast("twilio.channel.invited_to_channel")
  @scala.inline
  def twilioDotchannelDotnew_message: typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotnew_message = this.cast("twilio.channel.new_message")
  @scala.inline
  def twilioDotchannelDotremoved_from_channel: typings.twilioDashChat.twilioDashChatStrings.twilioDotchannelDotremoved_from_channel = this.cast("twilio.channel.removed_from_channel")
}

