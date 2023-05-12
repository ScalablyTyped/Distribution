package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Checkout.Session.AfterExpiration
import typings.stripe.mod.Stripe.Checkout.Session.AutomaticTax
import typings.stripe.mod.Stripe.Checkout.Session.BillingAddressCollection
import typings.stripe.mod.Stripe.Checkout.Session.Consent
import typings.stripe.mod.Stripe.Checkout.Session.ConsentCollection
import typings.stripe.mod.Stripe.Checkout.Session.CurrencyConversion
import typings.stripe.mod.Stripe.Checkout.Session.CustomField
import typings.stripe.mod.Stripe.Checkout.Session.CustomText
import typings.stripe.mod.Stripe.Checkout.Session.CustomerCreation
import typings.stripe.mod.Stripe.Checkout.Session.CustomerDetails
import typings.stripe.mod.Stripe.Checkout.Session.InvoiceCreation
import typings.stripe.mod.Stripe.Checkout.Session.Locale
import typings.stripe.mod.Stripe.Checkout.Session.Mode
import typings.stripe.mod.Stripe.Checkout.Session.PaymentMethodCollection
import typings.stripe.mod.Stripe.Checkout.Session.PaymentMethodOptions
import typings.stripe.mod.Stripe.Checkout.Session.PaymentStatus
import typings.stripe.mod.Stripe.Checkout.Session.PhoneNumberCollection
import typings.stripe.mod.Stripe.Checkout.Session.ShippingAddressCollection
import typings.stripe.mod.Stripe.Checkout.Session.ShippingCost
import typings.stripe.mod.Stripe.Checkout.Session.ShippingDetails
import typings.stripe.mod.Stripe.Checkout.Session.ShippingOption
import typings.stripe.mod.Stripe.Checkout.Session.Status
import typings.stripe.mod.Stripe.Checkout.Session.SubmitType
import typings.stripe.mod.Stripe.Checkout.Session.TaxIdCollection
import typings.stripe.mod.Stripe.Checkout.Session.TotalDetails
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.Invoice
import typings.stripe.mod.Stripe.LineItem
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.PaymentIntent
import typings.stripe.mod.Stripe.PaymentLink
import typings.stripe.mod.Stripe.SetupIntent
import typings.stripe.mod.Stripe.Subscription
import typings.stripe.stripeStrings.checkoutDotsession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Checkout.Session> */
trait ResponseSessionAfterexpiration extends StObject {
  
  /**
    * When set, provides configuration for actions to take if this Checkout Session expires.
    */
  var after_expiration: AfterExpiration | Null
  
  /**
    * Enables user redeemable promotion codes.
    */
  var allow_promotion_codes: Boolean | Null
  
  /**
    * Total of all items before discounts or taxes are applied.
    */
  var amount_subtotal: Double | Null
  
  /**
    * Total of all items after discounts and taxes are applied.
    */
  var amount_total: Double | Null
  
  var automatic_tax: AutomaticTax
  
  /**
    * Describes whether Checkout should collect the customer's billing address.
    */
  var billing_address_collection: BillingAddressCollection | Null
  
  /**
    * If set, Checkout displays a back button and customers will be directed to this URL if they decide to cancel payment and return to your website.
    */
  var cancel_url: String | Null
  
  /**
    * A unique string to reference the Checkout Session. This can be a
    * customer ID, a cart ID, or similar, and can be used to reconcile the
    * Session with your internal systems.
    */
  var client_reference_id: String | Null
  
  /**
    * Results of `consent_collection` for this session.
    */
  var consent: Consent | Null
  
  /**
    * When set, provides configuration for the Checkout Session to gather active consent from customers.
    */
  var consent_collection: ConsentCollection | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String | Null
  
  /**
    * Currency conversion details for automatic currency conversion sessions
    */
  var currency_conversion: CurrencyConversion | Null
  
  /**
    * Collect additional information from your customer using custom fields. Up to 2 fields are supported.
    */
  var custom_fields: js.Array[CustomField]
  
  var custom_text: CustomText
  
  /**
    * The ID of the customer for this Session.
    * For Checkout Sessions in `payment` or `subscription` mode, Checkout
    * will create a new customer object based on information provided
    * during the payment flow unless an existing customer was provided when
    * the Session was created.
    */
  var customer: String | Customer | DeletedCustomer | Null
  
