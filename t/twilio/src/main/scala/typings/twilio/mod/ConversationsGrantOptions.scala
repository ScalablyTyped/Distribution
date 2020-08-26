package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationsGrantOptions extends js.Object {
  var configurationProfileSid: String = js.native
}

object ConversationsGrantOptions {
  @scala.inline
  def apply(configurationProfileSid: String): ConversationsGrantOptions = {
    val __obj = js.Dynamic.literal(configurationProfileSid = configurationProfileSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantOptions]
  }
  @scala.inline
  implicit class ConversationsGrantOptionsOps[Self <: ConversationsGrantOptions] (val x: Self) extends AnyVal {
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
    def setConfigurationProfileSid(value: String): Self = this.set("configurationProfileSid", value.asInstanceOf[js.Any])
  }
  
}

