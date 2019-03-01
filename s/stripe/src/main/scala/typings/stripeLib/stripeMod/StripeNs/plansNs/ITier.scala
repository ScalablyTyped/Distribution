package typings
package stripeLib.stripeMod.StripeNs.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITier extends js.Object {
  /**
    * Per unit price for units relevant to the tier.
    */
  var amount: scala.Double
  /**
    * Up to and including to this quantity will be contained in the tier.
    */
  var up_to: scala.Double
}

object ITier {
  @scala.inline
  def apply(amount: scala.Double, up_to: scala.Double): ITier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("up_to")(up_to)
    __obj.asInstanceOf[ITier]
  }
}

