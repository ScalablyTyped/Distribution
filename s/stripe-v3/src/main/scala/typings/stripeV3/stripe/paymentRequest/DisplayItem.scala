package typings.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayItem extends js.Object {
  var amount: Double = js.native
  var label: String = js.native
  var pending: js.UndefOr[Boolean] = js.native
}

object DisplayItem {
  @scala.inline
  def apply(amount: Double, label: String): DisplayItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayItem]
  }
  @scala.inline
  implicit class DisplayItemOps[Self <: DisplayItem] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
  }
  
}

