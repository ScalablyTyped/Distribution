package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contactemail extends js.Object {
  var contact_email: String = js.native
}

object Contactemail {
  @scala.inline
  def apply(contact_email: String): Contactemail = {
    val __obj = js.Dynamic.literal(contact_email = contact_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contactemail]
  }
  @scala.inline
  implicit class ContactemailOps[Self <: Contactemail] (val x: Self) extends AnyVal {
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
    def setContact_email(value: String): Self = this.set("contact_email", value.asInstanceOf[js.Any])
  }
  
}

