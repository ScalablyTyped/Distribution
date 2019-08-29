package typings.stripe

import typings.stripe.stripeMod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.UndefOr[IAddress] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(address: IAddress = null, email: String = null, name: String = null, phone: String = null): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    __obj.asInstanceOf[Anon_Address]
  }
}

