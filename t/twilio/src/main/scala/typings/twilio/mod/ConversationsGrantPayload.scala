package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsGrantPayload extends GrantPayload {
  var configuration_profile_sid: String
}

object ConversationsGrantPayload {
  @scala.inline
  def apply(configuration_profile_sid: String): ConversationsGrantPayload = {
    val __obj = js.Dynamic.literal(configuration_profile_sid = configuration_profile_sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantPayload]
  }
}

