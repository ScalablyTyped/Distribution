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

@js.native
trait InvoiceItem extends IResourceObject {
  var amount: Double = js.native
  var currency: String = js.native
  var customer: String | ICustomer = js.native
  var date: Double = js.native
  var description: String = js.native
  /**
    * If true, discounts will apply to this invoice item. Always false for prorations.
    */
  var discountable: Boolean = js.native
  /**
    * If null, the invoice item is pending and will be included in the upcoming invoice. [Expandable]
    */
  var invoice: String | IInvoice | Null = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is "invoiceitem"
    */
  @JSName("object")
  var object_InvoiceItem: invoiceitem = js.native
  var period: IPeriod = js.native
  /**
    * If the invoice item is a proration, the plan of the subscription that the proration was computed for.
    */
  var plan: IPlan = js.native
  /**
    * Whether or not the invoice item was created automatically as a proration adjustment when the customer switched plans
    */
  var proration: Boolean = js.native
  /**
    * If the invoice item is a proration, the quantity of the subscription that the proration was computed for.
    */
  var quantity: Double = js.native
  /**
    * The subscription that this invoice item has been created for, if any.
    */
  var subscription: String | ISubscription = js.native
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
    subscription: String | ISubscription
  ): InvoiceItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discountable = discountable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], proration = proration.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceItem]
  }
  @scala.inline
  implicit class InvoiceItemOps[Self <: InvoiceItem] (val x: Self) extends AnyVal {
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
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscountable(value: Boolean): Self = this.set("discountable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: invoiceitem): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriod(value: IPeriod): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: IPlan): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def setProration(value: Boolean): Self = this.set("proration", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: String | ISubscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoice(value: String | IInvoice): Self = this.set("invoice", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoiceNull: Self = this.set("invoice", null)
  }
  
}

