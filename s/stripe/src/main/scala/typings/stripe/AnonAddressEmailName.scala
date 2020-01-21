package typings.stripe

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressEmailName extends js.Object {
  var address: js.UndefOr[IAddress | Null] = js.undefined
  var email: js.UndefOr[String | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var phone: js.UndefOr[String | Null] = js.undefined
  var verified_address: js.UndefOr[IAddress | Null] = js.undefined
  var verified_email: js.UndefOr[String | Null] = js.undefined
  var verified_name: js.UndefOr[String | Null] = js.undefined
  var verified_phone: js.UndefOr[String | Null] = js.undefined
}

object AnonAddressEmailName {
  @scala.inline
  def apply(
    address: IAddress = null,
    email: String = null,
    name: String = null,
    phone: String = null,
    verified_address: IAddress = null,
    verified_email: String = null,
    verified_name: String = null,
    verified_phone: String = null
  ): AnonAddressEmailName = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (verified_address != null) __obj.updateDynamic("verified_address")(verified_address.asInstanceOf[js.Any])
    if (verified_email != null) __obj.updateDynamic("verified_email")(verified_email.asInstanceOf[js.Any])
    if (verified_name != null) __obj.updateDynamic("verified_name")(verified_name.asInstanceOf[js.Any])
    if (verified_phone != null) __obj.updateDynamic("verified_phone")(verified_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressEmailName]
  }
}

