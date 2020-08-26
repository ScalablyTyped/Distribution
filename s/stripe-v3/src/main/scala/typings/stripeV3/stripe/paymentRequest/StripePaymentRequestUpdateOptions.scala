package typings.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentRequestUpdateOptions extends js.Object {
  var currency: String = js.native
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.native
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
  var total: DisplayItem = js.native
}

object StripePaymentRequestUpdateOptions {
  @scala.inline
  def apply(currency: String, total: DisplayItem): StripePaymentRequestUpdateOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentRequestUpdateOptions]
  }
  @scala.inline
  implicit class StripePaymentRequestUpdateOptionsOps[Self <: StripePaymentRequestUpdateOptions] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: DisplayItem): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayItemsVarargs(value: DisplayItem*): Self = this.set("displayItems", js.Array(value :_*))
    @scala.inline
    def setDisplayItems(value: js.Array[DisplayItem]): Self = this.set("displayItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayItems: Self = this.set("displayItems", js.undefined)
    @scala.inline
    def setShippingOptionsVarargs(value: ShippingOption*): Self = this.set("shippingOptions", js.Array(value :_*))
    @scala.inline
    def setShippingOptions(value: js.Array[ShippingOption]): Self = this.set("shippingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOptions: Self = this.set("shippingOptions", js.undefined)
  }
  
}

