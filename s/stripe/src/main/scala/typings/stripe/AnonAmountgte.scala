package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountgte extends js.Object {
  /**
    * Monetary threshold that triggers the subscription to create an invoice.
    */
  var amount_gte: Double
  /**
    * Indicates if the billing_cycle_anchor should be reset when a threshold is reached. If true, billing_cycle_anchor
    * will be updated to the date/time the threshold was last reached; otherwise, the value will remain unchanged.
    * This value may not be true if the subscription contains items with plans that have aggregate_usage=last_ever.
    */
  var reset_billing_cycle_anchor: Boolean
}

object AnonAmountgte {
  @scala.inline
  def apply(amount_gte: Double, reset_billing_cycle_anchor: Boolean): AnonAmountgte = {
    val __obj = js.Dynamic.literal(amount_gte = amount_gte.asInstanceOf[js.Any], reset_billing_cycle_anchor = reset_billing_cycle_anchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountgte]
  }
}

