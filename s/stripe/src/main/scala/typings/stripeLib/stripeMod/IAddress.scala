package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddress extends js.Object {
  /**
    * City/Suburb/Town/Village
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 2-letter country code
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var line1: java.lang.String
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var line2: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Zip/Postal Code
    */
  var postal_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * State/Province/County
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object IAddress {
  @scala.inline
  def apply(
    line1: java.lang.String,
    city: java.lang.String = null,
    country: java.lang.String = null,
    line2: java.lang.String = null,
    postal_code: java.lang.String = null,
    state: java.lang.String = null
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

