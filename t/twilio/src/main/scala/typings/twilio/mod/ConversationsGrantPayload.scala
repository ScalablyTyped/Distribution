package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationsGrantPayload extends GrantPayload {
  var configuration_profile_sid: String = js.native
}

object ConversationsGrantPayload {
  @scala.inline
  def apply(configuration_profile_sid: String): ConversationsGrantPayload = {
    val __obj = js.Dynamic.literal(configuration_profile_sid = configuration_profile_sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantPayload]
  }
  @scala.inline
  implicit class ConversationsGrantPayloadOps[Self <: ConversationsGrantPayload] (val x: Self) extends AnyVal {
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
    def setConfiguration_profile_sid(value: String): Self = this.set("configuration_profile_sid", value.asInstanceOf[js.Any])
  }
  
}

