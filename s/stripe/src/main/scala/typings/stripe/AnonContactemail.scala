package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContactemail extends js.Object {
  var contact_email: String
}

object AnonContactemail {
  @scala.inline
  def apply(contact_email: String): AnonContactemail = {
    val __obj = js.Dynamic.literal(contact_email = contact_email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContactemail]
  }
}

