package typings.twilioDashChat.libDataChannelsMod.Channels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.sync
  - typings.twilioDashChat.twilioDashChatStrings.chat
  - typings.twilioDashChat.twilioDashChatStrings.synclist
*/
trait DataSource extends js.Object

object DataSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typings.twilioDashChat.twilioDashChatStrings.chat = this.cast("chat")
  @scala.inline
  def sync: typings.twilioDashChat.twilioDashChatStrings.sync = this.cast("sync")
  @scala.inline
  def synclist: typings.twilioDashChat.twilioDashChatStrings.synclist = this.cast("synclist")
}

