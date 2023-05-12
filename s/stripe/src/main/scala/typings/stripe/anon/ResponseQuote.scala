package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Application
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.DeletedApplication
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.DeletedInvoice
import typings.stripe.mod.Stripe.Discount
import typings.stripe.mod.Stripe.Invoice
import typings.stripe.mod.Stripe.LineItem
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Quote.AutomaticTax
import typings.stripe.mod.Stripe.Quote.CollectionMethod
import typings.stripe.mod.Stripe.Quote.Computed
import typings.stripe.mod.Stripe.Quote.FromQuote
import typings.stripe.mod.Stripe.Quote.InvoiceSettings
import typings.stripe.mod.Stripe.Quote.Status
import typings.stripe.mod.Stripe.Quote.StatusTransitions
import typings.stripe.mod.Stripe.Quote.SubscriptionData
import typings.stripe.mod.Stripe.Quote.TotalDetails
import typings.stripe.mod.Stripe.Quote.TransferData
import typings.stripe.mod.Stripe.Subscription
import typings.stripe.mod.Stripe.SubscriptionSchedule
import typings.stripe.mod.Stripe.TaxRate
import typings.stripe.mod.Stripe.TestHelpers.TestClock
import typings.stripe.stripeStrings.quote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Quote> */
trait ResponseQuote extends StObject {
  
  /**
    * Total before any discounts or taxes are applied.
    */
  var amount_subtotal: Double
  
  /**
    * Total after discounts and taxes are applied.
    */
  var amount_total: Double
  
  /**
    * ID of the Connect Application that created the quote.
    */
  var application: String | Application | DeletedApplication | Null
  
  /**
    * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to the application owner's Stripe account. Only applicable if there are no line items with recurring prices on the quote.
    */
  var application_fee_amount: Double | Null
  
  /**
    * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the subscription invoice subtotal that will be transferred to the application owner's Stripe account. Only applicable if there are line items with recurring prices on the quote.
    */
  var application_fee_percent: Double | Null
  
  var automatic_tax: AutomaticTax
  
  /**
    * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay invoices at the end of the subscription cycle or on finalization using the default payment method attached to the subscription or customer. When sending an invoice, Stripe will email your customer an invoice with payment instructions and mark the subscription as `active`. Defaults to `charge_automatically`.
    */
  var collection_method: CollectionMethod
  
  var computed: Computed
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String | Null
  
  /**
    * The customer which this quote belongs to. A customer is required before finalizing the quote. Once specified, it cannot be changed.
    */
  var customer: String | Customer | DeletedCustomer | Null
  
  /**
    * The tax rates applied to this quote.
    */
  var default_tax_rates: js.UndefOr[js.Array[String | TaxRate]] = js.undefined
  
  /**
    * A description that will be displayed on the quote PDF.
    */
  var description: String | Null
  
  /**
    * The discounts applied to this quote.
    */
  var discounts: js.Array[String | Discount]
  
  /**
    * The date on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since the Unix epoch.
    */
  var expires_at: Double
  
  /**
    * A footer that will be displayed on the quote PDF.
    */
  var footer: String | Null
  
  /**
    * Details of the quote that was cloned. See the [cloning documentation](https://stripe.com/docs/quotes/clone) for more details.
    */
  var from_quote: FromQuote | Null
  
  /**
    * A header that will be displayed on the quote PDF.
    */
  var header: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The invoice that was created from this quote.
    */
  var invoice: String | Invoice | DeletedInvoice | Null
  
  /**
    * All invoices will be billed using the specified settings.
    */
  var invoice_settings: InvoiceSettings | Null
  
  var lastResponse: ApiVersion
  
  /**
    * A list of items the customer is being quoted for.
    */
  var line_items: js.UndefOr[ApiList[LineItem]] = js.undefined
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * A unique number that identifies this particular quote. This number is assigned once the quote is [finalized](https://stripe.com/docs/quotes/overview#finalize).
    */
  var number: String | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: quote
  
  /**
    * The account on behalf of which to charge. See the [Connect documentation](https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts) for details.
    */
  var on_behalf_of: String | Account | Null
  
  /**
    * The status of the quote.
    */
  var status: Status
  
  var status_transitions: StatusTransitions
  
  /**
    * The subscription that was created or updated from this quote.
    */
  var subscription: String | Subscription | Null
  
  var subscription_data: SubscriptionData
  
  /**
    * The subscription schedule that was created or updated from this quote.
    */
  var subscription_schedule: String | SubscriptionSchedule | Null
  
  /**
    * ID of the test clock this quote belongs to.
    */
  var test_clock: String | TestClock | Null
  
  var total_details: TotalDetails
  
  /**
    * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will be transferred to for each of the invoices.
    */
  var transfer_data: TransferData | Null
}
object ResponseQuote {
  
