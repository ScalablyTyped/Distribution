package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.Address
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Application
import typings.stripe.mod.Stripe.Charge
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.CustomerSource
import typings.stripe.mod.Stripe.DeletedApplication
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.DeletedDiscount
import typings.stripe.mod.Stripe.DeletedTaxId
import typings.stripe.mod.Stripe.Discount
import typings.stripe.mod.Stripe.Invoice
import typings.stripe.mod.Stripe.Invoice.AutomaticTax
import typings.stripe.mod.Stripe.Invoice.BillingReason
import typings.stripe.mod.Stripe.Invoice.CollectionMethod
import typings.stripe.mod.Stripe.Invoice.CustomField
import typings.stripe.mod.Stripe.Invoice.CustomerShipping
import typings.stripe.mod.Stripe.Invoice.CustomerTaxExempt
import typings.stripe.mod.Stripe.Invoice.CustomerTaxId
import typings.stripe.mod.Stripe.Invoice.FromInvoice
import typings.stripe.mod.Stripe.Invoice.LastFinalizationError
import typings.stripe.mod.Stripe.Invoice.PaymentSettings
import typings.stripe.mod.Stripe.Invoice.RenderingOptions
import typings.stripe.mod.Stripe.Invoice.ShippingCost
import typings.stripe.mod.Stripe.Invoice.ShippingDetails
import typings.stripe.mod.Stripe.Invoice.Status
import typings.stripe.mod.Stripe.Invoice.StatusTransitions
import typings.stripe.mod.Stripe.Invoice.ThresholdReason
import typings.stripe.mod.Stripe.Invoice.TotalDiscountAmount
import typings.stripe.mod.Stripe.Invoice.TotalTaxAmount
import typings.stripe.mod.Stripe.Invoice.TransferData
import typings.stripe.mod.Stripe.InvoiceLineItem
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.PaymentIntent
import typings.stripe.mod.Stripe.PaymentMethod
import typings.stripe.mod.Stripe.Quote
import typings.stripe.mod.Stripe.Subscription
import typings.stripe.mod.Stripe.TaxId
import typings.stripe.mod.Stripe.TaxRate
import typings.stripe.mod.Stripe.TestHelpers.TestClock
import typings.stripe.stripeStrings.invoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Invoice> */
trait ResponseInvoice extends StObject {
  
  /**
    * The country of the business associated with this invoice, most often the business creating the invoice.
    */
  var account_country: String | Null
  
  /**
    * The public name of the business associated with this invoice, most often the business creating the invoice.
    */
  var account_name: String | Null
  
  /**
    * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
    */
  var account_tax_ids: (js.Array[String | TaxId | DeletedTaxId]) | Null
  
  /**
    * Final amount due at this time for this invoice. If the invoice's total is smaller than the minimum charge amount, for example, or if there is account credit that can be applied to the invoice, the `amount_due` may be 0. If there is a positive `starting_balance` for the invoice (the customer owes money), the `amount_due` will also take that into account. The charge that gets generated for the invoice will be for the amount specified in `amount_due`.
    */
  var amount_due: Double
  
  /**
    * The amount, in %s, that was paid.
    */
  var amount_paid: Double
  
  /**
    * The difference between amount_due and amount_paid, in %s.
    */
  var amount_remaining: Double
  
  /**
    * This is the sum of all the shipping amounts.
    */
  var amount_shipping: Double
  
  /**
    * ID of the Connect Application that created the invoice.
    */
  var application: String | Application | DeletedApplication | Null
  
  /**
    * The fee in %s that will be applied to the invoice and transferred to the application owner's Stripe account when the invoice is paid.
    */
  var application_fee_amount: Double | Null
  
  /**
    * Number of payment attempts made for this invoice, from the perspective of the payment retry schedule. Any payment attempt counts as the first attempt, and subsequently only automatic retries increment the attempt count. In other words, manual payment attempts after the first attempt do not affect the retry schedule.
    */
  var attempt_count: Double
  
  /**
    * Whether an attempt has been made to pay the invoice. An invoice is not attempted until 1 hour after the `invoice.created` webhook, for example, so you might not want to display that invoice as unpaid to your users.
    */
  var attempted: Boolean
  
