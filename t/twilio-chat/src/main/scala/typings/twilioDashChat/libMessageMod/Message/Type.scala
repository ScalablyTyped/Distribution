package typings.twilioDashChat.libMessageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.text
  - typings.twilioDashChat.twilioDashChatStrings.media
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def media: typings.twilioDashChat.twilioDashChatStrings.media = this.cast("media")
  @scala.inline
  def text: typings.twilioDashChat.twilioDashChatStrings.text = this.cast("text")
}

