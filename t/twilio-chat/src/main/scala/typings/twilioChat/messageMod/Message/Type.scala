package typings.twilioChat.messageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.text
  - typings.twilioChat.twilioChatStrings.media
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def media: typings.twilioChat.twilioChatStrings.media = this.cast("media")
  @scala.inline
  def text: typings.twilioChat.twilioChatStrings.text = this.cast("text")
}

