package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[scala.Boolean] = js.undefined
  var phoneNumber: js.UndefOr[scala.Boolean] = js.undefined
  var shippingAddress: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    email: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    phoneNumber: js.UndefOr[scala.Boolean] = js.undefined,
    shippingAddress: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(phoneNumber)) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (!js.isUndefined(shippingAddress)) __obj.updateDynamic("shippingAddress")(shippingAddress)
    __obj.asInstanceOf[Anon_Email]
  }
}

