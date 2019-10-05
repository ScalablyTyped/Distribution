package typings.stripe.stripeMod.invoiceItems

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.invoices.IInvoice
import typings.stripe.stripeMod.invoices.IPeriod
import typings.stripe.stripeMod.plans.IPlan
import typings.stripe.stripeMod.subscriptions.ISubscription
import typings.stripe.stripeStrings.invoiceitem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItem extends IResourceObject {
  var amount: Double
  var currency: String
  var customer: String
  var date: Double
  var description: String
  /**
    * If true, discounts will apply to this invoice item. Always false for prorations.
    */
  var discountable: Boolean
  /**
    * If null, the invoice item is pending and will be included in the upcoming invoice. [Expandable]
    */
  var invoice: String | IInvoice | Null
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is "invoiceitem"
    */
  @JSName("object")
  var object_InvoiceItem: invoiceitem
  var period: IPeriod
  /**
    * If the invoice item is a proration, the plan of the subscription that the proration was computed for.
    */
  var plan: IPlan
  /**
    * Whether or not the invoice item was created automatically as a proration adjustment when the customer switched plans
    */
  var proration: Boolean
  /**
    * If the invoice item is a proration, the quantity of the subscription that the proration was computed for.
    */
  var quantity: Double
  /**
    * The subscription that this invoice item has been created for, if any.
    */
  var subscription: String | ISubscription
}

object InvoiceItem {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    customer: String,
    date: Double,
    description: String,
    discountable: Boolean,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: invoiceitem,
    period: IPeriod,
    plan: IPlan,
    proration: Boolean,
    quantity: Double,
    subscription: String | ISubscription,
    invoice: String | IInvoice = null
  ): InvoiceItem = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, customer = customer, date = date, description = description, discountable = discountable, id = id, livemode = livemode, metadata = metadata, period = period, plan = plan, proration = proration, quantity = quantity, subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItem]
  }
}