  /**
    * Controls whether Stripe will perform [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice. When `false`, the invoice's state will not automatically advance without an explicit action.
    */
  var auto_advance: js.UndefOr[Boolean] = js.undefined
  
  var automatic_tax: AutomaticTax
  
  /**
    * Indicates the reason why the invoice was created. `subscription_cycle` indicates an invoice created by a subscription advancing into a new period. `subscription_create` indicates an invoice created due to creating a subscription. `subscription_update` indicates an invoice created due to updating a subscription. `subscription` is set for all old invoices to indicate either a change to a subscription or a period advancement. `manual` is set for all invoices unrelated to a subscription (for example: created via the invoice editor). The `upcoming` value is reserved for simulated invoices per the upcoming invoice endpoint. `subscription_threshold` indicates an invoice created due to a billing threshold being reached.
    */
  var billing_reason: BillingReason | Null
  
  /**
    * ID of the latest charge generated for this invoice, if any.
    */
  var charge: String | Charge | Null
  
  /**
    * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this invoice using the default source attached to the customer. When sending an invoice, Stripe will email this invoice to the customer with payment instructions.
    */
  var collection_method: CollectionMethod
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * Custom fields displayed on the invoice.
    */
  var custom_fields: js.Array[CustomField] | Null
  
  /**
    * The ID of the customer who will be billed.
    */
  var customer: String | Customer | DeletedCustomer | Null
  
  /**
    * The customer's address. Until the invoice is finalized, this field will equal `customer.address`. Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_address: Address | Null
  
  /**
    * The customer's email. Until the invoice is finalized, this field will equal `customer.email`. Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_email: String | Null
  
  /**
    * The customer's name. Until the invoice is finalized, this field will equal `customer.name`. Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_name: String | Null
  
  /**
    * The customer's phone number. Until the invoice is finalized, this field will equal `customer.phone`. Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_phone: String | Null
  
  /**
    * The customer's shipping information. Until the invoice is finalized, this field will equal `customer.shipping`. Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_shipping: CustomerShipping | Null
  
  /**
    * The customer's tax exempt status. Until the invoice is finalized, this field will equal `customer.tax_exempt`. Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_tax_exempt: CustomerTaxExempt | Null
  
  /**
    * The customer's tax IDs. Until the invoice is finalized, this field will contain the same tax IDs as `customer.tax_ids`. Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_tax_ids: js.UndefOr[js.Array[CustomerTaxId] | Null] = js.undefined
  
  /**
    * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice. If not set, defaults to the subscription's default payment method, if any, or to the default payment method in the customer's invoice settings.
    */
  var default_payment_method: String | PaymentMethod | Null
  
  /**
    * ID of the default payment source for the invoice. It must belong to the customer associated with the invoice and be in a chargeable state. If not set, defaults to the subscription's default source, if any, or to the customer's default source.
    */
  var default_source: String | CustomerSource | Null
  
  /**
    * The tax rates applied to this invoice, if any.
    */
  var default_tax_rates: js.Array[TaxRate]
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as 'memo' in the Dashboard.
    */
  var description: String | Null
  
  /**
    * Describes the current discount applied to this invoice, if there is one. Not populated if there are multiple discounts.
    */
  var discount: Discount | Null
  
  /**
    * The discounts applied to the invoice. Line item discounts are applied before invoice discounts. Use `expand[]=discounts` to expand each discount.
    */
  var discounts: (js.Array[String | Discount | DeletedDiscount]) | Null
  
  /**
    * The date on which payment for this invoice is due. This value will be `null` for invoices where `collection_method=charge_automatically`.
    */
  var due_date: Double | Null
  
  /**
    * Ending customer balance after the invoice is finalized. Invoices are finalized approximately an hour after successful webhook delivery or when payment collection is attempted for the invoice. If the invoice has not been finalized yet, this will be null.
    */
  var ending_balance: Double | Null
  
  /**
    * Footer displayed on the invoice.
    */
  var footer: String | Null
  
  /**
    * Details of the invoice that was cloned. See the [revision documentation](https://stripe.com/docs/invoicing/invoice-revisions) for more details.
    */
  var from_invoice: FromInvoice | Null
  
