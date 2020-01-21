package typings.twilioChat.memberMod.Member

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.chat
  - typings.twilioChat.twilioChatStrings.sms
  - typings.twilioChat.twilioChatStrings.whatsapp
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typings.twilioChat.twilioChatStrings.chat = this.cast("chat")
  @scala.inline
  def sms: typings.twilioChat.twilioChatStrings.sms = this.cast("sms")
  @scala.inline
  def whatsapp: typings.twilioChat.twilioChatStrings.whatsapp = this.cast("whatsapp")
}

