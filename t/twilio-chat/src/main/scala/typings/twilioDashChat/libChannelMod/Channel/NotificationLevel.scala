package typings.twilioDashChat.libChannelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.default
  - typings.twilioDashChat.twilioDashChatStrings.muted
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.twilioDashChat.twilioDashChatStrings.default = this.cast("default")
  @scala.inline
  def muted: typings.twilioDashChat.twilioDashChatStrings.muted = this.cast("muted")
}

