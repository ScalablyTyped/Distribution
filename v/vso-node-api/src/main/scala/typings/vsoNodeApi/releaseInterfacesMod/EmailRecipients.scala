package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailRecipients extends js.Object {
  var emailAddresses: js.Array[String] = js.native
  var tfsIds: js.Array[String] = js.native
}

object EmailRecipients {
  @scala.inline
  def apply(emailAddresses: js.Array[String], tfsIds: js.Array[String]): EmailRecipients = {
    val __obj = js.Dynamic.literal(emailAddresses = emailAddresses.asInstanceOf[js.Any], tfsIds = tfsIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipients]
  }
  @scala.inline
  implicit class EmailRecipientsOps[Self <: EmailRecipients] (val x: Self) extends AnyVal {
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
    def setEmailAddressesVarargs(value: String*): Self = this.set("emailAddresses", js.Array(value :_*))
    @scala.inline
    def setEmailAddresses(value: js.Array[String]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setTfsIdsVarargs(value: String*): Self = this.set("tfsIds", js.Array(value :_*))
    @scala.inline
    def setTfsIds(value: js.Array[String]): Self = this.set("tfsIds", value.asInstanceOf[js.Any])
  }
  
}