  inline def apply(
    amount_subtotal: Double,
    amount_total: Double,
    automatic_tax: AutomaticTax,
    collection_method: CollectionMethod,
    computed: Computed,
    created: Double,
    discounts: js.Array[String | Discount],
    expires_at: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    status: Status,
    status_transitions: StatusTransitions,
    subscription_data: SubscriptionData,
    total_details: TotalDetails
  ): ResponseQuote = {
    val __obj = js.Dynamic.literal(amount_subtotal = amount_subtotal.asInstanceOf[js.Any], amount_total = amount_total.asInstanceOf[js.Any], automatic_tax = automatic_tax.asInstanceOf[js.Any], collection_method = collection_method.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], discounts = discounts.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], subscription_data = subscription_data.asInstanceOf[js.Any], total_details = total_details.asInstanceOf[js.Any], application = null, application_fee_amount = null, application_fee_percent = null, currency = null, customer = null, description = null, footer = null, from_quote = null, header = null, invoice = null, invoice_settings = null, number = null, on_behalf_of = null, subscription = null, subscription_schedule = null, test_clock = null, transfer_data = null)
    __obj.updateDynamic("object")("quote")
    __obj.asInstanceOf[ResponseQuote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseQuote] (val x: Self) extends AnyVal {
    
    inline def setAmount_subtotal(value: Double): Self = StObject.set(x, "amount_subtotal", value.asInstanceOf[js.Any])
    
    inline def setAmount_total(value: Double): Self = StObject.set(x, "amount_total", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: String | Application | DeletedApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
    
    inline def setApplication_fee_percent(value: Double): Self = StObject.set(x, "application_fee_percent", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_percentNull: Self = StObject.set(x, "application_fee_percent", null)
    
    inline def setAutomatic_tax(value: AutomaticTax): Self = StObject.set(x, "automatic_tax", value.asInstanceOf[js.Any])
    
    inline def setCollection_method(value: CollectionMethod): Self = StObject.set(x, "collection_method", value.asInstanceOf[js.Any])
    
    inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setDefault_tax_rates(value: js.Array[String | TaxRate]): Self = StObject.set(x, "default_tax_rates", value.asInstanceOf[js.Any])
    
    inline def setDefault_tax_ratesUndefined: Self = StObject.set(x, "default_tax_rates", js.undefined)
    
    inline def setDefault_tax_ratesVarargs(value: (String | TaxRate)*): Self = StObject.set(x, "default_tax_rates", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDiscounts(value: js.Array[String | Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsVarargs(value: (String | Discount)*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFrom_quote(value: FromQuote): Self = StObject.set(x, "from_quote", value.asInstanceOf[js.Any])
    
    inline def setFrom_quoteNull: Self = StObject.set(x, "from_quote", null)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice(value: String | Invoice | DeletedInvoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNull: Self = StObject.set(x, "invoice", null)
    
    inline def setInvoice_settings(value: InvoiceSettings): Self = StObject.set(x, "invoice_settings", value.asInstanceOf[js.Any])
    
    inline def setInvoice_settingsNull: Self = StObject.set(x, "invoice_settings", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLine_items(value: ApiList[LineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
    
    inline def setLine_itemsUndefined: Self = StObject.set(x, "line_items", js.undefined)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setObject(value: quote): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_of(value: String | Account): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_transitions(value: StatusTransitions): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String | Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscription_data(value: SubscriptionData): Self = StObject.set(x, "subscription_data", value.asInstanceOf[js.Any])
    
    inline def setSubscription_schedule(value: String | SubscriptionSchedule): Self = StObject.set(x, "subscription_schedule", value.asInstanceOf[js.Any])
    
    inline def setSubscription_scheduleNull: Self = StObject.set(x, "subscription_schedule", null)
    
    inline def setTest_clock(value: String | TestClock): Self = StObject.set(x, "test_clock", value.asInstanceOf[js.Any])
    
    inline def setTest_clockNull: Self = StObject.set(x, "test_clock", null)
    
    inline def setTotal_details(value: TotalDetails): Self = StObject.set(x, "total_details", value.asInstanceOf[js.Any])
    
    inline def setTransfer_data(value: TransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    inline def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
  }
}
