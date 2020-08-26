package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amountgte extends js.Object {
  /**
    * Monetary threshold that triggers the subscription to create an invoice.
    */
  var amount_gte: Double = js.native
  /**
    * Indicates if the billing_cycle_anchor should be reset when a threshold is reached. If true, billing_cycle_anchor
    * will be updated to the date/time the threshold was last reached; otherwise, the value will remain unchanged.
    * This value may not be true if the subscription contains items with plans that have aggregate_usage=last_ever.
    */
  var reset_billing_cycle_anchor: Boolean = js.native
}

object Amountgte {
  @scala.inline
  def apply(amount_gte: Double, reset_billing_cycle_anchor: Boolean): Amountgte = {
    val __obj = js.Dynamic.literal(amount_gte = amount_gte.asInstanceOf[js.Any], reset_billing_cycle_anchor = reset_billing_cycle_anchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amountgte]
  }
  @scala.inline
  implicit class AmountgteOps[Self <: Amountgte] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount_gte(value: Double): Self = this.set("amount_gte", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset_billing_cycle_anchor(value: Boolean): Self = this.set("reset_billing_cycle_anchor", value.asInstanceOf[js.Any])
  }
  
}

