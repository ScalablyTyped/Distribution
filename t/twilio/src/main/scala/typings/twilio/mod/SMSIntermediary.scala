package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSIntermediary extends js.Object {
  var messages: SMSMessageResource = js.native
  var shortCodes: SMSShortCodeResource = js.native
}

object SMSIntermediary {
  @scala.inline
  def apply(messages: SMSMessageResource, shortCodes: SMSShortCodeResource): SMSIntermediary = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], shortCodes = shortCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSIntermediary]
  }
  @scala.inline
  implicit class SMSIntermediaryOps[Self <: SMSIntermediary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessages(value: SMSMessageResource): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortCodes(value: SMSShortCodeResource): Self = this.set("shortCodes", value.asInstanceOf[js.Any])
  }
  
}

