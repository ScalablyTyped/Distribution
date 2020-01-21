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
    city: String = null,
    country: String = null,
    line2: String = null,
    postal_code: String = null,
    state: String = null
  ): IAddress = {
    val __obj = js.Dynamic.literal(line1 = line1.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (line2 != null) __obj.updateDynamic("line2")(line2.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddress]
  }
}

