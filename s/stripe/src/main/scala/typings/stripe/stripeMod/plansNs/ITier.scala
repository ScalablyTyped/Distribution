package typings.stripe.stripeMod.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITier extends js.Object {
  /**
    * A flat fee for the tier to be added into the total amount
    */
  var flat_amount: Double
  /**
    * Per unit price for units relevant to the tier.
    */
  var unit_amount: Double
  /**
    * Up to and including to this quantity will be contained in the tier.
    */
  var up_to: Double
}

object ITier {
  @scala.inline
  def apply(flat_amount: Double, unit_amount: Double, up_to: Double): ITier = {
    val __obj = js.Dynamic.literal(flat_amount = flat_amount, unit_amount = unit_amount, up_to = up_to)
  
    __obj.asInstanceOf[ITier]
  }
}

