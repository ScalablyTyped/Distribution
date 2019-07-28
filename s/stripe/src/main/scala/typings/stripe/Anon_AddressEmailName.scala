package typings.stripe

import typings.stripe.stripeMod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressEmailName extends js.Object {
  var address: js.UndefOr[IAddress | Null] = js.undefined
  var email: js.UndefOr[String | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var phone: js.UndefOr[String | Null] = js.undefined
  var verified_address: js.UndefOr[IAddress | Null] = js.undefined
  var verified_email: js.UndefOr[String | Null] = js.undefined
  var verified_name: js.UndefOr[String | Null] = js.undefined
  var verified_phone: js.UndefOr[String | Null] = js.undefined
}

object Anon_AddressEmailName {
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
  ): Anon_AddressEmailName = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (verified_address != null) __obj.updateDynamic("verified_address")(verified_address)
    if (verified_email != null) __obj.updateDynamic("verified_email")(verified_email)
    if (verified_name != null) __obj.updateDynamic("verified_name")(verified_name)
    if (verified_phone != null) __obj.updateDynamic("verified_phone")(verified_phone)
    __obj.asInstanceOf[Anon_AddressEmailName]
  }
}

