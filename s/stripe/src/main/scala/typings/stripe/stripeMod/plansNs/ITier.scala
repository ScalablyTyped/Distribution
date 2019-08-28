package typings.stripe.stripeMod.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITier extends js.Object {
  /**
    * A flat fee for the tier to be added into the total amount
    */
  var flat_amount: Double | Null
  /**
    * Per unit price for units relevant to the tier.
    */
  var unit_amount: Double | Null
  /**
    * Up to and including to this quantity will be contained in the tier.
    */
  var up_to: Double | Null
}

object ITier {
  @scala.inline
  def apply(flat_amount: Int | Double = null, unit_amount: Int | Double = null, up_to: Int | Double = null): ITier = {
    val __obj = js.Dynamic.literal()
    if (flat_amount != null) __obj.updateDynamic("flat_amount")(flat_amount.asInstanceOf[js.Any])
    if (unit_amount != null) __obj.updateDynamic("unit_amount")(unit_amount.asInstanceOf[js.Any])
    if (up_to != null) __obj.updateDynamic("up_to")(up_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITier]
  }
}

