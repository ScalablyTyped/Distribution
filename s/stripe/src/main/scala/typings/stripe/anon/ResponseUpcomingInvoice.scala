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

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.UpcomingInvoice> */
trait ResponseUpcomingInvoice extends StObject {
  
  var account_country: js.UndefOr[String | Null] = js.undefined
  
  var account_name: js.UndefOr[String | Null] = js.undefined
  
  var account_tax_ids: js.UndefOr[(js.Array[String | TaxId | DeletedTaxId]) | Null] = js.undefined
  
  var amount_due: Double
  
  var amount_paid: Double
  
  var amount_remaining: Double
  
  var amount_shipping: Double
  
  var application: js.UndefOr[String | Application | DeletedApplication | Null] = js.undefined
  
  var application_fee_amount: js.UndefOr[Double | Null] = js.undefined
  
  var attempt_count: Double
  
  var attempted: Boolean
  
  var auto_advance: js.UndefOr[Boolean] = js.undefined
  
  var automatic_tax: AutomaticTax
  
  var billing_reason: js.UndefOr[BillingReason | Null] = js.undefined
  
  var charge: js.UndefOr[String | Charge | Null] = js.undefined
  
  var collection_method: CollectionMethod
  
  var created: Double
  
  var currency: String
  
  var custom_fields: js.UndefOr[js.Array[CustomField] | Null] = js.undefined
  
  var customer: js.UndefOr[String | Customer | DeletedCustomer | Null] = js.undefined
  
  var customer_address: js.UndefOr[Address | Null] = js.undefined
  
  var customer_email: js.UndefOr[String | Null] = js.undefined
  
  var customer_name: js.UndefOr[String | Null] = js.undefined
  
  var customer_phone: js.UndefOr[String | Null] = js.undefined
  
  var customer_shipping: js.UndefOr[CustomerShipping | Null] = js.undefined
  
  var customer_tax_exempt: js.UndefOr[CustomerTaxExempt | Null] = js.undefined
  
  var customer_tax_ids: js.UndefOr[js.Array[CustomerTaxId] | Null] = js.undefined
  
  var default_payment_method: js.UndefOr[String | PaymentMethod | Null] = js.undefined
  
  var default_source: js.UndefOr[String | CustomerSource | Null] = js.undefined
  
  var default_tax_rates: js.Array[TaxRate]
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var discount: js.UndefOr[Discount | Null] = js.undefined
  
  var discounts: js.UndefOr[(js.Array[String | Discount | DeletedDiscount]) | Null] = js.undefined
  
  var due_date: js.UndefOr[Double | Null] = js.undefined
  
  var ending_balance: js.UndefOr[Double | Null] = js.undefined
  
  var footer: js.UndefOr[String | Null] = js.undefined
  
  var from_invoice: js.UndefOr[FromInvoice | Null] = js.undefined
  
  var hosted_invoice_url: js.UndefOr[String | Null] = js.undefined
  
  var invoice_pdf: js.UndefOr[String | Null] = js.undefined
  
  var lastResponse: ApiVersion
  
  var last_finalization_error: js.UndefOr[LastFinalizationError | Null] = js.undefined
  
  var latest_revision: js.UndefOr[String | Invoice | Null] = js.undefined
  
  var lines: ApiList[InvoiceLineItem]
  
  var livemode: Boolean
  
  var metadata: js.UndefOr[Metadata | Null] = js.undefined
  
  var next_payment_attempt: js.UndefOr[Double | Null] = js.undefined
  
  var number: js.UndefOr[String | Null] = js.undefined
  
  var `object`: invoice
  
  var on_behalf_of: js.UndefOr[String | Account | Null] = js.undefined
  
  var paid: Boolean
  
  var paid_out_of_band: Boolean
  
  var payment_intent: js.UndefOr[String | PaymentIntent | Null] = js.undefined
  
  var payment_settings: PaymentSettings
  
  var period_end: Double
  
  var period_start: Double
  
  var post_payment_credit_notes_amount: Double
  
  var pre_payment_credit_notes_amount: Double
  
  var quote: js.UndefOr[String | Quote | Null] = js.undefined
  
  var receipt_number: js.UndefOr[String | Null] = js.undefined
  
  var rendering_options: js.UndefOr[RenderingOptions | Null] = js.undefined
  
  var shipping_cost: js.UndefOr[ShippingCost | Null] = js.undefined
  
  var shipping_details: js.UndefOr[ShippingDetails | Null] = js.undefined
  
  var starting_balance: Double
  
  var statement_descriptor: js.UndefOr[String | Null] = js.undefined
  
