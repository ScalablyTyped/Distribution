package typings.stripe.anon

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phone extends js.Object {
  var address: js.UndefOr[IAddress | Null] = js.undefined
  var email: js.UndefOr[String | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var phone: js.UndefOr[String | Null] = js.undefined
  var verified_address: js.UndefOr[IAddress | Null] = js.undefined
  var verified_email: js.UndefOr[String | Null] = js.undefined
  var verified_name: js.UndefOr[String | Null] = js.undefined
  var verified_phone: js.UndefOr[String | Null] = js.undefined
}

object Phone {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | IAddress] = js.undefined,
    email: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    phone: js.UndefOr[Null | String] = js.undefined,
    verified_address: js.UndefOr[Null | IAddress] = js.undefined,
    verified_email: js.UndefOr[Null | String] = js.undefined,
    verified_name: js.UndefOr[Null | String] = js.undefined,
    verified_phone: js.UndefOr[Null | String] = js.undefined
  ): Phone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (!js.isUndefined(verified_address)) __obj.updateDynamic("verified_address")(verified_address.asInstanceOf[js.Any])
    if (!js.isUndefined(verified_email)) __obj.updateDynamic("verified_email")(verified_email.asInstanceOf[js.Any])
    if (!js.isUndefined(verified_name)) __obj.updateDynamic("verified_name")(verified_name.asInstanceOf[js.Any])
    if (!js.isUndefined(verified_phone)) __obj.updateDynamic("verified_phone")(verified_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
}

