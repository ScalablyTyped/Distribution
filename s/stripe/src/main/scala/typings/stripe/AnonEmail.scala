package typings.stripe

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var address: IAddress | Null
  var email: String | Null
  var name: String | Null
  /** Billing phone number (including extension). */
  var phone: String | Null
}

object AnonEmail {
  @scala.inline
  def apply(address: IAddress = null, email: String = null, name: String = null, phone: String = null): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

