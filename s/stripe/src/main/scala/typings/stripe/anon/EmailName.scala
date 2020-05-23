package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailName extends js.Object {
  var address: js.UndefOr[PartialIAddress | Null] = js.undefined
  var email: js.UndefOr[String | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var phone: js.UndefOr[String | Null] = js.undefined
}

object EmailName {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | PartialIAddress] = js.undefined,
    email: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    phone: js.UndefOr[Null | String] = js.undefined
  ): EmailName = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailName]
  }
}

