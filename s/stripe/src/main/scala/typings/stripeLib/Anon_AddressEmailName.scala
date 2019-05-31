package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressEmailName extends js.Object {
  var address: js.UndefOr[stdLib.Partial[stripeLib.stripeMod.IAddress] | scala.Null] = js.undefined
  var email: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var phone: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_AddressEmailName {
  @scala.inline
  def apply(
    address: stdLib.Partial[stripeLib.stripeMod.IAddress] = null,
    email: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null
  ): Anon_AddressEmailName = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    __obj.asInstanceOf[Anon_AddressEmailName]
  }
}

