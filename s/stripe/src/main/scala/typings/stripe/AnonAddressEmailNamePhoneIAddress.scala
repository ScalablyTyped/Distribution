package typings.stripe

import typings.std.Partial
import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressEmailNamePhoneIAddress extends js.Object {
  var address: js.UndefOr[Partial[IAddress] | Null] = js.undefined
  var email: js.UndefOr[String | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var phone: js.UndefOr[String | Null] = js.undefined
}

object AnonAddressEmailNamePhoneIAddress {
  @scala.inline
  def apply(address: Partial[IAddress] = null, email: String = null, name: String = null, phone: String = null): AnonAddressEmailNamePhoneIAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressEmailNamePhoneIAddress]
  }
}

