package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeClientCheckoutOptions extends js.Object {
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.native
  var cancelUrl: String = js.native
  var clientReferenceId: js.UndefOr[String] = js.native
  var customerEmail: js.UndefOr[String] = js.native
  var items: js.Array[StripeCheckoutItem] = js.native
  var locale: js.UndefOr[String] = js.native
  var successUrl: String = js.native
}

object StripeClientCheckoutOptions {
  @scala.inline
  def apply(cancelUrl: String, items: js.Array[StripeCheckoutItem], successUrl: String): StripeClientCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], successUrl = successUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeClientCheckoutOptions]
  }
  @scala.inline
  implicit class StripeClientCheckoutOptionsOps[Self <: StripeClientCheckoutOptions] (val x: Self) extends AnyVal {
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
    def setCancelUrl(value: String): Self = this.set("cancelUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: StripeCheckoutItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[StripeCheckoutItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessUrl(value: String): Self = this.set("successUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setBillingAddressCollection(value: billingAddressCollectionType): Self = this.set("billingAddressCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddressCollection: Self = this.set("billingAddressCollection", js.undefined)
    @scala.inline
    def setClientReferenceId(value: String): Self = this.set("clientReferenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientReferenceId: Self = this.set("clientReferenceId", js.undefined)
    @scala.inline
    def setCustomerEmail(value: String): Self = this.set("customerEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerEmail: Self = this.set("customerEmail", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

