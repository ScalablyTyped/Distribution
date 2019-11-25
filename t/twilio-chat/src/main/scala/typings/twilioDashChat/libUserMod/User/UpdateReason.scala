package typings.twilioDashChat.libUserMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.friendlyName
  - typings.twilioDashChat.twilioDashChatStrings.attributes
  - typings.twilioDashChat.twilioDashChatStrings.online
  - typings.twilioDashChat.twilioDashChatStrings.notifiable
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typings.twilioDashChat.twilioDashChatStrings.attributes = this.cast("attributes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typings.twilioDashChat.twilioDashChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def notifiable: typings.twilioDashChat.twilioDashChatStrings.notifiable = this.cast("notifiable")
  @scala.inline
  def online: typings.twilioDashChat.twilioDashChatStrings.online = this.cast("online")
}

