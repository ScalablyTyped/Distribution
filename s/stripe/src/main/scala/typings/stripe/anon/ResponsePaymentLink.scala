package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.LineItem
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.PaymentLink.AfterCompletion
import typings.stripe.mod.Stripe.PaymentLink.AutomaticTax
import typings.stripe.mod.Stripe.PaymentLink.BillingAddressCollection
import typings.stripe.mod.Stripe.PaymentLink.ConsentCollection
import typings.stripe.mod.Stripe.PaymentLink.CustomField
import typings.stripe.mod.Stripe.PaymentLink.CustomText
import typings.stripe.mod.Stripe.PaymentLink.CustomerCreation
import typings.stripe.mod.Stripe.PaymentLink.InvoiceCreation
import typings.stripe.mod.Stripe.PaymentLink.PaymentIntentData
import typings.stripe.mod.Stripe.PaymentLink.PaymentMethodCollection
import typings.stripe.mod.Stripe.PaymentLink.PaymentMethodType
import typings.stripe.mod.Stripe.PaymentLink.PhoneNumberCollection
import typings.stripe.mod.Stripe.PaymentLink.ShippingAddressCollection
import typings.stripe.mod.Stripe.PaymentLink.ShippingOption
import typings.stripe.mod.Stripe.PaymentLink.SubmitType
import typings.stripe.mod.Stripe.PaymentLink.SubscriptionData
import typings.stripe.mod.Stripe.PaymentLink.TaxIdCollection
import typings.stripe.mod.Stripe.PaymentLink.TransferData
import typings.stripe.stripeStrings.payment_link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.PaymentLink> */
trait ResponsePaymentLink extends StObject {
  
  /**
    * Whether the payment link's `url` is active. If `false`, customers visiting the URL will be shown a page saying that the link has been deactivated.
    */
  var active: Boolean
  
  var after_completion: AfterCompletion
  
  /**
    * Whether user redeemable promotion codes are enabled.
    */
  var allow_promotion_codes: Boolean
  
  /**
    * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: Double | Null
  
  /**
    * This represents the percentage of the subscription invoice subtotal that will be transferred to the application owner's Stripe account.
    */
  var application_fee_percent: Double | Null
  
  var automatic_tax: AutomaticTax
  
  /**
    * Configuration for collecting the customer's billing address.
    */
  var billing_address_collection: BillingAddressCollection
  
  /**
    * When set, provides configuration to gather active consent from customers.
    */
  var consent_collection: ConsentCollection | Null
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * Collect additional information from your customer using custom fields. Up to 2 fields are supported.
    */
  var custom_fields: js.Array[CustomField]
  
  var custom_text: CustomText
  
  /**
    * Configuration for Customer creation during checkout.
    */
  var customer_creation: CustomerCreation
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * Configuration for creating invoice for payment mode payment links.
    */
  var invoice_creation: InvoiceCreation | Null
  
  var lastResponse: ApiVersion
  
  /**
    * The line items representing what is being sold.
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
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: payment_link
  
  /**
    * The account on behalf of which to charge. See the [Connect documentation](https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts) for details.
    */
  var on_behalf_of: String | Account | Null
  
  /**
    * Indicates the parameters to be passed to PaymentIntent creation during checkout.
    */
  var payment_intent_data: PaymentIntentData | Null
  
  /**
    * Configuration for collecting a payment method during checkout.
    */
  var payment_method_collection: PaymentMethodCollection
  
  /**
    * The list of payment method types that customers can use. When `null`, Stripe will dynamically show relevant payment methods you've enabled in your [payment method settings](https://dashboard.stripe.com/settings/payment_methods).
    */
  var payment_method_types: js.Array[PaymentMethodType] | Null
  
  var phone_number_collection: PhoneNumberCollection
  
  /**
    * Configuration for collecting the customer's shipping address.
    */
  var shipping_address_collection: ShippingAddressCollection | Null
  
  /**
    * The shipping rate options applied to the session.
    */
  var shipping_options: js.Array[ShippingOption]
  
  /**
    * Indicates the type of transaction being performed which customizes relevant text on the page, such as the submit button.
    */
  var submit_type: SubmitType
  
  /**
    * When creating a subscription, the specified configuration data will be used. There must be at least one line item with a recurring price to use `subscription_data`.
    */
  var subscription_data: SubscriptionData | Null
  
  var tax_id_collection: TaxIdCollection
  
  /**
    * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will be transferred to.
    */
  var transfer_data: TransferData | Null
  
  /**
    * The public URL that can be shared with customers.
    */
  var url: String
}
object ResponsePaymentLink {
  
