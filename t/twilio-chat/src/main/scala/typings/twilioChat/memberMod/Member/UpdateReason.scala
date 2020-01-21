package typings.twilioChat.memberMod.Member

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.attributes
  - typings.twilioChat.twilioChatStrings.dateCreated
  - typings.twilioChat.twilioChatStrings.dateUpdated
  - typings.twilioChat.twilioChatStrings.roleSid
  - typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex
  - typings.twilioChat.twilioChatStrings.lastConsumptionTimestamp
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typings.twilioChat.twilioChatStrings.attributes = this.cast("attributes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dateCreated: typings.twilioChat.twilioChatStrings.dateCreated = this.cast("dateCreated")
  @scala.inline
  def dateUpdated: typings.twilioChat.twilioChatStrings.dateUpdated = this.cast("dateUpdated")
  @scala.inline
  def lastConsumedMessageIndex: typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex = this.cast("lastConsumedMessageIndex")
  @scala.inline
  def lastConsumptionTimestamp: typings.twilioChat.twilioChatStrings.lastConsumptionTimestamp = this.cast("lastConsumptionTimestamp")
  @scala.inline
  def roleSid: typings.twilioChat.twilioChatStrings.roleSid = this.cast("roleSid")
}

