package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceLineItem
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * The amount, in cents/pence
    */
  var amount: scala.Double
  var currency: java.lang.String
  /**
    * A text description of the line item, if the line item is an invoice item
    */
  var description: java.lang.String
  /**
    * If true, discounts will apply to this line item. Always false for prorations.
    */
  var discountable: scala.Boolean
  /**
    * Whether or not this is a test line item
    */
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * Value is "line_item"
    */
  @JSName("object")
  var object_IInvoiceLineItem: stripeLib.stripeLibStrings.line_item
  /**
    * The period this line_item covers. For subscription line items, this is the subscription period. For prorations, this starts when
    * the proration was calculated, and ends at the period end of the subscription. For invoice items, this is the time at which the
    * invoice item was created, so the period start and end are the same time.
    */
  var period: IPeriod
  /**
    * The plan of the subscription, if the line item is a subscription or a proration
    */
  var plan: stripeLib.stripeMod.plansNs.IPlan
  /**
    * Whether or not this is a proration
    */
  var proration: scala.Boolean
  /**
    * The quantity of the subscription, if the line item is a subscription or a proration
    */
  var quantity: scala.Double
  /**
    * When type is invoiceitem, the subscription that the invoice item pertains to, if any. Left blank when
    * type is already subscription, as it'd be redundant with id.
    */
  var subscription: java.lang.String
  /**
    * A string identifying the type of the source of this line item, either an invoiceitem or a subscription
    */
  var `type`: stripeLib.stripeLibStrings.invoiceitem | stripeLib.stripeLibStrings.subscription
}

object IInvoiceLineItem {
  @scala.inline
  def apply(
    amount: scala.Double,
    currency: java.lang.String,
    description: java.lang.String,
    discountable: scala.Boolean,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.line_item,
    period: IPeriod,
    plan: stripeLib.stripeMod.plansNs.IPlan,
    proration: scala.Boolean,
    quantity: scala.Double,
    subscription: java.lang.String,
    `type`: stripeLib.stripeLibStrings.invoiceitem | stripeLib.stripeLibStrings.subscription
  ): IInvoiceLineItem = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, description = description, discountable = discountable, id = id, livemode = livemode, metadata = metadata, period = period, plan = plan, proration = proration, quantity = quantity, subscription = subscription)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceLineItem]
  }
}