  /**
    * The URL for the hosted invoice page, which allows customers to view and pay an invoice. If the invoice has not been finalized yet, this will be null.
    */
  var hosted_invoice_url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the object. This property is always present unless the invoice is an upcoming invoice. See [Retrieve an upcoming invoice](https://stripe.com/docs/api/invoices/upcoming) for more details.
    */
  var id: String
  
  /**
    * The link to download the PDF for the invoice. If the invoice has not been finalized yet, this will be null.
    */
  var invoice_pdf: js.UndefOr[String | Null] = js.undefined
  
  var lastResponse: ApiVersion
  
  /**
    * The error encountered during the previous attempt to finalize the invoice. This field is cleared when the invoice is successfully finalized.
    */
  var last_finalization_error: LastFinalizationError | Null
  
  /**
    * The ID of the most recent non-draft revision of this invoice
    */
  var latest_revision: String | Invoice | Null
  
  /**
    * The individual line items that make up the invoice. `lines` is sorted as follows: (1) pending invoice items (including prorations) in reverse chronological order, (2) subscription items in reverse chronological order, and (3) invoice items added after invoice creation in chronological order.
    */
  var lines: ApiList[InvoiceLineItem]
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * The time at which payment will next be attempted. This value will be `null` for invoices where `collection_method=send_invoice`.
    */
  var next_payment_attempt: Double | Null
  
  /**
    * A unique, identifying string that appears on emails sent to the customer for this invoice. This starts with the customer's unique invoice_prefix if it is specified.
    */
  var number: String | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: invoice
  
  /**
    * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented with the branding and support information of the specified account. See the [Invoices with Connect](https://stripe.com/docs/billing/invoices/connect) documentation for details.
    */
  var on_behalf_of: String | Account | Null
  
  /**
    * Whether payment was successfully collected for this invoice. An invoice can be paid (most commonly) with a charge or with credit from the customer's account balance.
    */
  var paid: Boolean
  
  /**
    * Returns true if the invoice was manually marked paid, returns false if the invoice hasn't been paid yet or was paid on Stripe.
    */
  var paid_out_of_band: Boolean
  
  /**
    * The PaymentIntent associated with this invoice. The PaymentIntent is generated when the invoice is finalized, and can then be used to pay the invoice. Note that voiding an invoice will cancel the PaymentIntent.
    */
  var payment_intent: String | PaymentIntent | Null
  
  var payment_settings: PaymentSettings
  
  /**
    * End of the usage period during which invoice items were added to this invoice.
    */
  var period_end: Double
  
  /**
    * Start of the usage period during which invoice items were added to this invoice.
    */
  var period_start: Double
  
  /**
    * Total amount of all post-payment credit notes issued for this invoice.
    */
  var post_payment_credit_notes_amount: Double
  
  /**
    * Total amount of all pre-payment credit notes issued for this invoice.
    */
  var pre_payment_credit_notes_amount: Double
  
  /**
    * The quote this invoice was generated from.
    */
  var quote: String | Quote | Null
  
  /**
    * This is the transaction number that appears on email receipts sent for this invoice.
    */
  var receipt_number: String | Null
  
  /**
    * Options for invoice PDF rendering.
    */
  var rendering_options: RenderingOptions | Null
  
  /**
    * The details of the cost of shipping, including the ShippingRate applied on the invoice.
    */
  var shipping_cost: ShippingCost | Null
  
  /**
    * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise the PDF will render the shipping address from the customer.
    */
  var shipping_details: ShippingDetails | Null
  
  /**
    * Starting customer balance before the invoice is finalized. If the invoice has not been finalized yet, this will be the current customer balance. For revision invoices, this also includes any customer balance that was applied to the original invoice.
    */
  var starting_balance: Double
  
  /**
    * Extra information about an invoice for the customer's credit card statement.
    */
  var statement_descriptor: String | Null
  
  /**
    * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn more](https://stripe.com/docs/billing/invoices/workflow#workflow-overview)
    */
  var status: Status | Null
  
  var status_transitions: StatusTransitions
  
  /**
    * The subscription that this invoice was prepared for, if any.
    */
  var subscription: String | Subscription | Null
  
  /**
    * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
    */
  var subscription_proration_date: js.UndefOr[Double] = js.undefined
  
  /**
    * Total of all subscriptions, invoice items, and prorations on the invoice before any invoice level discount or exclusive tax is applied. Item discounts are already incorporated
    */
  var subtotal: Double
  
  /**
    * The integer amount in %s representing the subtotal of the invoice before any invoice level discount or tax is applied. Item discounts are already incorporated
    */
  var subtotal_excluding_tax: Double | Null
  
  /**
    * The amount of tax on this invoice. This is the sum of all the tax amounts on this invoice.
    */
  var tax: Double | Null
  
  /**
    * ID of the test clock this invoice belongs to.
    */
  var test_clock: String | TestClock | Null
  
  var threshold_reason: js.UndefOr[ThresholdReason] = js.undefined
  
  /**
    * Total after discounts and taxes.
    */
  var total: Double
  
  /**
    * The aggregate amounts calculated per discount across all line items.
    */
  var total_discount_amounts: js.Array[TotalDiscountAmount] | Null
  
  /**
    * The integer amount in %s representing the total amount of the invoice including all discounts but excluding all tax.
    */
  var total_excluding_tax: Double | Null
  
  /**
    * The aggregate amounts calculated per tax rate for all line items.
    */
  var total_tax_amounts: js.Array[TotalTaxAmount]
  
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to for the invoice.
    */
  var transfer_data: TransferData | Null
  
  /**
    * Invoices are automatically paid or sent 1 hour after webhooks are delivered, or until all webhook delivery attempts have [been exhausted](https://stripe.com/docs/billing/webhooks#understand). This field tracks the time when webhooks for this invoice were successfully delivered. If the invoice had no webhooks to deliver, this will be set while the invoice is being created.
    */
  var webhooks_delivered_at: Double | Null
}
object ResponseInvoice {
  
