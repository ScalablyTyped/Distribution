package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddressKanji extends js.Object {
  /**
    * City or ward.
    * This can be unset by updating the value to null and then saving.
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Two-letter country code (ISO 3166-1 alpha-2).
    * This can be unset by updating the value to null and then saving.
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Block or building number.
    * This can be unset by updating the value to null and then saving.
    */
  var line1: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Building details.
    * This can be unset by updating the value to null and then saving.
    */
  var line2: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Postal code.
    * This can be unset by updating the value to null and then saving.
    */
  var postal_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Prefecture.
    * This can be unset by updating the value to null and then saving.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Town or cho-me.
    * This can be unset by updating the value to null and then saving.
    */
  var town: js.UndefOr[java.lang.String] = js.undefined
}

object IAddressKanji {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    country: java.lang.String = null,
    line1: java.lang.String = null,
    line2: java.lang.String = null,
    postal_code: java.lang.String = null,
    state: java.lang.String = null,
    town: java.lang.String = null
  ): IAddressKanji = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (line1 != null) __obj.updateDynamic("line1")(line1)
    if (line2 != null) __obj.updateDynamic("line2")(line2)
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code)
    if (state != null) __obj.updateDynamic("state")(state)
    if (town != null) __obj.updateDynamic("town")(town)
    __obj.asInstanceOf[IAddressKanji]
  }
}