  var status: js.UndefOr[Status | Null] = js.undefined
  
  var status_transitions: StatusTransitions
  
  var subscription: js.UndefOr[String | Subscription | Null] = js.undefined
  
  var subscription_proration_date: js.UndefOr[Double] = js.undefined
  
  var subtotal: Double
  
  var subtotal_excluding_tax: js.UndefOr[Double | Null] = js.undefined
  
  var tax: js.UndefOr[Double | Null] = js.undefined
  
  var test_clock: js.UndefOr[String | TestClock | Null] = js.undefined
  
  var threshold_reason: js.UndefOr[ThresholdReason] = js.undefined
  
  var total: Double
  
  var total_discount_amounts: js.UndefOr[js.Array[TotalDiscountAmount] | Null] = js.undefined
  
  var total_excluding_tax: js.UndefOr[Double | Null] = js.undefined
  
  var total_tax_amounts: js.Array[TotalTaxAmount]
  
  var transfer_data: js.UndefOr[TransferData | Null] = js.undefined
  
  var webhooks_delivered_at: js.UndefOr[Double | Null] = js.undefined
}
object ResponseUpcomingInvoice {
  
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
  ): ResponseUpcomingInvoice = {
    val __obj = js.Dynamic.literal(amount_due = amount_due.asInstanceOf[js.Any], amount_paid = amount_paid.asInstanceOf[js.Any], amount_remaining = amount_remaining.asInstanceOf[js.Any], amount_shipping = amount_shipping.asInstanceOf[js.Any], attempt_count = attempt_count.asInstanceOf[js.Any], attempted = attempted.asInstanceOf[js.Any], automatic_tax = automatic_tax.asInstanceOf[js.Any], collection_method = collection_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], default_tax_rates = default_tax_rates.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], paid_out_of_band = paid_out_of_band.asInstanceOf[js.Any], payment_settings = payment_settings.asInstanceOf[js.Any], period_end = period_end.asInstanceOf[js.Any], period_start = period_start.asInstanceOf[js.Any], post_payment_credit_notes_amount = post_payment_credit_notes_amount.asInstanceOf[js.Any], pre_payment_credit_notes_amount = pre_payment_credit_notes_amount.asInstanceOf[js.Any], starting_balance = starting_balance.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_tax_amounts = total_tax_amounts.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("invoice")
    __obj.asInstanceOf[ResponseUpcomingInvoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseUpcomingInvoice] (val x: Self) extends AnyVal {
    
    inline def setAccount_country(value: String): Self = StObject.set(x, "account_country", value.asInstanceOf[js.Any])
    
    inline def setAccount_countryNull: Self = StObject.set(x, "account_country", null)
    
    inline def setAccount_countryUndefined: Self = StObject.set(x, "account_country", js.undefined)
    
    inline def setAccount_name(value: String): Self = StObject.set(x, "account_name", value.asInstanceOf[js.Any])
    
    inline def setAccount_nameNull: Self = StObject.set(x, "account_name", null)
    
    inline def setAccount_nameUndefined: Self = StObject.set(x, "account_name", js.undefined)
    
    inline def setAccount_tax_ids(value: js.Array[String | TaxId | DeletedTaxId]): Self = StObject.set(x, "account_tax_ids", value.asInstanceOf[js.Any])
    
    inline def setAccount_tax_idsNull: Self = StObject.set(x, "account_tax_ids", null)
    
    inline def setAccount_tax_idsUndefined: Self = StObject.set(x, "account_tax_ids", js.undefined)
    
    inline def setAccount_tax_idsVarargs(value: (String | TaxId | DeletedTaxId)*): Self = StObject.set(x, "account_tax_ids", js.Array(value*))
    
    inline def setAmount_due(value: Double): Self = StObject.set(x, "amount_due", value.asInstanceOf[js.Any])
    
    inline def setAmount_paid(value: Double): Self = StObject.set(x, "amount_paid", value.asInstanceOf[js.Any])
    
    inline def setAmount_remaining(value: Double): Self = StObject.set(x, "amount_remaining", value.asInstanceOf[js.Any])
    
    inline def setAmount_shipping(value: Double): Self = StObject.set(x, "amount_shipping", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: String | Application | DeletedApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
    
    inline def setApplication_fee_amountUndefined: Self = StObject.set(x, "application_fee_amount", js.undefined)
    
    inline def setAttempt_count(value: Double): Self = StObject.set(x, "attempt_count", value.asInstanceOf[js.Any])
    
    inline def setAttempted(value: Boolean): Self = StObject.set(x, "attempted", value.asInstanceOf[js.Any])
    
    inline def setAuto_advance(value: Boolean): Self = StObject.set(x, "auto_advance", value.asInstanceOf[js.Any])
    
    inline def setAuto_advanceUndefined: Self = StObject.set(x, "auto_advance", js.undefined)
    
    inline def setAutomatic_tax(value: AutomaticTax): Self = StObject.set(x, "automatic_tax", value.asInstanceOf[js.Any])
    
    inline def setBilling_reason(value: BillingReason): Self = StObject.set(x, "billing_reason", value.asInstanceOf[js.Any])
    
    inline def setBilling_reasonNull: Self = StObject.set(x, "billing_reason", null)
    
    inline def setBilling_reasonUndefined: Self = StObject.set(x, "billing_reason", js.undefined)
    
    inline def setCharge(value: String | Charge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setChargeNull: Self = StObject.set(x, "charge", null)
    
    inline def setChargeUndefined: Self = StObject.set(x, "charge", js.undefined)
    
    inline def setCollection_method(value: CollectionMethod): Self = StObject.set(x, "collection_method", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustom_fields(value: js.Array[CustomField]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsNull: Self = StObject.set(x, "custom_fields", null)
    
    inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    inline def setCustom_fieldsVarargs(value: CustomField*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setCustomer_address(value: Address): Self = StObject.set(x, "customer_address", value.asInstanceOf[js.Any])
    
    inline def setCustomer_addressNull: Self = StObject.set(x, "customer_address", null)
    
    inline def setCustomer_addressUndefined: Self = StObject.set(x, "customer_address", js.undefined)
    
    inline def setCustomer_email(value: String): Self = StObject.set(x, "customer_email", value.asInstanceOf[js.Any])
    
    inline def setCustomer_emailNull: Self = StObject.set(x, "customer_email", null)
    
    inline def setCustomer_emailUndefined: Self = StObject.set(x, "customer_email", js.undefined)
    
    inline def setCustomer_name(value: String): Self = StObject.set(x, "customer_name", value.asInstanceOf[js.Any])
    
    inline def setCustomer_nameNull: Self = StObject.set(x, "customer_name", null)
    
    inline def setCustomer_nameUndefined: Self = StObject.set(x, "customer_name", js.undefined)
    
    inline def setCustomer_phone(value: String): Self = StObject.set(x, "customer_phone", value.asInstanceOf[js.Any])
    
    inline def setCustomer_phoneNull: Self = StObject.set(x, "customer_phone", null)
    
    inline def setCustomer_phoneUndefined: Self = StObject.set(x, "customer_phone", js.undefined)
    
    inline def setCustomer_shipping(value: CustomerShipping): Self = StObject.set(x, "customer_shipping", value.asInstanceOf[js.Any])
    
    inline def setCustomer_shippingNull: Self = StObject.set(x, "customer_shipping", null)
    
    inline def setCustomer_shippingUndefined: Self = StObject.set(x, "customer_shipping", js.undefined)
    
    inline def setCustomer_tax_exempt(value: CustomerTaxExempt): Self = StObject.set(x, "customer_tax_exempt", value.asInstanceOf[js.Any])
    
    inline def setCustomer_tax_exemptNull: Self = StObject.set(x, "customer_tax_exempt", null)
    
    inline def setCustomer_tax_exemptUndefined: Self = StObject.set(x, "customer_tax_exempt", js.undefined)
    
    inline def setCustomer_tax_ids(value: js.Array[CustomerTaxId]): Self = StObject.set(x, "customer_tax_ids", value.asInstanceOf[js.Any])
    
    inline def setCustomer_tax_idsNull: Self = StObject.set(x, "customer_tax_ids", null)
    
    inline def setCustomer_tax_idsUndefined: Self = StObject.set(x, "customer_tax_ids", js.undefined)
    
    inline def setCustomer_tax_idsVarargs(value: CustomerTaxId*): Self = StObject.set(x, "customer_tax_ids", js.Array(value*))
    
    inline def setDefault_payment_method(value: String | PaymentMethod): Self = StObject.set(x, "default_payment_method", value.asInstanceOf[js.Any])
    
    inline def setDefault_payment_methodNull: Self = StObject.set(x, "default_payment_method", null)
    
    inline def setDefault_payment_methodUndefined: Self = StObject.set(x, "default_payment_method", js.undefined)
    
    inline def setDefault_source(value: String | CustomerSource): Self = StObject.set(x, "default_source", value.asInstanceOf[js.Any])
    
    inline def setDefault_sourceNull: Self = StObject.set(x, "default_source", null)
    
    inline def setDefault_sourceUndefined: Self = StObject.set(x, "default_source", js.undefined)
    
    inline def setDefault_tax_rates(value: js.Array[TaxRate]): Self = StObject.set(x, "default_tax_rates", value.asInstanceOf[js.Any])
    
    inline def setDefault_tax_ratesVarargs(value: TaxRate*): Self = StObject.set(x, "default_tax_rates", js.Array(value*))
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscount(value: Discount): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountNull: Self = StObject.set(x, "discount", null)
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setDiscounts(value: js.Array[String | Discount | DeletedDiscount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsNull: Self = StObject.set(x, "discounts", null)
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: (String | Discount | DeletedDiscount)*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setDue_date(value: Double): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    inline def setDue_dateNull: Self = StObject.set(x, "due_date", null)
    
    inline def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
    
    inline def setEnding_balance(value: Double): Self = StObject.set(x, "ending_balance", value.asInstanceOf[js.Any])
    
    inline def setEnding_balanceNull: Self = StObject.set(x, "ending_balance", null)
    
    inline def setEnding_balanceUndefined: Self = StObject.set(x, "ending_balance", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFrom_invoice(value: FromInvoice): Self = StObject.set(x, "from_invoice", value.asInstanceOf[js.Any])
    
    inline def setFrom_invoiceNull: Self = StObject.set(x, "from_invoice", null)
    
    inline def setFrom_invoiceUndefined: Self = StObject.set(x, "from_invoice", js.undefined)
    
    inline def setHosted_invoice_url(value: String): Self = StObject.set(x, "hosted_invoice_url", value.asInstanceOf[js.Any])
    
    inline def setHosted_invoice_urlNull: Self = StObject.set(x, "hosted_invoice_url", null)
    
    inline def setHosted_invoice_urlUndefined: Self = StObject.set(x, "hosted_invoice_url", js.undefined)
    
    inline def setInvoice_pdf(value: String): Self = StObject.set(x, "invoice_pdf", value.asInstanceOf[js.Any])
    
    inline def setInvoice_pdfNull: Self = StObject.set(x, "invoice_pdf", null)
    
    inline def setInvoice_pdfUndefined: Self = StObject.set(x, "invoice_pdf", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLast_finalization_error(value: LastFinalizationError): Self = StObject.set(x, "last_finalization_error", value.asInstanceOf[js.Any])
    
    inline def setLast_finalization_errorNull: Self = StObject.set(x, "last_finalization_error", null)
    
    inline def setLast_finalization_errorUndefined: Self = StObject.set(x, "last_finalization_error", js.undefined)
    
    inline def setLatest_revision(value: String | Invoice): Self = StObject.set(x, "latest_revision", value.asInstanceOf[js.Any])
    
    inline def setLatest_revisionNull: Self = StObject.set(x, "latest_revision", null)
    
    inline def setLatest_revisionUndefined: Self = StObject.set(x, "latest_revision", js.undefined)
    
    inline def setLines(value: ApiList[InvoiceLineItem]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNext_payment_attempt(value: Double): Self = StObject.set(x, "next_payment_attempt", value.asInstanceOf[js.Any])
    
    inline def setNext_payment_attemptNull: Self = StObject.set(x, "next_payment_attempt", null)
    
    inline def setNext_payment_attemptUndefined: Self = StObject.set(x, "next_payment_attempt", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setObject(value: invoice): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_of(value: String | Account): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
    
    inline def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
    
    inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPaid_out_of_band(value: Boolean): Self = StObject.set(x, "paid_out_of_band", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent(value: String | PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentNull: Self = StObject.set(x, "payment_intent", null)
    
    inline def setPayment_intentUndefined: Self = StObject.set(x, "payment_intent", js.undefined)
    
    inline def setPayment_settings(value: PaymentSettings): Self = StObject.set(x, "payment_settings", value.asInstanceOf[js.Any])
    
    inline def setPeriod_end(value: Double): Self = StObject.set(x, "period_end", value.asInstanceOf[js.Any])
    
    inline def setPeriod_start(value: Double): Self = StObject.set(x, "period_start", value.asInstanceOf[js.Any])
    
    inline def setPost_payment_credit_notes_amount(value: Double): Self = StObject.set(x, "post_payment_credit_notes_amount", value.asInstanceOf[js.Any])
    
    inline def setPre_payment_credit_notes_amount(value: Double): Self = StObject.set(x, "pre_payment_credit_notes_amount", value.asInstanceOf[js.Any])
    
    inline def setQuote(value: String | Quote): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
    
    inline def setReceipt_numberNull: Self = StObject.set(x, "receipt_number", null)
    
    inline def setReceipt_numberUndefined: Self = StObject.set(x, "receipt_number", js.undefined)
    
    inline def setRendering_options(value: RenderingOptions): Self = StObject.set(x, "rendering_options", value.asInstanceOf[js.Any])
    
    inline def setRendering_optionsNull: Self = StObject.set(x, "rendering_options", null)
    
    inline def setRendering_optionsUndefined: Self = StObject.set(x, "rendering_options", js.undefined)
    
    inline def setShipping_cost(value: ShippingCost): Self = StObject.set(x, "shipping_cost", value.asInstanceOf[js.Any])
    
    inline def setShipping_costNull: Self = StObject.set(x, "shipping_cost", null)
    
    inline def setShipping_costUndefined: Self = StObject.set(x, "shipping_cost", js.undefined)
    
    inline def setShipping_details(value: ShippingDetails): Self = StObject.set(x, "shipping_details", value.asInstanceOf[js.Any])
    
    inline def setShipping_detailsNull: Self = StObject.set(x, "shipping_details", null)
    
    inline def setShipping_detailsUndefined: Self = StObject.set(x, "shipping_details", js.undefined)
    
    inline def setStarting_balance(value: Double): Self = StObject.set(x, "starting_balance", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    inline def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatus_transitions(value: StatusTransitions): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String | Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setSubscription_proration_date(value: Double): Self = StObject.set(x, "subscription_proration_date", value.asInstanceOf[js.Any])
    
    inline def setSubscription_proration_dateUndefined: Self = StObject.set(x, "subscription_proration_date", js.undefined)
    
    inline def setSubtotal(value: Double): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    inline def setSubtotal_excluding_tax(value: Double): Self = StObject.set(x, "subtotal_excluding_tax", value.asInstanceOf[js.Any])
    
    inline def setSubtotal_excluding_taxNull: Self = StObject.set(x, "subtotal_excluding_tax", null)
    
    inline def setSubtotal_excluding_taxUndefined: Self = StObject.set(x, "subtotal_excluding_tax", js.undefined)
    
    inline def setTax(value: Double): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxNull: Self = StObject.set(x, "tax", null)
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    inline def setTest_clock(value: String | TestClock): Self = StObject.set(x, "test_clock", value.asInstanceOf[js.Any])
    
    inline def setTest_clockNull: Self = StObject.set(x, "test_clock", null)
    
    inline def setTest_clockUndefined: Self = StObject.set(x, "test_clock", js.undefined)
    
    inline def setThreshold_reason(value: ThresholdReason): Self = StObject.set(x, "threshold_reason", value.asInstanceOf[js.Any])
    
    inline def setThreshold_reasonUndefined: Self = StObject.set(x, "threshold_reason", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_discount_amounts(value: js.Array[TotalDiscountAmount]): Self = StObject.set(x, "total_discount_amounts", value.asInstanceOf[js.Any])
    
    inline def setTotal_discount_amountsNull: Self = StObject.set(x, "total_discount_amounts", null)
    
    inline def setTotal_discount_amountsUndefined: Self = StObject.set(x, "total_discount_amounts", js.undefined)
    
    inline def setTotal_discount_amountsVarargs(value: TotalDiscountAmount*): Self = StObject.set(x, "total_discount_amounts", js.Array(value*))
    
    inline def setTotal_excluding_tax(value: Double): Self = StObject.set(x, "total_excluding_tax", value.asInstanceOf[js.Any])
    
    inline def setTotal_excluding_taxNull: Self = StObject.set(x, "total_excluding_tax", null)
    
    inline def setTotal_excluding_taxUndefined: Self = StObject.set(x, "total_excluding_tax", js.undefined)
    
    inline def setTotal_tax_amounts(value: js.Array[TotalTaxAmount]): Self = StObject.set(x, "total_tax_amounts", value.asInstanceOf[js.Any])
    
    inline def setTotal_tax_amountsVarargs(value: TotalTaxAmount*): Self = StObject.set(x, "total_tax_amounts", js.Array(value*))
    
    inline def setTransfer_data(value: TransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    inline def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
    
    inline def setTransfer_dataUndefined: Self = StObject.set(x, "transfer_data", js.undefined)
    
    inline def setWebhooks_delivered_at(value: Double): Self = StObject.set(x, "webhooks_delivered_at", value.asInstanceOf[js.Any])
    
    inline def setWebhooks_delivered_atNull: Self = StObject.set(x, "webhooks_delivered_at", null)
    
    inline def setWebhooks_delivered_atUndefined: Self = StObject.set(x, "webhooks_delivered_at", js.undefined)
  }
}
