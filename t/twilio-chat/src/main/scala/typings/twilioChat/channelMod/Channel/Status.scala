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
  def invited: typings.twilioChat.twilioChatStrings.invited = "invited".asInstanceOf[typings.twilioChat.twilioChatStrings.invited]
  @scala.inline
  def joined: typings.twilioChat.twilioChatStrings.joined = "joined".asInstanceOf[typings.twilioChat.twilioChatStrings.joined]
  @scala.inline
  def known: typings.twilioChat.twilioChatStrings.known = "known".asInstanceOf[typings.twilioChat.twilioChatStrings.known]
  @scala.inline
  def unknown: typings.twilioChat.twilioChatStrings.unknown = "unknown".asInstanceOf[typings.twilioChat.twilioChatStrings.unknown]
}

