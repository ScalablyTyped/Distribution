package typings.twilioChat.channelsMod.Channels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.sync
  - typings.twilioChat.twilioChatStrings.chat
  - typings.twilioChat.twilioChatStrings.synclist
*/
trait DataSource extends js.Object

object DataSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typings.twilioChat.twilioChatStrings.chat = this.cast("chat")
  @scala.inline
  def sync: typings.twilioChat.twilioChatStrings.sync = this.cast("sync")
  @scala.inline
  def synclist: typings.twilioChat.twilioChatStrings.synclist = this.cast("synclist")
}

