package typings.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.ascending
  - typings.twilioChat.twilioChatStrings.descending
*/
trait ChannelSortingOrder extends js.Object

object ChannelSortingOrder {
  @scala.inline
  def ascending: typings.twilioChat.twilioChatStrings.ascending = this.cast("ascending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def descending: typings.twilioChat.twilioChatStrings.descending = this.cast("descending")
}

