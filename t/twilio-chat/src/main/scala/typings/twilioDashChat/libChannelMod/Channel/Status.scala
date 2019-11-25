package typings.twilioDashChat.libChannelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.unknown
  - typings.twilioDashChat.twilioDashChatStrings.known
  - typings.twilioDashChat.twilioDashChatStrings.invited
  - typings.twilioDashChat.twilioDashChatStrings.joined
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invited: typings.twilioDashChat.twilioDashChatStrings.invited = this.cast("invited")
  @scala.inline
  def joined: typings.twilioDashChat.twilioDashChatStrings.joined = this.cast("joined")
  @scala.inline
  def known: typings.twilioDashChat.twilioDashChatStrings.known = this.cast("known")
  @scala.inline
  def unknown: typings.twilioDashChat.twilioDashChatStrings.unknown = this.cast("unknown")
}

