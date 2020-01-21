package typings.stripe.mod.invoices

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.plans.IPlan
import typings.stripe.mod.taxRates.ITaxAmount
import typings.stripe.mod.taxRates.ITaxRate
import typings.stripe.stripeStrings.invoiceitem
import typings.stripe.stripeStrings.line_item
import typings.stripe.stripeStrings.subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceLineItem extends IResourceObject {
  /**
    * The amount, in cents/pence
    */
  var amount: Double
  var currency: String
  /**
    * A text description of the line item, if the line item is an invoice item
    */
  var description: String
  /**
    * If true, discounts will apply to this line item. Always false for prorations.
    */
  var discountable: Boolean
  /**
    * Whether or not this is a test line item
    */
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is "line_item"
    */
  @JSName("object")
  var object_IInvoiceLineItem: line_item
  /**
    * The period this line_item covers. For subscription line items, this is the subscription period. For prorations, this starts when
    * the proration was calculated, and ends at the period end of the subscription. For invoice items, this is the time at which the
    * invoice item was created, so the period start and end are the same time.
    */
  var period: IPeriod
  /**
    * The plan of the subscription, if the line item is a subscription or a proration
    */
  var plan: IPlan
  /**
    * Whether or not this is a proration
    */
  var proration: Boolean
  /**
    * The quantity of the subscription, if the line item is a subscription or a proration
    */
  var quantity: Double
  /**
    * When type is invoiceitem, the subscription that the invoice item pertains to, if any. Left blank when
    * type is already subscription, as it'd be redundant with id.
    */
  var subscription: String
  /**
    * The subscription item that generated this invoice item. Left empty if the line item is not an explicit result of a subscription.
    */
  var subscription_item: String
  /**
    * The amount of tax calculated per tax rate for this line item
    */
  var tax_amounts: js.Array[ITaxAmount]
  /**
    * The tax rates which apply to the line item.
    */
  var tax_rates: js.Array[ITaxRate]
  /**
    * A string identifying the type of the source of this line item, either an invoiceitem or a subscription
    */
  var `type`: invoiceitem | subscription
}

object IInvoiceLineItem {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    description: String,
    discountable: Boolean,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: line_item,
    period: IPeriod,
    plan: IPlan,
    proration: Boolean,
    quantity: Double,
    subscription: String,
    subscription_item: String,
    tax_amounts: js.Array[ITaxAmount],
    tax_rates: js.Array[ITaxRate],
    `type`: invoiceitem | subscription
  ): IInvoiceLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discountable = discountable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], proration = proration.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], tax_amounts = tax_amounts.asInstanceOf[js.Any], tax_rates = tax_rates.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceLineItem]
  }
}

