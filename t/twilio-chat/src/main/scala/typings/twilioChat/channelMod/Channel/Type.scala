package typings.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.public
  - typings.twilioChat.twilioChatStrings.`private`
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.twilioChat.twilioChatStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.twilioChat.twilioChatStrings.public = this.cast("public")
}

