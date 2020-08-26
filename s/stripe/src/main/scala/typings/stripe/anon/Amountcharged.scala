package typings.stripe.anon

import typings.stripe.stripeStrings.available
import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.missing
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.requested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amountcharged extends js.Object {
  var address: String = js.native
  var amount_charged: Double = js.native
  var amount_received: Double = js.native
  var amount_returned: Double = js.native
  var refund_attributes_method: email | manual | none = js.native
  var refund_attributes_status: missing | requested | available = js.native
}

object Amountcharged {
  @scala.inline
  def apply(
    address: String,
    amount_charged: Double,
    amount_received: Double,
    amount_returned: Double,
    refund_attributes_method: email | manual | none,
    refund_attributes_status: missing | requested | available
  ): Amountcharged = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount_charged = amount_charged.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], refund_attributes_method = refund_attributes_method.asInstanceOf[js.Any], refund_attributes_status = refund_attributes_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amountcharged]
  }
  @scala.inline
  implicit class AmountchargedOps[Self <: Amountcharged] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount_charged(value: Double): Self = this.set("amount_charged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount_received(value: Double): Self = this.set("amount_received", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount_returned(value: Double): Self = this.set("amount_returned", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefund_attributes_method(value: email | manual | none): Self = this.set("refund_attributes_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefund_attributes_status(value: missing | requested | available): Self = this.set("refund_attributes_status", value.asInstanceOf[js.Any])
  }
  
}