  inline def apply(
    amount_due: Double,
    amount_paid: Double,
    amount_remaining: Double,
    amount_shipping: Double,
    attempt_count: Double,
    attempted: Boolean,
    automatic_tax: AutomaticTax,
    collection_method: CollectionMethod,
    created: Double,
    currency: String,
    default_tax_rates: js.Array[TaxRate],
    id: String,
    lastResponse: ApiVersion,
    lines: ApiList[InvoiceLineItem],
    livemode: Boolean,
    paid: Boolean,
    paid_out_of_band: Boolean,
    payment_settings: PaymentSettings,
    period_end: Double,
    period_start: Double,
    post_payment_credit_notes_amount: Double,
    pre_payment_credit_notes_amount: Double,
    starting_balance: Double,
    status_transitions: StatusTransitions,
    subtotal: Double,
    total: Double,
    total_tax_amounts: js.Array[TotalTaxAmount]
  ): ResponseInvoice = {
    val __obj = js.Dynamic.literal(amount_due = amount_due.asInstanceOf[js.Any], amount_paid = amount_paid.asInstanceOf[js.Any], amount_remaining = amount_remaining.asInstanceOf[js.Any], amount_shipping = amount_shipping.asInstanceOf[js.Any], attempt_count = attempt_count.asInstanceOf[js.Any], attempted = attempted.asInstanceOf[js.Any], automatic_tax = automatic_tax.asInstanceOf[js.Any], collection_method = collection_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], default_tax_rates = default_tax_rates.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], paid_out_of_band = paid_out_of_band.asInstanceOf[js.Any], payment_settings = payment_settings.asInstanceOf[js.Any], period_end = period_end.asInstanceOf[js.Any], period_start = period_start.asInstanceOf[js.Any], post_payment_credit_notes_amount = post_payment_credit_notes_amount.asInstanceOf[js.Any], pre_payment_credit_notes_amount = pre_payment_credit_notes_amount.asInstanceOf[js.Any], starting_balance = starting_balance.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_tax_amounts = total_tax_amounts.asInstanceOf[js.Any], account_country = null, account_name = null, account_tax_ids = null, application = null, application_fee_amount = null, billing_reason = null, charge = null, custom_fields = null, customer = null, customer_address = null, customer_email = null, customer_name = null, customer_phone = null, customer_shipping = null, customer_tax_exempt = null, default_payment_method = null, default_source = null, description = null, discount = null, discounts = null, due_date = null, ending_balance = null, footer = null, from_invoice = null, last_finalization_error = null, latest_revision = null, metadata = null, next_payment_attempt = null, number = null, on_behalf_of = null, payment_intent = null, quote = null, receipt_number = null, rendering_options = null, shipping_cost = null, shipping_details = null, statement_descriptor = null, status = null, subscription = null, subtotal_excluding_tax = null, tax = null, test_clock = null, total_discount_amounts = null, total_excluding_tax = null, transfer_data = null, webhooks_delivered_at = null)
    __obj.updateDynamic("object")("invoice")
    __obj.asInstanceOf[ResponseInvoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInvoice] (val x: Self) extends AnyVal {
    
    inline def setAccount_country(value: String): Self = StObject.set(x, "account_country", value.asInstanceOf[js.Any])
    
    inline def setAccount_countryNull: Self = StObject.set(x, "account_country", null)
    
    inline def setAccount_name(value: String): Self = StObject.set(x, "account_name", value.asInstanceOf[js.Any])
    
    inline def setAccount_nameNull: Self = StObject.set(x, "account_name", null)
    
    inline def setAccount_tax_ids(value: js.Array[String | TaxId | DeletedTaxId]): Self = StObject.set(x, "account_tax_ids", value.asInstanceOf[js.Any])
    
    inline def setAccount_tax_idsNull: Self = StObject.set(x, "account_tax_ids", null)
    
    inline def setAccount_tax_idsVarargs(value: (String | TaxId | DeletedTaxId)*): Self = StObject.set(x, "account_tax_ids", js.Array(value*))
    
    inline def setAmount_due(value: Double): Self = StObject.set(x, "amount_due", value.asInstanceOf[js.Any])
    
    inline def setAmount_paid(value: Double): Self = StObject.set(x, "amount_paid", value.asInstanceOf[js.Any])
    
    inline def setAmount_remaining(value: Double): Self = StObject.set(x, "amount_remaining", value.asInstanceOf[js.Any])
    
    inline def setAmount_shipping(value: Double): Self = StObject.set(x, "amount_shipping", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: String | Application | DeletedApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
    
    inline def setAttempt_count(value: Double): Self = StObject.set(x, "attempt_count", value.asInstanceOf[js.Any])
    
    inline def setAttempted(value: Boolean): Self = StObject.set(x, "attempted", value.asInstanceOf[js.Any])
    
    inline def setAuto_advance(value: Boolean): Self = StObject.set(x, "auto_advance", value.asInstanceOf[js.Any])
    
    inline def setAuto_advanceUndefined: Self = StObject.set(x, "auto_advance", js.undefined)
    
    inline def setAutomatic_tax(value: AutomaticTax): Self = StObject.set(x, "automatic_tax", value.asInstanceOf[js.Any])
    
    inline def setBilling_reason(value: BillingReason): Self = StObject.set(x, "billing_reason", value.asInstanceOf[js.Any])
    
    inline def setBilling_reasonNull: Self = StObject.set(x, "billing_reason", null)
    
    inline def setCharge(value: String | Charge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setChargeNull: Self = StObject.set(x, "charge", null)
    
    inline def setCollection_method(value: CollectionMethod): Self = StObject.set(x, "collection_method", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustom_fields(value: js.Array[CustomField]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsNull: Self = StObject.set(x, "custom_fields", null)
    
    inline def setCustom_fieldsVarargs(value: CustomField*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomer_address(value: Address): Self = StObject.set(x, "customer_address", value.asInstanceOf[js.Any])
    
    inline def setCustomer_addressNull: Self = StObject.set(x, "customer_address", null)
    
    inline def setCustomer_email(value: String): Self = StObject.set(x, "customer_email", value.asInstanceOf[js.Any])
    
    inline def setCustomer_emailNull: Self = StObject.set(x, "customer_email", null)
    
    inline def setCustomer_name(value: String): Self = StObject.set(x, "customer_name", value.asInstanceOf[js.Any])
    
    inline def setCustomer_nameNull: Self = StObject.set(x, "customer_name", null)
    
    inline def setCustomer_phone(value: String): Self = StObject.set(x, "customer_phone", value.asInstanceOf[js.Any])
    
    inline def setCustomer_phoneNull: Self = StObject.set(x, "customer_phone", null)
    
    inline def setCustomer_shipping(value: CustomerShipping): Self = StObject.set(x, "customer_shipping", value.asInstanceOf[js.Any])
    
    inline def setCustomer_shippingNull: Self = StObject.set(x, "customer_shipping", null)
    
    inline def setCustomer_tax_exempt(value: CustomerTaxExempt): Self = StObject.set(x, "customer_tax_exempt", value.asInstanceOf[js.Any])
    
    inline def setCustomer_tax_exemptNull: Self = StObject.set(x, "customer_tax_exempt", null)
    
    inline def setCustomer_tax_ids(value: js.Array[CustomerTaxId]): Self = StObject.set(x, "customer_tax_ids", value.asInstanceOf[js.Any])
    
    inline def setCustomer_tax_idsNull: Self = StObject.set(x, "customer_tax_ids", null)
    
    inline def setCustomer_tax_idsUndefined: Self = StObject.set(x, "customer_tax_ids", js.undefined)
    
    inline def setCustomer_tax_idsVarargs(value: CustomerTaxId*): Self = StObject.set(x, "customer_tax_ids", js.Array(value*))
    
    inline def setDefault_payment_method(value: String | PaymentMethod): Self = StObject.set(x, "default_payment_method", value.asInstanceOf[js.Any])
    
    inline def setDefault_payment_methodNull: Self = StObject.set(x, "default_payment_method", null)
    
    inline def setDefault_source(value: String | CustomerSource): Self = StObject.set(x, "default_source", value.asInstanceOf[js.Any])
    
    inline def setDefault_sourceNull: Self = StObject.set(x, "default_source", null)
    
    inline def setDefault_tax_rates(value: js.Array[TaxRate]): Self = StObject.set(x, "default_tax_rates", value.asInstanceOf[js.Any])
    
    inline def setDefault_tax_ratesVarargs(value: TaxRate*): Self = StObject.set(x, "default_tax_rates", js.Array(value*))
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDiscount(value: Discount): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountNull: Self = StObject.set(x, "discount", null)
    
    inline def setDiscounts(value: js.Array[String | Discount | DeletedDiscount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsNull: Self = StObject.set(x, "discounts", null)
    
    inline def setDiscountsVarargs(value: (String | Discount | DeletedDiscount)*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setDue_date(value: Double): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    inline def setDue_dateNull: Self = StObject.set(x, "due_date", null)
    
    inline def setEnding_balance(value: Double): Self = StObject.set(x, "ending_balance", value.asInstanceOf[js.Any])
    
    inline def setEnding_balanceNull: Self = StObject.set(x, "ending_balance", null)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFrom_invoice(value: FromInvoice): Self = StObject.set(x, "from_invoice", value.asInstanceOf[js.Any])
    
    inline def setFrom_invoiceNull: Self = StObject.set(x, "from_invoice", null)
    
    inline def setHosted_invoice_url(value: String): Self = StObject.set(x, "hosted_invoice_url", value.asInstanceOf[js.Any])
    
    inline def setHosted_invoice_urlNull: Self = StObject.set(x, "hosted_invoice_url", null)
    
    inline def setHosted_invoice_urlUndefined: Self = StObject.set(x, "hosted_invoice_url", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_pdf(value: String): Self = StObject.set(x, "invoice_pdf", value.asInstanceOf[js.Any])
    
    inline def setInvoice_pdfNull: Self = StObject.set(x, "invoice_pdf", null)
    
    inline def setInvoice_pdfUndefined: Self = StObject.set(x, "invoice_pdf", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLast_finalization_error(value: LastFinalizationError): Self = StObject.set(x, "last_finalization_error", value.asInstanceOf[js.Any])
    
    inline def setLast_finalization_errorNull: Self = StObject.set(x, "last_finalization_error", null)
    
    inline def setLatest_revision(value: String | Invoice): Self = StObject.set(x, "latest_revision", value.asInstanceOf[js.Any])
    
    inline def setLatest_revisionNull: Self = StObject.set(x, "latest_revision", null)
    
    inline def setLines(value: ApiList[InvoiceLineItem]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setNext_payment_attempt(value: Double): Self = StObject.set(x, "next_payment_attempt", value.asInstanceOf[js.Any])
    
    inline def setNext_payment_attemptNull: Self = StObject.set(x, "next_payment_attempt", null)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setObject(value: invoice): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_of(value: String | Account): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
    
    inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPaid_out_of_band(value: Boolean): Self = StObject.set(x, "paid_out_of_band", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent(value: String | PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentNull: Self = StObject.set(x, "payment_intent", null)
    
    inline def setPayment_settings(value: PaymentSettings): Self = StObject.set(x, "payment_settings", value.asInstanceOf[js.Any])
    
    inline def setPeriod_end(value: Double): Self = StObject.set(x, "period_end", value.asInstanceOf[js.Any])
    
    inline def setPeriod_start(value: Double): Self = StObject.set(x, "period_start", value.asInstanceOf[js.Any])
    
    inline def setPost_payment_credit_notes_amount(value: Double): Self = StObject.set(x, "post_payment_credit_notes_amount", value.asInstanceOf[js.Any])
    
    inline def setPre_payment_credit_notes_amount(value: Double): Self = StObject.set(x, "pre_payment_credit_notes_amount", value.asInstanceOf[js.Any])
    
    inline def setQuote(value: String | Quote): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    inline def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
    
    inline def setReceipt_numberNull: Self = StObject.set(x, "receipt_number", null)
    
    inline def setRendering_options(value: RenderingOptions): Self = StObject.set(x, "rendering_options", value.asInstanceOf[js.Any])
    
    inline def setRendering_optionsNull: Self = StObject.set(x, "rendering_options", null)
    
    inline def setShipping_cost(value: ShippingCost): Self = StObject.set(x, "shipping_cost", value.asInstanceOf[js.Any])
    
    inline def setShipping_costNull: Self = StObject.set(x, "shipping_cost", null)
    
    inline def setShipping_details(value: ShippingDetails): Self = StObject.set(x, "shipping_details", value.asInstanceOf[js.Any])
    
    inline def setShipping_detailsNull: Self = StObject.set(x, "shipping_details", null)
    
    inline def setStarting_balance(value: Double): Self = StObject.set(x, "starting_balance", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatus_transitions(value: StatusTransitions): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String | Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscription_proration_date(value: Double): Self = StObject.set(x, "subscription_proration_date", value.asInstanceOf[js.Any])
    
    inline def setSubscription_proration_dateUndefined: Self = StObject.set(x, "subscription_proration_date", js.undefined)
    
    inline def setSubtotal(value: Double): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    inline def setSubtotal_excluding_tax(value: Double): Self = StObject.set(x, "subtotal_excluding_tax", value.asInstanceOf[js.Any])
    
    inline def setSubtotal_excluding_taxNull: Self = StObject.set(x, "subtotal_excluding_tax", null)
    
    inline def setTax(value: Double): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxNull: Self = StObject.set(x, "tax", null)
    
    inline def setTest_clock(value: String | TestClock): Self = StObject.set(x, "test_clock", value.asInstanceOf[js.Any])
    
    inline def setTest_clockNull: Self = StObject.set(x, "test_clock", null)
    
    inline def setThreshold_reason(value: ThresholdReason): Self = StObject.set(x, "threshold_reason", value.asInstanceOf[js.Any])
    
    inline def setThreshold_reasonUndefined: Self = StObject.set(x, "threshold_reason", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_discount_amounts(value: js.Array[TotalDiscountAmount]): Self = StObject.set(x, "total_discount_amounts", value.asInstanceOf[js.Any])
    
    inline def setTotal_discount_amountsNull: Self = StObject.set(x, "total_discount_amounts", null)
    
    inline def setTotal_discount_amountsVarargs(value: TotalDiscountAmount*): Self = StObject.set(x, "total_discount_amounts", js.Array(value*))
    
    inline def setTotal_excluding_tax(value: Double): Self = StObject.set(x, "total_excluding_tax", value.asInstanceOf[js.Any])
    
    inline def setTotal_excluding_taxNull: Self = StObject.set(x, "total_excluding_tax", null)
    
    inline def setTotal_tax_amounts(value: js.Array[TotalTaxAmount]): Self = StObject.set(x, "total_tax_amounts", value.asInstanceOf[js.Any])
    
    inline def setTotal_tax_amountsVarargs(value: TotalTaxAmount*): Self = StObject.set(x, "total_tax_amounts", js.Array(value*))
    
    inline def setTransfer_data(value: TransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    inline def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
    
    inline def setWebhooks_delivered_at(value: Double): Self = StObject.set(x, "webhooks_delivered_at", value.asInstanceOf[js.Any])
    
    inline def setWebhooks_delivered_atNull: Self = StObject.set(x, "webhooks_delivered_at", null)
  }
}
