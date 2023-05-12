package typings.stripe.anon

import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.Discount
import typings.stripe.mod.Stripe.Invoice
import typings.stripe.mod.Stripe.InvoiceItem.Period
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Plan
import typings.stripe.mod.Stripe.Price
import typings.stripe.mod.Stripe.Subscription
import typings.stripe.mod.Stripe.TaxRate
import typings.stripe.mod.Stripe.TestHelpers.TestClock
import typings.stripe.stripeStrings.invoiceitem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.InvoiceItem> */
trait ResponseInvoiceItem extends StObject {
  
  /**
    * Amount (in the `currency` specified) of the invoice item. This should always be equal to `unit_amount * quantity`.
    */
  var amount: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * The ID of the customer who will be billed when this invoice item is billed.
    */
  var customer: String | Customer | DeletedCustomer
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var date: Double
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  
  /**
    * If true, discounts will apply to this invoice item. Always false for prorations.
    */
  var discountable: Boolean
  
  /**
    * The discounts which apply to the invoice item. Item discounts are applied before invoice discounts. Use `expand[]=discounts` to expand each discount.
    */
  var discounts: (js.Array[String | Discount]) | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The ID of the invoice this invoice item belongs to.
    */
  var invoice: String | Invoice | Null
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: invoiceitem
  
  var period: Period
  
  /**
    * If the invoice item is a proration, the plan of the subscription that the proration was computed for.
    */
  var plan: Plan | Null
  
  /**
    * The price of the invoice item.
    */
  var price: Price | Null
  
  /**
    * Whether the invoice item was created automatically as a proration adjustment when the customer switched plans.
    */
  var proration: Boolean
  
  /**
    * Quantity of units for the invoice item. If the invoice item is a proration, the quantity of the subscription that the proration was computed for.
    */
  var quantity: Double
  
  /**
    * The subscription that this invoice item has been created for, if any.
    */
  var subscription: String | Subscription | Null
  
  /**
    * The subscription item that this invoice item has been created for, if any.
    */
  var subscription_item: js.UndefOr[String] = js.undefined
  
  /**
    * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to this invoice item.
    */
  var tax_rates: js.Array[TaxRate] | Null
  
  /**
    * ID of the test clock this invoice item belongs to.
    */
  var test_clock: String | TestClock | Null
  
  /**
    * Unit amount (in the `currency` specified) of the invoice item.
    */
  var unit_amount: Double | Null
  
  /**
    * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
    */
  var unit_amount_decimal: String | Null
}
object ResponseInvoiceItem {
  
  inline def apply(
    amount: Double,
    currency: String,
    customer: String | Customer | DeletedCustomer,
    date: Double,
    discountable: Boolean,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    period: Period,
    proration: Boolean,
    quantity: Double
  ): ResponseInvoiceItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], discountable = discountable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], proration = proration.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], description = null, discounts = null, invoice = null, metadata = null, plan = null, price = null, subscription = null, tax_rates = null, test_clock = null, unit_amount = null, unit_amount_decimal = null)
    __obj.updateDynamic("object")("invoiceitem")
    __obj.asInstanceOf[ResponseInvoiceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInvoiceItem] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDiscountable(value: Boolean): Self = StObject.set(x, "discountable", value.asInstanceOf[js.Any])
    
    inline def setDiscounts(value: js.Array[String | Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsNull: Self = StObject.set(x, "discounts", null)
    
    inline def setDiscountsVarargs(value: (String | Discount)*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice(value: String | Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNull: Self = StObject.set(x, "invoice", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: invoiceitem): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Plan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanNull: Self = StObject.set(x, "plan", null)
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceNull: Self = StObject.set(x, "price", null)
    
    inline def setProration(value: Boolean): Self = StObject.set(x, "proration", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String | Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscription_item(value: String): Self = StObject.set(x, "subscription_item", value.asInstanceOf[js.Any])
    
    inline def setSubscription_itemUndefined: Self = StObject.set(x, "subscription_item", js.undefined)
    
    inline def setTax_rates(value: js.Array[TaxRate]): Self = StObject.set(x, "tax_rates", value.asInstanceOf[js.Any])
    
    inline def setTax_ratesNull: Self = StObject.set(x, "tax_rates", null)
    
    inline def setTax_ratesVarargs(value: TaxRate*): Self = StObject.set(x, "tax_rates", js.Array(value*))
    
    inline def setTest_clock(value: String | TestClock): Self = StObject.set(x, "test_clock", value.asInstanceOf[js.Any])
    
    inline def setTest_clockNull: Self = StObject.set(x, "test_clock", null)
    
    inline def setUnit_amount(value: Double): Self = StObject.set(x, "unit_amount", value.asInstanceOf[js.Any])
    
    inline def setUnit_amountNull: Self = StObject.set(x, "unit_amount", null)
    
    inline def setUnit_amount_decimal(value: String): Self = StObject.set(x, "unit_amount_decimal", value.asInstanceOf[js.Any])
    
    inline def setUnit_amount_decimalNull: Self = StObject.set(x, "unit_amount_decimal", null)
  }
}
