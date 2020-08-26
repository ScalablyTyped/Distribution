package typings.stripe.mod.invoiceItems

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceItemCreationOptions extends IDataOptionsWithMetadata {
  /**
    * The integer amount in cents of the charge to be applied to the upcoming invoice. If you want to apply a credit to the customer’s
    * account, pass a negative amount.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String = js.native
  /**
    * The ID of the customer who will be billed when this invoice item is billed.
    */
  var customer: String = js.native
  /**
    * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items, and true for
    * all other invoice items.
    */
  var discountable: js.UndefOr[Boolean] = js.native
  /**
    * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item will be added to the next upcoming
    * scheduled invoice. Use this when adding invoice items in response to an invoice.created webhook. You cannot add an invoice item
    * to an invoice that has already been paid, attempted or closed.
    */
  var invoice: js.UndefOr[String] = js.native
  /**
    * Non-negative integer. The quantity of units for the invoice item.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The ID of a subscription to add this invoice item to. When left blank, the invoice item will be be added to the next upcoming
    * scheduled invoice. When set, scheduled invoices for subscriptions other than the specified subscription will ignore the invoice
    * item. Use this when you want to express that an invoice item has been accrued within the context of a particular subscription.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * The integer unit amount in cents of the charge to be applied to the upcoming invoice. This unit_amount will be multiplied by
    * the quantity to get the full amount. If you want to apply a credit to the customer’s account, pass a negative unit_amount.
    */
  var unit_amount: js.UndefOr[Double] = js.native
}

object InvoiceItemCreationOptions {
  @scala.inline
  def apply(currency: String, customer: String): InvoiceItemCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItemCreationOptions]
  }
  @scala.inline
  implicit class InvoiceItemCreationOptionsOps[Self <: InvoiceItemCreationOptions] (val x: Self) extends AnyVal {
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
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDiscountable(value: Boolean): Self = this.set("discountable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscountable: Self = this.set("discountable", js.undefined)
    @scala.inline
    def setInvoice(value: String): Self = this.set("invoice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice: Self = this.set("invoice", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    @scala.inline
    def setUnit_amount(value: Double): Self = this.set("unit_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit_amount: Self = this.set("unit_amount", js.undefined)
  }
  
}

