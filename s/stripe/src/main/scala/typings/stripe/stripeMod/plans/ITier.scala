package typings.stripe.stripeMod.plans

import typings.stripe.stripeStrings.inf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITier extends js.Object {
  /**
    * Price for the entire tier.
    */
  var flat_amount: js.UndefOr[Double | Null] = js.undefined
  /**
    * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
    */
  var flat_amount_decimal: js.UndefOr[Double | Null] = js.undefined
  /**
    * Per unit price for units relevant to the tier.
    */
  var unit_amount: js.UndefOr[Double | Null] = js.undefined
  /**
    * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
    */
  var unit_amount_decimal: js.UndefOr[Double | Null] = js.undefined
  /**
    * Up to and including to this quantity will be contained in the tier.
    */
  var up_to: Double | Null | inf
}

object ITier {
  @scala.inline
  def apply(
    flat_amount: Int | Double = null,
    flat_amount_decimal: Int | Double = null,
    unit_amount: Int | Double = null,
    unit_amount_decimal: Int | Double = null,
    up_to: Double | inf = null
  ): ITier = {
    val __obj = js.Dynamic.literal()
    if (flat_amount != null) __obj.updateDynamic("flat_amount")(flat_amount.asInstanceOf[js.Any])
    if (flat_amount_decimal != null) __obj.updateDynamic("flat_amount_decimal")(flat_amount_decimal.asInstanceOf[js.Any])
    if (unit_amount != null) __obj.updateDynamic("unit_amount")(unit_amount.asInstanceOf[js.Any])
    if (unit_amount_decimal != null) __obj.updateDynamic("unit_amount_decimal")(unit_amount_decimal.asInstanceOf[js.Any])
    if (up_to != null) __obj.updateDynamic("up_to")(up_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITier]
  }
}

