package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[Boolean] = js.undefined
  var phoneNumber: js.UndefOr[Boolean] = js.undefined
  var shippingAddress: js.UndefOr[Boolean] = js.undefined
}

object Email {
  @scala.inline
  def apply(
    email: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    phoneNumber: js.UndefOr[Boolean] = js.undefined,
    shippingAddress: js.UndefOr[Boolean] = js.undefined
  ): Email = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.get.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.get.asInstanceOf[js.Any])
    if (!js.isUndefined(phoneNumber)) __obj.updateDynamic("phoneNumber")(phoneNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shippingAddress)) __obj.updateDynamic("shippingAddress")(shippingAddress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

