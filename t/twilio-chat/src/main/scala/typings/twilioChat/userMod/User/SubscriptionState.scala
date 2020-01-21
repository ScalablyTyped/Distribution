package typings.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.initializing
  - typings.twilioChat.twilioChatStrings.subscribed
  - typings.twilioChat.twilioChatStrings.unsubscribed
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initializing: typings.twilioChat.twilioChatStrings.initializing = this.cast("initializing")
  @scala.inline
  def subscribed: typings.twilioChat.twilioChatStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typings.twilioChat.twilioChatStrings.unsubscribed = this.cast("unsubscribed")
}

