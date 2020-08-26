package typings.stripe.anon

import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refundattributesmethod extends js.Object {
  var refund_attributes_method: js.UndefOr[email | manual] = js.native
}

object Refundattributesmethod {
  @scala.inline
  def apply(): Refundattributesmethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refundattributesmethod]
  }
  @scala.inline
  implicit class RefundattributesmethodOps[Self <: Refundattributesmethod] (val x: Self) extends AnyVal {
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
    def setRefund_attributes_method(value: email | manual): Self = this.set("refund_attributes_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_attributes_method: Self = this.set("refund_attributes_method", js.undefined)
  }
  
}

