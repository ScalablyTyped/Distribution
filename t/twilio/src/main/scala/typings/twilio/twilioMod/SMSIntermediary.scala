package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSIntermediary extends js.Object {
  var messages: SMSMessageResource
  var shortCodes: SMSShortCodeResource
}

object SMSIntermediary {
  @scala.inline
  def apply(messages: SMSMessageResource, shortCodes: SMSShortCodeResource): SMSIntermediary = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], shortCodes = shortCodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SMSIntermediary]
  }
}