  /**
    * Configure whether a Checkout Session creates a Customer when the Checkout Session completes.
    */
  var customer_creation: CustomerCreation | Null
  
  /**
    * The customer details including the customer's tax exempt status and the customer's tax IDs. Only the customer's email is present on Sessions in `setup` mode.
    */
  var customer_details: CustomerDetails | Null
  
  /**
    * If provided, this value will be used when the Customer object is created.
    * If not provided, customers will be asked to enter their email address.
    * Use this parameter to prefill customer data if you already have an email
    * on file. To access information about the customer once the payment flow is
    * complete, use the `customer` attribute.
    */
  var customer_email: String | Null
  
  /**
    * The timestamp at which the Checkout Session will expire.
    */
  var expires_at: Double
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * ID of the invoice created by the Checkout Session, if it exists.
    */
  var invoice: String | Invoice | Null
  
  /**
    * Details on the state of invoice creation for the Checkout Session.
    */
  var invoice_creation: InvoiceCreation | Null
  
  var lastResponse: ApiVersion
  
  /**
    * The line items purchased by the customer.
    */
  var line_items: js.UndefOr[ApiList[LineItem]] = js.undefined
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's locale is used.
    */
  var locale: Locale | Null
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * The mode of the Checkout Session.
    */
  var mode: Mode
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: checkoutDotsession
  
  /**
    * The ID of the PaymentIntent for Checkout Sessions in `payment` mode.
    */
  var payment_intent: String | PaymentIntent | Null
  
  /**
    * The ID of the Payment Link that created this Session.
    */
  var payment_link: String | PaymentLink | Null
  
  /**
    * Configure whether a Checkout Session should collect a payment method.
    */
  var payment_method_collection: PaymentMethodCollection | Null
  
  /**
    * Payment-method-specific configuration for the PaymentIntent or SetupIntent of this CheckoutSession.
    */
  var payment_method_options: PaymentMethodOptions | Null
  
  /**
    * A list of the types of payment methods (e.g. card) this Checkout
    * Session is allowed to accept.
    */
  var payment_method_types: js.Array[String]
  
  /**
    * The payment status of the Checkout Session, one of `paid`, `unpaid`, or `no_payment_required`.
    * You can use this value to decide when to fulfill your customer's order.
    */
  var payment_status: PaymentStatus
  
  var phone_number_collection: js.UndefOr[PhoneNumberCollection] = js.undefined
  
  /**
    * The ID of the original expired Checkout Session that triggered the recovery flow.
    */
  var recovered_from: String | Null
  
  /**
    * The ID of the SetupIntent for Checkout Sessions in `setup` mode.
    */
  var setup_intent: String | SetupIntent | Null
  
  /**
    * When set, provides configuration for Checkout to collect a shipping address from a customer.
    */
  var shipping_address_collection: ShippingAddressCollection | Null
  
  /**
    * The details of the customer cost of shipping, including the customer chosen ShippingRate.
    */
  var shipping_cost: ShippingCost | Null
  
  /**
    * Shipping information for this Checkout Session.
    */
  var shipping_details: ShippingDetails | Null
  
  /**
    * The shipping rate options applied to this Session.
    */
  var shipping_options: js.Array[ShippingOption]
  
  /**
    * The status of the Checkout Session, one of `open`, `complete`, or `expired`.
    */
  var status: Status | Null
  
  /**
    * Describes the type of transaction being performed by Checkout in order to customize
    * relevant text on the page, such as the submit button. `submit_type` can only be
    * specified on Checkout Sessions in `payment` mode, but not Checkout Sessions
    * in `subscription` or `setup` mode.
    */
  var submit_type: SubmitType | Null
  
  /**
    * The ID of the subscription for Checkout Sessions in `subscription` mode.
    */
  var subscription: String | Subscription | Null
  
  /**
    * The URL the customer will be directed to after the payment or
    * subscription creation is successful.
    */
  var success_url: String
  
  var tax_id_collection: js.UndefOr[TaxIdCollection] = js.undefined
  
  /**
    * Tax and discount details for the computed total amount.
    */
  var total_details: TotalDetails | Null
  
  /**
    * The URL to the Checkout Session. Redirect customers to this URL to take them to Checkout. If you're using [Custom Domains](https://stripe.com/docs/payments/checkout/custom-domains), the URL will use your subdomain. Otherwise, it'll use `checkout.stripe.com.`
    * This value is only present when the session is active.
    */
  var url: String | Null
}
object ResponseSessionAfterexpiration {
  
