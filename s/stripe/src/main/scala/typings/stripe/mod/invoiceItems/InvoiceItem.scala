package typings.stripe.mod.invoiceItems

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.invoices.IInvoice
import typings.stripe.mod.invoices.IPeriod
import typings.stripe.mod.plans.IPlan
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.stripeStrings.invoiceitem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItem extends IResourceObject {
  var amount: Double
  var currency: String
  var customer: String | ICustomer
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
    customer: String | ICustomer,
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
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discountable = discountable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], proration = proration.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (invoice != null) __obj.updateDynamic("invoice")(invoice.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItem]
  }
}

