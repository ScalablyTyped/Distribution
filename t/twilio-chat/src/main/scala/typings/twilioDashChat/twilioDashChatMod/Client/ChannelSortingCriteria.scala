package typings.twilioDashChat.twilioDashChatMod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.lastMessage
  - typings.twilioDashChat.twilioDashChatStrings.friendlyName
  - typings.twilioDashChat.twilioDashChatStrings.uniqueName
*/
trait ChannelSortingCriteria extends js.Object

object ChannelSortingCriteria {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typings.twilioDashChat.twilioDashChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def lastMessage: typings.twilioDashChat.twilioDashChatStrings.lastMessage = this.cast("lastMessage")
  @scala.inline
  def uniqueName: typings.twilioDashChat.twilioDashChatStrings.uniqueName = this.cast("uniqueName")
}

