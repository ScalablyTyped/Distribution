package typings.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.friendlyName
  - typings.twilioChat.twilioChatStrings.attributes
  - typings.twilioChat.twilioChatStrings.online
  - typings.twilioChat.twilioChatStrings.notifiable
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typings.twilioChat.twilioChatStrings.attributes = this.cast("attributes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typings.twilioChat.twilioChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def notifiable: typings.twilioChat.twilioChatStrings.notifiable = this.cast("notifiable")
  @scala.inline
  def online: typings.twilioChat.twilioChatStrings.online = this.cast("online")
}

