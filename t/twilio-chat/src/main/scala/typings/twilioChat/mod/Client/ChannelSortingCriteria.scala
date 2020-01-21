package typings.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.lastMessage
  - typings.twilioChat.twilioChatStrings.friendlyName
  - typings.twilioChat.twilioChatStrings.uniqueName
*/
trait ChannelSortingCriteria extends js.Object

object ChannelSortingCriteria {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typings.twilioChat.twilioChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def lastMessage: typings.twilioChat.twilioChatStrings.lastMessage = this.cast("lastMessage")
  @scala.inline
  def uniqueName: typings.twilioChat.twilioChatStrings.uniqueName = this.cast("uniqueName")
}

