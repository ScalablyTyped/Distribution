package typings.stripe.mod.invoices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThresholdReason extends js.Object {
  /**
    * The total invoice amount threshold boundary if it triggered the threshold invoice.
    */
  var amount_gte: Double
  /**
    * Indicates which line items triggered a threshold invoice.
    */
  var item_reasons: js.Array[IItemReason]
}

object IThresholdReason {
  @scala.inline
  def apply(amount_gte: Double, item_reasons: js.Array[IItemReason]): IThresholdReason = {
    val __obj = js.Dynamic.literal(amount_gte = amount_gte.asInstanceOf[js.Any], item_reasons = item_reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThresholdReason]
  }
}

