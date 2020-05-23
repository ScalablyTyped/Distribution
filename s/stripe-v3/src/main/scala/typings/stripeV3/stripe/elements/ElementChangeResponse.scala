package typings.stripeV3.stripe.elements

import typings.stripeV3.anon.PostalCode
import typings.stripeV3.stripe.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementChangeResponse extends js.Object {
  var bankName: js.UndefOr[String] = js.undefined
  var brand: String
  var complete: Boolean
  var country: js.UndefOr[String] = js.undefined
  var elementType: String
  var empty: Boolean
  var error: js.UndefOr[Error] = js.undefined
  var value: js.UndefOr[PostalCode | String] = js.undefined
}

object ElementChangeResponse {
  @scala.inline
  def apply(
    brand: String,
    complete: Boolean,
    elementType: String,
    empty: Boolean,
    bankName: String = null,
    country: String = null,
    error: Error = null,
    value: PostalCode | String = null
  ): ElementChangeResponse = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any])
    if (bankName != null) __obj.updateDynamic("bankName")(bankName.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChangeResponse]
  }
}

