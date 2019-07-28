package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddress extends js.Object {
  /**
    * City/Suburb/Town/Village
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 2-letter country code
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var line1: String
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var line2: js.UndefOr[String] = js.undefined
  /**
    * Zip/Postal Code
    */
  var postal_code: js.UndefOr[String] = js.undefined
  /**
    * State/Province/County
    */
  var state: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(line1 = line1)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (line2 != null) __obj.updateDynamic("line2")(line2)
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IAddress]
  }
}

