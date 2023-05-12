package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.Stripe.Address
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.CashBalance
import typings.stripe.mod.Stripe.Customer.InvoiceSettings
import typings.stripe.mod.Stripe.Customer.Shipping
import typings.stripe.mod.Stripe.Customer.Tax
import typings.stripe.mod.Stripe.Customer.TaxExempt
import typings.stripe.mod.Stripe.CustomerSource
import typings.stripe.mod.Stripe.Discount
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Subscription
import typings.stripe.mod.Stripe.TaxId
import typings.stripe.mod.Stripe.TestHelpers.TestClock
import typings.stripe.stripeStrings.customer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Customer> */
trait ResponseCustomer extends StObject {
  
  /**
    * The customer's address.
    */
  var address: js.UndefOr[Address | Null] = js.undefined
  
  /**
    * Current balance, if any, being stored on the customer. If negative, the customer has credit to apply to their next invoice. If positive, the customer has an amount owed that will be added to their next invoice. The balance does not refer to any unpaid invoices; it solely takes into account amounts that have yet to be successfully applied to any invoice. This balance is only taken into account as invoices are finalized.
    */
  var balance: Double
  
  /**
    * The current funds being held by Stripe on behalf of the customer. These funds can be applied towards payment intents with source "cash_balance". The settings[reconciliation_mode] field describes whether these funds are applied to such payment intents manually or automatically.
    */
  var cash_balance: js.UndefOr[CashBalance | Null] = js.undefined
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) the customer can be charged in for recurring billing purposes.
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the default payment source for the customer.
    *
    * If you are using payment methods created via the PaymentMethods API, see the [invoice_settings.default_payment_method](https://stripe.com/docs/api/customers/object#customer_object-invoice_settings-default_payment_method) field instead.
    */
  var default_source: String | CustomerSource | Null
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * When the customer's latest invoice is billed by charging automatically, `delinquent` is `true` if the invoice's latest charge failed. When the customer's latest invoice is billed by sending an invoice, `delinquent` is `true` if the invoice isn't paid by its due date.
    *
    * If an invoice is marked uncollectible by [dunning](https://stripe.com/docs/billing/automatic-collection), `delinquent` doesn't get reset to `false`.
    */
  var delinquent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  
  /**
    * Describes the current discount active on the customer, if there is one.
    */
  var discount: js.UndefOr[Discount | Null] = js.undefined
  
  /**
    * The customer's email address.
    */
  var email: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The current multi-currency balances, if any, being stored on the customer. If positive in a currency, the customer has a credit to apply to their next invoice denominated in that currency. If negative, the customer has an amount owed that will be added to their next invoice denominated in that currency. These balances do not refer to any unpaid invoices. They solely track amounts that have yet to be successfully applied to any invoice. A balance in a particular currency is only applied to any invoice as an invoice in that currency is finalized.
    */
  var invoice_credit_balance: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[String | Null] = js.undefined
  
  var invoice_settings: InvoiceSettings
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * The customer's full name or business name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The suffix of the customer's next invoice number, e.g., 0001.
    */
  var next_invoice_sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: customer
  
  /**
    * The customer's phone number.
    */
  var phone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer's preferred locales (languages), ordered by preference.
    */
  var preferred_locales: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Mailing and shipping address for the customer. Appears on invoices emailed to this customer.
    */
  var shipping: Shipping | Null
  
  /**
    * The customer's payment sources, if any.
    */
  var sources: js.UndefOr[ApiList[CustomerSource]] = js.undefined
  
  /**
    * The customer's current subscriptions, if any.
    */
  var subscriptions: js.UndefOr[ApiList[Subscription]] = js.undefined
  
  var tax: js.UndefOr[Tax] = js.undefined
  
  /**
    * Describes the customer's tax exemption status. One of `none`, `exempt`, or `reverse`. When set to `reverse`, invoice and receipt PDFs include the text **"Reverse charge"**.
    */
  var tax_exempt: js.UndefOr[TaxExempt | Null] = js.undefined
  
  /**
    * The customer's tax IDs.
    */
  var tax_ids: js.UndefOr[ApiList[TaxId]] = js.undefined
  
  /**
    * ID of the test clock this customer belongs to.
    */
  var test_clock: js.UndefOr[String | TestClock | Null] = js.undefined
}
object ResponseCustomer {
  
  inline def apply(
    balance: Double,
    created: Double,
    id: String,
    invoice_settings: InvoiceSettings,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata
  ): ResponseCustomer = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_settings = invoice_settings.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], default_source = null, description = null, email = null, shipping = null)
    __obj.updateDynamic("object")("customer")
    __obj.asInstanceOf[ResponseCustomer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCustomer] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setCash_balance(value: CashBalance): Self = StObject.set(x, "cash_balance", value.asInstanceOf[js.Any])
    
    inline def setCash_balanceNull: Self = StObject.set(x, "cash_balance", null)
    
    inline def setCash_balanceUndefined: Self = StObject.set(x, "cash_balance", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDefault_source(value: String | CustomerSource): Self = StObject.set(x, "default_source", value.asInstanceOf[js.Any])
    
    inline def setDefault_sourceNull: Self = StObject.set(x, "default_source", null)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDelinquent(value: Boolean): Self = StObject.set(x, "delinquent", value.asInstanceOf[js.Any])
    
    inline def setDelinquentNull: Self = StObject.set(x, "delinquent", null)
    
    inline def setDelinquentUndefined: Self = StObject.set(x, "delinquent", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDiscount(value: Discount): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountNull: Self = StObject.set(x, "discount", null)
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_credit_balance(value: StringDictionary[Double]): Self = StObject.set(x, "invoice_credit_balance", value.asInstanceOf[js.Any])
    
    inline def setInvoice_credit_balanceUndefined: Self = StObject.set(x, "invoice_credit_balance", js.undefined)
    
    inline def setInvoice_prefix(value: String): Self = StObject.set(x, "invoice_prefix", value.asInstanceOf[js.Any])
    
    inline def setInvoice_prefixNull: Self = StObject.set(x, "invoice_prefix", null)
    
    inline def setInvoice_prefixUndefined: Self = StObject.set(x, "invoice_prefix", js.undefined)
    
    inline def setInvoice_settings(value: InvoiceSettings): Self = StObject.set(x, "invoice_settings", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext_invoice_sequence(value: Double): Self = StObject.set(x, "next_invoice_sequence", value.asInstanceOf[js.Any])
    
    inline def setNext_invoice_sequenceUndefined: Self = StObject.set(x, "next_invoice_sequence", js.undefined)
    
    inline def setObject(value: customer): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPreferred_locales(value: js.Array[String]): Self = StObject.set(x, "preferred_locales", value.asInstanceOf[js.Any])
    
    inline def setPreferred_localesNull: Self = StObject.set(x, "preferred_locales", null)
    
    inline def setPreferred_localesUndefined: Self = StObject.set(x, "preferred_locales", js.undefined)
    
    inline def setPreferred_localesVarargs(value: String*): Self = StObject.set(x, "preferred_locales", js.Array(value*))
    
    inline def setShipping(value: Shipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingNull: Self = StObject.set(x, "shipping", null)
    
    inline def setSources(value: ApiList[CustomerSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSubscriptions(value: ApiList[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setTax(value: Tax): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    inline def setTax_exempt(value: TaxExempt): Self = StObject.set(x, "tax_exempt", value.asInstanceOf[js.Any])
    
    inline def setTax_exemptNull: Self = StObject.set(x, "tax_exempt", null)
    
    inline def setTax_exemptUndefined: Self = StObject.set(x, "tax_exempt", js.undefined)
    
    inline def setTax_ids(value: ApiList[TaxId]): Self = StObject.set(x, "tax_ids", value.asInstanceOf[js.Any])
    
    inline def setTax_idsUndefined: Self = StObject.set(x, "tax_ids", js.undefined)
    
    inline def setTest_clock(value: String | TestClock): Self = StObject.set(x, "test_clock", value.asInstanceOf[js.Any])
    
    inline def setTest_clockNull: Self = StObject.set(x, "test_clock", null)
    
    inline def setTest_clockUndefined: Self = StObject.set(x, "test_clock", js.undefined)
  }
}
