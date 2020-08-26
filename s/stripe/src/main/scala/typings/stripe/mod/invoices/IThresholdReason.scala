package typings.stripe.mod.invoices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThresholdReason extends js.Object {
  /**
    * The total invoice amount threshold boundary if it triggered the threshold invoice.
    */
  var amount_gte: Double = js.native
  /**
    * Indicates which line items triggered a threshold invoice.
    */
  var item_reasons: js.Array[IItemReason] = js.native
}

object IThresholdReason {
  @scala.inline
  def apply(amount_gte: Double, item_reasons: js.Array[IItemReason]): IThresholdReason = {
    val __obj = js.Dynamic.literal(amount_gte = amount_gte.asInstanceOf[js.Any], item_reasons = item_reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThresholdReason]
  }
  @scala.inline
  implicit class IThresholdReasonOps[Self <: IThresholdReason] (val x: Self) extends AnyVal {
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
    def setItem_reasonsVarargs(value: IItemReason*): Self = this.set("item_reasons", js.Array(value :_*))
    @scala.inline
    def setItem_reasons(value: js.Array[IItemReason]): Self = this.set("item_reasons", value.asInstanceOf[js.Any])
  }
  
}

