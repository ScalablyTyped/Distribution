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

@js.native
trait IInvoiceLineItem extends IResourceObject {
  /**
    * The amount, in cents/pence
    */
  var amount: Double = js.native
  var currency: String = js.native
  /**
    * A text description of the line item, if the line item is an invoice item
    */
  var description: String = js.native
  /**
    * If true, discounts will apply to this line item. Always false for prorations.
    */
  var discountable: Boolean = js.native
  /**
    * Whether or not this is a test line item
    */
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is "line_item"
    */
  @JSName("object")
  var object_IInvoiceLineItem: line_item = js.native
  /**
    * The period this line_item covers. For subscription line items, this is the subscription period. For prorations, this starts when
    * the proration was calculated, and ends at the period end of the subscription. For invoice items, this is the time at which the
    * invoice item was created, so the period start and end are the same time.
    */
  var period: IPeriod = js.native
  /**
    * The plan of the subscription, if the line item is a subscription or a proration
    */
  var plan: IPlan = js.native
  /**
    * Whether or not this is a proration
    */
  var proration: Boolean = js.native
  /**
    * The quantity of the subscription, if the line item is a subscription or a proration
    */
  var quantity: Double = js.native
  /**
    * When type is invoiceitem, the subscription that the invoice item pertains to, if any. Left blank when
    * type is already subscription, as it'd be redundant with id.
    */
  var subscription: String = js.native
  /**
    * The subscription item that generated this invoice item. Left empty if the line item is not an explicit result of a subscription.
    */
  var subscription_item: String = js.native
  /**
    * The amount of tax calculated per tax rate for this line item
    */
  var tax_amounts: js.Array[ITaxAmount] = js.native
  /**
    * The tax rates which apply to the line item.
    */
  var tax_rates: js.Array[ITaxRate] = js.native
  /**
    * A string identifying the type of the source of this line item, either an invoiceitem or a subscription
    */
  var `type`: invoiceitem | subscription = js.native
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
  @scala.inline
  implicit class IInvoiceLineItemOps[Self <: IInvoiceLineItem] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscountable(value: Boolean): Self = this.set("discountable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: line_item): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriod(value: IPeriod): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: IPlan): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def setProration(value: Boolean): Self = this.set("proration", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription_item(value: String): Self = this.set("subscription_item", value.asInstanceOf[js.Any])
    @scala.inline
    def setTax_amountsVarargs(value: ITaxAmount*): Self = this.set("tax_amounts", js.Array(value :_*))
    @scala.inline
    def setTax_amounts(value: js.Array[ITaxAmount]): Self = this.set("tax_amounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTax_ratesVarargs(value: ITaxRate*): Self = this.set("tax_rates", js.Array(value :_*))
    @scala.inline
    def setTax_rates(value: js.Array[ITaxRate]): Self = this.set("tax_rates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: invoiceitem | subscription): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

