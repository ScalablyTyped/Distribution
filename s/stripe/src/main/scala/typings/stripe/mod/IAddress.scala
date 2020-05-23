package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddress extends js.Object {
  /**
    * City/Suburb/Town/Village
    */
  var city: js.UndefOr[String | Null] = js.undefined
  /**
    * 2-letter country code
    */
  var country: js.UndefOr[String | Null] = js.undefined
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var line1: String
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var line2: js.UndefOr[String | Null] = js.undefined
  /**
    * Zip/Postal Code
    */
  var postal_code: js.UndefOr[String | Null] = js.undefined
  /**
    * State/Province/County
    */
  var state: js.UndefOr[String | Null] = js.undefined
}

object IAddress {
  @scala.inline
  def apply(
    line1: String,
    city: js.UndefOr[Null | String] = js.undefined,
    country: js.UndefOr[Null | String] = js.undefined,
    line2: js.UndefOr[Null | String] = js.undefined,
    postal_code: js.UndefOr[Null | String] = js.undefined,
    state: js.UndefOr[Null | String] = js.undefined
  ): IAddress = {
    val __obj = js.Dynamic.literal(line1 = line1.asInstanceOf[js.Any])
    if (!js.isUndefined(city)) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (!js.isUndefined(country)) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(line2)) __obj.updateDynamic("line2")(line2.asInstanceOf[js.Any])
    if (!js.isUndefined(postal_code)) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddress]
  }
}

