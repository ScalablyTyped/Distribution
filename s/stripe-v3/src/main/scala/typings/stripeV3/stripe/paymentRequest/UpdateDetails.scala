package typings.stripeV3.stripe.paymentRequest

import typings.stripeV3.stripeV3Strings.fail
import typings.stripeV3.stripeV3Strings.invalid_shipping_address
import typings.stripeV3.stripeV3Strings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetails extends js.Object {
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.native
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
  var status: success | fail | invalid_shipping_address = js.native
  var total: js.UndefOr[DisplayItem] = js.native
}

object UpdateDetails {
  @scala.inline
  def apply(status: success | fail | invalid_shipping_address): UpdateDetails = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetails]
  }
  @scala.inline
  implicit class UpdateDetailsOps[Self <: UpdateDetails] (val x: Self) extends AnyVal {
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
    def setStatus(value: success | fail | invalid_shipping_address): Self = this.set("status", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setTotal(value: DisplayItem): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

