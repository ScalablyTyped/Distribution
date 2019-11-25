package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddressKanji extends js.Object {
  /**
    * City or ward.
    * This can be unset by updating the value to null and then saving.
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * Two-letter country code (ISO 3166-1 alpha-2).
    * This can be unset by updating the value to null and then saving.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * Block or building number.
    * This can be unset by updating the value to null and then saving.
    */
  var line1: js.UndefOr[String] = js.undefined
  /**
    * Building details.
    * This can be unset by updating the value to null and then saving.
    */
  var line2: js.UndefOr[String] = js.undefined
  /**
    * Postal code.
    * This can be unset by updating the value to null and then saving.
    */
  var postal_code: js.UndefOr[String] = js.undefined
  /**
    * Prefecture.
    * This can be unset by updating the value to null and then saving.
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * Town or cho-me.
    * This can be unset by updating the value to null and then saving.
    */
  var town: js.UndefOr[String] = js.undefined
}

object IAddressKanji {
  @scala.inline
  def apply(
    city: String = null,
    country: String = null,
    line1: String = null,
    line2: String = null,
    postal_code: String = null,
    state: String = null,
    town: String = null
  ): IAddressKanji = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (line1 != null) __obj.updateDynamic("line1")(line1.asInstanceOf[js.Any])
    if (line2 != null) __obj.updateDynamic("line2")(line2.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (town != null) __obj.updateDynamic("town")(town.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddressKanji]
  }
}

