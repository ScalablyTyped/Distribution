package typings.twilioChat.messageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.body
  - typings.twilioChat.twilioChatStrings.lastUpdatedBy
  - typings.twilioChat.twilioChatStrings.dateUpdated
  - typings.twilioChat.twilioChatStrings.timestamp
  - typings.twilioChat.twilioChatStrings.attributes
  - typings.twilioChat.twilioChatStrings.author
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typings.twilioChat.twilioChatStrings.attributes = this.cast("attributes")
  @scala.inline
  def author: typings.twilioChat.twilioChatStrings.author = this.cast("author")
  @scala.inline
  def body: typings.twilioChat.twilioChatStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dateUpdated: typings.twilioChat.twilioChatStrings.dateUpdated = this.cast("dateUpdated")
  @scala.inline
  def lastUpdatedBy: typings.twilioChat.twilioChatStrings.lastUpdatedBy = this.cast("lastUpdatedBy")
  @scala.inline
  def timestamp: typings.twilioChat.twilioChatStrings.timestamp = this.cast("timestamp")
}

