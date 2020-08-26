package typings.stripeV3.stripe

import typings.stripeV3.anon.Bank
import typings.stripeV3.anon.Iban
import typings.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodData extends js.Object {
  var billing_details: js.UndefOr[BillingDetails] = js.native
  var card: js.UndefOr[Element] = js.native
  var ideal: js.UndefOr[Element | Bank] = js.native
  var sepa_debit: js.UndefOr[Element | Iban] = js.native
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var `type`: String = js.native
}

object PaymentMethodData {
  @scala.inline
  def apply(`type`: String): PaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  @scala.inline
  implicit class PaymentMethodDataOps[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_details: Self = this.set("billing_details", js.undefined)
    @scala.inline
    def setCard(value: Element): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setIdeal(value: Element | Bank): Self = this.set("ideal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
    @scala.inline
    def setSepa_debit(value: Element | Iban): Self = this.set("sepa_debit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSepa_debit: Self = this.set("sepa_debit", js.undefined)
  }
  
}