  inline def apply(
    active: Boolean,
    after_completion: AfterCompletion,
    allow_promotion_codes: Boolean,
    automatic_tax: AutomaticTax,
    billing_address_collection: BillingAddressCollection,
    currency: String,
    custom_fields: js.Array[CustomField],
    custom_text: CustomText,
    customer_creation: CustomerCreation,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    payment_method_collection: PaymentMethodCollection,
    phone_number_collection: PhoneNumberCollection,
    shipping_options: js.Array[ShippingOption],
    submit_type: SubmitType,
    tax_id_collection: TaxIdCollection,
    url: String
  ): ResponsePaymentLink = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], after_completion = after_completion.asInstanceOf[js.Any], allow_promotion_codes = allow_promotion_codes.asInstanceOf[js.Any], automatic_tax = automatic_tax.asInstanceOf[js.Any], billing_address_collection = billing_address_collection.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], custom_text = custom_text.asInstanceOf[js.Any], customer_creation = customer_creation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], payment_method_collection = payment_method_collection.asInstanceOf[js.Any], phone_number_collection = phone_number_collection.asInstanceOf[js.Any], shipping_options = shipping_options.asInstanceOf[js.Any], submit_type = submit_type.asInstanceOf[js.Any], tax_id_collection = tax_id_collection.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], application_fee_amount = null, application_fee_percent = null, consent_collection = null, invoice_creation = null, on_behalf_of = null, payment_intent_data = null, payment_method_types = null, shipping_address_collection = null, subscription_data = null, transfer_data = null)
    __obj.updateDynamic("object")("payment_link")
    __obj.asInstanceOf[ResponsePaymentLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePaymentLink] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAfter_completion(value: AfterCompletion): Self = StObject.set(x, "after_completion", value.asInstanceOf[js.Any])
    
    inline def setAllow_promotion_codes(value: Boolean): Self = StObject.set(x, "allow_promotion_codes", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
    
    inline def setApplication_fee_percent(value: Double): Self = StObject.set(x, "application_fee_percent", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_percentNull: Self = StObject.set(x, "application_fee_percent", null)
    
    inline def setAutomatic_tax(value: AutomaticTax): Self = StObject.set(x, "automatic_tax", value.asInstanceOf[js.Any])
    
    inline def setBilling_address_collection(value: BillingAddressCollection): Self = StObject.set(x, "billing_address_collection", value.asInstanceOf[js.Any])
    
    inline def setConsent_collection(value: ConsentCollection): Self = StObject.set(x, "consent_collection", value.asInstanceOf[js.Any])
    
    inline def setConsent_collectionNull: Self = StObject.set(x, "consent_collection", null)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustom_fields(value: js.Array[CustomField]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsVarargs(value: CustomField*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setCustom_text(value: CustomText): Self = StObject.set(x, "custom_text", value.asInstanceOf[js.Any])
    
    inline def setCustomer_creation(value: CustomerCreation): Self = StObject.set(x, "customer_creation", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_creation(value: InvoiceCreation): Self = StObject.set(x, "invoice_creation", value.asInstanceOf[js.Any])
    
    inline def setInvoice_creationNull: Self = StObject.set(x, "invoice_creation", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLine_items(value: ApiList[LineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
    
    inline def setLine_itemsUndefined: Self = StObject.set(x, "line_items", js.undefined)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: payment_link): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_of(value: String | Account): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
    
    inline def setPayment_intent_data(value: PaymentIntentData): Self = StObject.set(x, "payment_intent_data", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent_dataNull: Self = StObject.set(x, "payment_intent_data", null)
    
    inline def setPayment_method_collection(value: PaymentMethodCollection): Self = StObject.set(x, "payment_method_collection", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_types(value: js.Array[PaymentMethodType]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_typesNull: Self = StObject.set(x, "payment_method_types", null)
    
    inline def setPayment_method_typesVarargs(value: PaymentMethodType*): Self = StObject.set(x, "payment_method_types", js.Array(value*))
    
    inline def setPhone_number_collection(value: PhoneNumberCollection): Self = StObject.set(x, "phone_number_collection", value.asInstanceOf[js.Any])
    
    inline def setShipping_address_collection(value: ShippingAddressCollection): Self = StObject.set(x, "shipping_address_collection", value.asInstanceOf[js.Any])
    
    inline def setShipping_address_collectionNull: Self = StObject.set(x, "shipping_address_collection", null)
    
    inline def setShipping_options(value: js.Array[ShippingOption]): Self = StObject.set(x, "shipping_options", value.asInstanceOf[js.Any])
    
    inline def setShipping_optionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shipping_options", js.Array(value*))
    
    inline def setSubmit_type(value: SubmitType): Self = StObject.set(x, "submit_type", value.asInstanceOf[js.Any])
    
    inline def setSubscription_data(value: SubscriptionData): Self = StObject.set(x, "subscription_data", value.asInstanceOf[js.Any])
    
    inline def setSubscription_dataNull: Self = StObject.set(x, "subscription_data", null)
    
    inline def setTax_id_collection(value: TaxIdCollection): Self = StObject.set(x, "tax_id_collection", value.asInstanceOf[js.Any])
    
    inline def setTransfer_data(value: TransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    inline def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
