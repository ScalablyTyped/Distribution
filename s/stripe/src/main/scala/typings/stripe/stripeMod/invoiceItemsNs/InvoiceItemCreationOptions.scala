package typings.stripe.stripeMod.invoiceItemsNs

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItemCreationOptions extends IDataOptionsWithMetadata {
  /**
    * The integer amount in cents of the charge to be applied to the upcoming invoice. If you want to apply a credit to the customer’s
    * account, pass a negative amount.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String
  /**
    * The ID of the customer who will be billed when this invoice item is billed.
    */
  var customer: String
  /**
    * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items, and true for
    * all other invoice items.
    */
  var discountable: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item will be added to the next upcoming
    * scheduled invoice. Use this when adding invoice items in response to an invoice.created webhook. You cannot add an invoice item
    * to an invoice that has already been paid, attempted or closed.
    */
  var invoice: js.UndefOr[String] = js.undefined
  /**
    * Non-negative integer. The quantity of units for the invoice item.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * The ID of a subscription to add this invoice item to. When left blank, the invoice item will be be added to the next upcoming
    * scheduled invoice. When set, scheduled invoices for subscriptions other than the specified subscription will ignore the invoice
    * item. Use this when you want to express that an invoice item has been accrued within the context of a particular subscription.
    */
  var subscription: js.UndefOr[String] = js.undefined
  /**
    * The integer unit amount in cents of the charge to be applied to the upcoming invoice. This unit_amount will be multiplied by
    * the quantity to get the full amount. If you want to apply a credit to the customer’s account, pass a negative unit_amount.
    */
  var unit_amount: js.UndefOr[Double] = js.undefined
}

object InvoiceItemCreationOptions {
  @scala.inline
  def apply(
    currency: String,
    customer: String,
    amount: Int | Double = null,
    description: String = null,
    discountable: js.UndefOr[Boolean] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    invoice: String = null,
    metadata: IOptionsMetadata = null,
    quantity: Int | Double = null,
    subscription: String = null,
    unit_amount: Int | Double = null
  ): InvoiceItemCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency, customer = customer)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(discountable)) __obj.updateDynamic("discountable")(discountable)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (unit_amount != null) __obj.updateDynamic("unit_amount")(unit_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItemCreationOptions]
  }
}

