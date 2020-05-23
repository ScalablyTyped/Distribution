package typings.stripe.anon

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressEmail extends js.Object {
  var address: js.UndefOr[IAddress | Null] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
}

object AddressEmail {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | IAddress] = js.undefined,
    email: String = null,
    name: String = null,
    phone: String = null
  ): AddressEmail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressEmail]
  }
}

