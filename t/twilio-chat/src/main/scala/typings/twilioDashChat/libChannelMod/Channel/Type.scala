package typings.twilioDashChat.libChannelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.public
  - typings.twilioDashChat.twilioDashChatStrings.`private`
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.twilioDashChat.twilioDashChatStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.twilioDashChat.twilioDashChatStrings.public = this.cast("public")
}

