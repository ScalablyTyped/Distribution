package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[Boolean] = js.undefined
  var phoneNumber: js.UndefOr[Boolean] = js.undefined
  var shippingAddress: js.UndefOr[Boolean] = js.undefined
}

object AnonEmail {
  @scala.inline
  def apply(
    email: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    phoneNumber: js.UndefOr[Boolean] = js.undefined,
    shippingAddress: js.UndefOr[Boolean] = js.undefined
  ): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(phoneNumber)) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(shippingAddress)) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

