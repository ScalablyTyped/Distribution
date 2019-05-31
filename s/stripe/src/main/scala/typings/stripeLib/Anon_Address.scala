package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.UndefOr[stripeLib.stripeMod.IAddress | scala.Null] = js.undefined
  var email: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var phone: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var verified_address: js.UndefOr[stripeLib.stripeMod.IAddress | scala.Null] = js.undefined
  var verified_email: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var verified_name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var verified_phone: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    address: stripeLib.stripeMod.IAddress = null,
    email: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    verified_address: stripeLib.stripeMod.IAddress = null,
    verified_email: java.lang.String = null,
    verified_name: java.lang.String = null,
    verified_phone: java.lang.String = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (verified_address != null) __obj.updateDynamic("verified_address")(verified_address)
    if (verified_email != null) __obj.updateDynamic("verified_email")(verified_email)
    if (verified_name != null) __obj.updateDynamic("verified_name")(verified_name)
    if (verified_phone != null) __obj.updateDynamic("verified_phone")(verified_phone)
    __obj.asInstanceOf[Anon_Address]
  }
}