  inline def apply(
    automatic_tax: AutomaticTax,
    created: Double,
    custom_fields: js.Array[CustomField],
    custom_text: CustomText,
    expires_at: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    mode: Mode,
    payment_method_types: js.Array[String],
    payment_status: PaymentStatus,
    shipping_options: js.Array[ShippingOption],
    success_url: String
  ): ResponseSessionAfterexpiration = {
    val __obj = js.Dynamic.literal(automatic_tax = automatic_tax.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], custom_text = custom_text.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], payment_status = payment_status.asInstanceOf[js.Any], shipping_options = shipping_options.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any], after_expiration = null, allow_promotion_codes = null, amount_subtotal = null, amount_total = null, billing_address_collection = null, cancel_url = null, client_reference_id = null, consent = null, consent_collection = null, currency = null, currency_conversion = null, customer = null, customer_creation = null, customer_details = null, customer_email = null, invoice = null, invoice_creation = null, locale = null, metadata = null, payment_intent = null, payment_link = null, payment_method_collection = null, payment_method_options = null, recovered_from = null, setup_intent = null, shipping_address_collection = null, shipping_cost = null, shipping_details = null, status = null, submit_type = null, subscription = null, total_details = null, url = null)
    __obj.updateDynamic("object")("checkout.session")
    __obj.asInstanceOf[ResponseSessionAfterexpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSessionAfterexpiration] (val x: Self) extends AnyVal {
    
    inline def setAfter_expiration(value: AfterExpiration): Self = StObject.set(x, "after_expiration", value.asInstanceOf[js.Any])
    
    inline def setAfter_expirationNull: Self = StObject.set(x, "after_expiration", null)
    
    inline def setAllow_promotion_codes(value: Boolean): Self = StObject.set(x, "allow_promotion_codes", value.asInstanceOf[js.Any])
    
    inline def setAllow_promotion_codesNull: Self = StObject.set(x, "allow_promotion_codes", null)
    
    inline def setAmount_subtotal(value: Double): Self = StObject.set(x, "amount_subtotal", value.asInstanceOf[js.Any])
    
    inline def setAmount_subtotalNull: Self = StObject.set(x, "amount_subtotal", null)
    
    inline def setAmount_total(value: Double): Self = StObject.set(x, "amount_total", value.asInstanceOf[js.Any])
    
    inline def setAmount_totalNull: Self = StObject.set(x, "amount_total", null)
    
    inline def setAutomatic_tax(value: AutomaticTax): Self = StObject.set(x, "automatic_tax", value.asInstanceOf[js.Any])
    
    inline def setBilling_address_collection(value: BillingAddressCollection): Self = StObject.set(x, "billing_address_collection", value.asInstanceOf[js.Any])
    
    inline def setBilling_address_collectionNull: Self = StObject.set(x, "billing_address_collection", null)
    
    inline def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    inline def setCancel_urlNull: Self = StObject.set(x, "cancel_url", null)
    
    inline def setClient_reference_id(value: String): Self = StObject.set(x, "client_reference_id", value.asInstanceOf[js.Any])
    
    inline def setClient_reference_idNull: Self = StObject.set(x, "client_reference_id", null)
    
    inline def setConsent(value: Consent): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    inline def setConsentNull: Self = StObject.set(x, "consent", null)
    
    inline def setConsent_collection(value: ConsentCollection): Self = StObject.set(x, "consent_collection", value.asInstanceOf[js.Any])
    
    inline def setConsent_collectionNull: Self = StObject.set(x, "consent_collection", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrency_conversion(value: CurrencyConversion): Self = StObject.set(x, "currency_conversion", value.asInstanceOf[js.Any])
    
    inline def setCurrency_conversionNull: Self = StObject.set(x, "currency_conversion", null)
    
    inline def setCustom_fields(value: js.Array[CustomField]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsVarargs(value: CustomField*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setCustom_text(value: CustomText): Self = StObject.set(x, "custom_text", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomer_creation(value: CustomerCreation): Self = StObject.set(x, "customer_creation", value.asInstanceOf[js.Any])
    
    inline def setCustomer_creationNull: Self = StObject.set(x, "customer_creation", null)
    
    inline def setCustomer_details(value: CustomerDetails): Self = StObject.set(x, "customer_details", value.asInstanceOf[js.Any])
    
    inline def setCustomer_detailsNull: Self = StObject.set(x, "customer_details", null)
    
    inline def setCustomer_email(value: String): Self = StObject.set(x, "customer_email", value.asInstanceOf[js.Any])
    
    inline def setCustomer_emailNull: Self = StObject.set(x, "customer_email", null)
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice(value: String | Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNull: Self = StObject.set(x, "invoice", null)
    
    inline def setInvoice_creation(value: InvoiceCreation): Self = StObject.set(x, "invoice_creation", value.asInstanceOf[js.Any])
    
    inline def setInvoice_creationNull: Self = StObject.set(x, "invoice_creation", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLine_items(value: ApiList[LineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
    
    inline def setLine_itemsUndefined: Self = StObject.set(x, "line_items", js.undefined)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: checkoutDotsession): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent(value: String | PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentNull: Self = StObject.set(x, "payment_intent", null)
    
    inline def setPayment_link(value: String | PaymentLink): Self = StObject.set(x, "payment_link", value.asInstanceOf[js.Any])
    
    inline def setPayment_linkNull: Self = StObject.set(x, "payment_link", null)
    
    inline def setPayment_method_collection(value: PaymentMethodCollection): Self = StObject.set(x, "payment_method_collection", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_collectionNull: Self = StObject.set(x, "payment_method_collection", null)
    
    inline def setPayment_method_options(value: PaymentMethodOptions): Self = StObject.set(x, "payment_method_options", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_optionsNull: Self = StObject.set(x, "payment_method_options", null)
    
    inline def setPayment_method_types(value: js.Array[String]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_typesVarargs(value: String*): Self = StObject.set(x, "payment_method_types", js.Array(value*))
    
    inline def setPayment_status(value: PaymentStatus): Self = StObject.set(x, "payment_status", value.asInstanceOf[js.Any])
    
    inline def setPhone_number_collection(value: PhoneNumberCollection): Self = StObject.set(x, "phone_number_collection", value.asInstanceOf[js.Any])
    
    inline def setPhone_number_collectionUndefined: Self = StObject.set(x, "phone_number_collection", js.undefined)
    
    inline def setRecovered_from(value: String): Self = StObject.set(x, "recovered_from", value.asInstanceOf[js.Any])
    
    inline def setRecovered_fromNull: Self = StObject.set(x, "recovered_from", null)
    
    inline def setSetup_intent(value: String | SetupIntent): Self = StObject.set(x, "setup_intent", value.asInstanceOf[js.Any])
    
    inline def setSetup_intentNull: Self = StObject.set(x, "setup_intent", null)
    
    inline def setShipping_address_collection(value: ShippingAddressCollection): Self = StObject.set(x, "shipping_address_collection", value.asInstanceOf[js.Any])
    
    inline def setShipping_address_collectionNull: Self = StObject.set(x, "shipping_address_collection", null)
    
    inline def setShipping_cost(value: ShippingCost): Self = StObject.set(x, "shipping_cost", value.asInstanceOf[js.Any])
    
    inline def setShipping_costNull: Self = StObject.set(x, "shipping_cost", null)
    
    inline def setShipping_details(value: ShippingDetails): Self = StObject.set(x, "shipping_details", value.asInstanceOf[js.Any])
    
    inline def setShipping_detailsNull: Self = StObject.set(x, "shipping_details", null)
    
    inline def setShipping_options(value: js.Array[ShippingOption]): Self = StObject.set(x, "shipping_options", value.asInstanceOf[js.Any])
    
    inline def setShipping_optionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shipping_options", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setSubmit_type(value: SubmitType): Self = StObject.set(x, "submit_type", value.asInstanceOf[js.Any])
    
    inline def setSubmit_typeNull: Self = StObject.set(x, "submit_type", null)
    
    inline def setSubscription(value: String | Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSuccess_url(value: String): Self = StObject.set(x, "success_url", value.asInstanceOf[js.Any])
    
    inline def setTax_id_collection(value: TaxIdCollection): Self = StObject.set(x, "tax_id_collection", value.asInstanceOf[js.Any])
    
    inline def setTax_id_collectionUndefined: Self = StObject.set(x, "tax_id_collection", js.undefined)
    
    inline def setTotal_details(value: TotalDetails): Self = StObject.set(x, "total_details", value.asInstanceOf[js.Any])
    
    inline def setTotal_detailsNull: Self = StObject.set(x, "total_details", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
