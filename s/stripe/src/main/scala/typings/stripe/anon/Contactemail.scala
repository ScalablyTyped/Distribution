package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contactemail extends js.Object {
  var contact_email: String
}

object Contactemail {
  @scala.inline
  def apply(contact_email: String): Contactemail = {
    val __obj = js.Dynamic.literal(contact_email = contact_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contactemail]
  }
}

