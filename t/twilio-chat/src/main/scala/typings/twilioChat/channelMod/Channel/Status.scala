package typings.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.unknown
  - typings.twilioChat.twilioChatStrings.known
  - typings.twilioChat.twilioChatStrings.invited
  - typings.twilioChat.twilioChatStrings.joined
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invited: typings.twilioChat.twilioChatStrings.invited = this.cast("invited")
  @scala.inline
  def joined: typings.twilioChat.twilioChatStrings.joined = this.cast("joined")
  @scala.inline
  def known: typings.twilioChat.twilioChatStrings.known = this.cast("known")
  @scala.inline
  def unknown: typings.twilioChat.twilioChatStrings.unknown = this.cast("unknown")
}

