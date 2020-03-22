package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineAcceptanceMandate extends js.Object {
  var contact_email: String
}

object OfflineAcceptanceMandate {
  @scala.inline
  def apply(contact_email: String): OfflineAcceptanceMandate = {
    val __obj = js.Dynamic.literal(contact_email = contact_email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OfflineAcceptanceMandate]
  }
}

