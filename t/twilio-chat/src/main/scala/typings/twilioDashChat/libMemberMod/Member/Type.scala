package typings.twilioDashChat.libMemberMod.Member

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.chat
  - typings.twilioDashChat.twilioDashChatStrings.sms
  - typings.twilioDashChat.twilioDashChatStrings.whatsapp
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typings.twilioDashChat.twilioDashChatStrings.chat = this.cast("chat")
  @scala.inline
  def sms: typings.twilioDashChat.twilioDashChatStrings.sms = this.cast("sms")
  @scala.inline
  def whatsapp: typings.twilioDashChat.twilioDashChatStrings.whatsapp = this.cast("whatsapp")
}

