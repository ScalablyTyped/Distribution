package typings.twilioDashChat.libMessageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.body
  - typings.twilioDashChat.twilioDashChatStrings.lastUpdatedBy
  - typings.twilioDashChat.twilioDashChatStrings.dateUpdated
  - typings.twilioDashChat.twilioDashChatStrings.timestamp
  - typings.twilioDashChat.twilioDashChatStrings.attributes
  - typings.twilioDashChat.twilioDashChatStrings.author
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typings.twilioDashChat.twilioDashChatStrings.attributes = this.cast("attributes")
  @scala.inline
  def author: typings.twilioDashChat.twilioDashChatStrings.author = this.cast("author")
  @scala.inline
  def body: typings.twilioDashChat.twilioDashChatStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dateUpdated: typings.twilioDashChat.twilioDashChatStrings.dateUpdated = this.cast("dateUpdated")
  @scala.inline
  def lastUpdatedBy: typings.twilioDashChat.twilioDashChatStrings.lastUpdatedBy = this.cast("lastUpdatedBy")
  @scala.inline
  def timestamp: typings.twilioDashChat.twilioDashChatStrings.timestamp = this.cast("timestamp")
}

