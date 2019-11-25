package typings.twilioDashChat.libPushnotificationMod.PushNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTnew_message
  - typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTadded_to_channel
  - typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTinvited_to_channel
  - typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTremoved_from_channel
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def twilioDOTchannelDOTadded_to_channel: typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTadded_to_channel = this.cast("twilio.channel.added_to_channel")
  @scala.inline
  def twilioDOTchannelDOTinvited_to_channel: typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTinvited_to_channel = this.cast("twilio.channel.invited_to_channel")
  @scala.inline
  def twilioDOTchannelDOTnew_message: typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTnew_message = this.cast("twilio.channel.new_message")
  @scala.inline
  def twilioDOTchannelDOTremoved_from_channel: typings.twilioDashChat.twilioDashChatStrings.twilioDOTchannelDOTremoved_from_channel = this.cast("twilio.channel.removed_from_channel")
}

