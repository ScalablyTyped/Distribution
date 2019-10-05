package typings.stripe.stripeMod.invoices

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.plans.IPlan
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
    `type`: invoiceitem | subscription
  ): IInvoiceLineItem = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, description = description, discountable = discountable, id = id, livemode = livemode, metadata = metadata, period = period, plan = plan, proration = proration, quantity = quantity, subscription = subscription, subscription_item = subscription_item)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceLineItem]
  }
}

