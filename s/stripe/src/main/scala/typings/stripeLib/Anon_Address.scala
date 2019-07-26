package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: stripeLib.stripeMod.IAddress | scala.Null
  var email: java.lang.String | scala.Null
  var name: java.lang.String | scala.Null
  /** Billing phone number (including extension). */
  var phone: java.lang.String | scala.Null
}

object Anon_Address {
  @scala.inline
  def apply(
    address: stripeLib.stripeMod.IAddress = null,
    email: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    __obj.asInstanceOf[Anon_Address]
  }
}

