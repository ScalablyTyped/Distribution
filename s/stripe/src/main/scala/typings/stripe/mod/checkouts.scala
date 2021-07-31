package typings.stripe.mod

import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.paymentIntents.IPaymentIntent
import typings.stripe.mod.paymentIntents.IPaymentIntentData
import typings.stripe.mod.paymentIntents.IPaymentIntentSessionSubset
import typings.stripe.mod.setupIntents.ISetupIntentSessionSubset
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.mod.subscriptions.ISubscriptionCustCreationOptions
import typings.stripe.stripeStrings.auto
import typings.stripe.stripeStrings.book
import typings.stripe.stripeStrings.da
import typings.stripe.stripeStrings.de
import typings.stripe.stripeStrings.donate
import typings.stripe.stripeStrings.en
import typings.stripe.stripeStrings.es
import typings.stripe.stripeStrings.fi
import typings.stripe.stripeStrings.fr
import typings.stripe.stripeStrings.it
import typings.stripe.stripeStrings.ja
import typings.stripe.stripeStrings.nb
import typings.stripe.stripeStrings.nl
import typings.stripe.stripeStrings.pay
import typings.stripe.stripeStrings.payment
import typings.stripe.stripeStrings.pl
import typings.stripe.stripeStrings.pt
import typings.stripe.stripeStrings.required
import typings.stripe.stripeStrings.setup
import typings.stripe.stripeStrings.subscription
import typings.stripe.stripeStrings.sv
import typings.stripe.stripeStrings.zh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkouts {
  
  object sessions {
    
    trait ICheckOutCreationSubscriptionData extends StObject {
      
      /**
        * A non-negative decimal between 0 and 100, with at most two decimal places.
        * This represents the percentage of the subscription invoice subtotal that will be transferred to the application owner’s Stripe account.
        */
      var application_fee_percent: js.UndefOr[Double] = js.undefined
      
      /**
        * A list of items, each with an attached plan, that the customer is subscribing to. Use this parameter for subscriptions. To create one-time payments, use line_items.
        */
      var items: js.Array[ICheckOutCreationSubscriptionDataItem]
      
      /**
        * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
        */
      var metadata: js.UndefOr[IMetadata] = js.undefined
      
      /**
        * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. Has to be at least 48 hours in the future.
        */
      var trial_end: js.UndefOr[Double] = js.undefined
      
      /**
        * Integer representing the number of trial period days before the customer is charged for the first time. Has to be at least 1.
        */
      var trial_period_days: js.UndefOr[Double] = js.undefined
    }
    object ICheckOutCreationSubscriptionData {
      
      @scala.inline
      def apply(items: js.Array[ICheckOutCreationSubscriptionDataItem]): ICheckOutCreationSubscriptionData = {
        val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICheckOutCreationSubscriptionData]
      }
      
      @scala.inline
      implicit class ICheckOutCreationSubscriptionDataMutableBuilder[Self <: ICheckOutCreationSubscriptionData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApplication_fee_percent(value: Double): Self = StObject.set(x, "application_fee_percent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApplication_fee_percentUndefined: Self = StObject.set(x, "application_fee_percent", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[ICheckOutCreationSubscriptionDataItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsVarargs(value: ICheckOutCreationSubscriptionDataItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setTrial_end(value: Double): Self = StObject.set(x, "trial_end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrial_endUndefined: Self = StObject.set(x, "trial_end", js.undefined)
        
        @scala.inline
        def setTrial_period_days(value: Double): Self = StObject.set(x, "trial_period_days", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrial_period_daysUndefined: Self = StObject.set(x, "trial_period_days", js.undefined)
      }
    }
    
    trait ICheckOutCreationSubscriptionDataItem extends StObject {
      
      /**
        * Plan ID for this item.
        */
      var plan: String
      
      /**
        * Quantity for this item.
        */
      var quantity: js.UndefOr[Double] = js.undefined
    }
    object ICheckOutCreationSubscriptionDataItem {
      
      @scala.inline
      def apply(plan: String): ICheckOutCreationSubscriptionDataItem = {
        val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICheckOutCreationSubscriptionDataItem]
      }
      
      @scala.inline
      implicit class ICheckOutCreationSubscriptionDataItemMutableBuilder[Self <: ICheckOutCreationSubscriptionDataItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      }
    }
    
    trait ICheckoutCreationOptions extends StObject {
      
      /**
        * Whether to collect shipping info.
        * If 'required', info will always be collected.
        * When 'auto' or not specified, info will be collected when required
        */
      var billing_address_collection: js.UndefOr[required | auto] = js.undefined
      
      /**
        * The URL to return the customer to if they cancel payment
        */
      var cancel_url: String
      
      /**
        * An optional unique ID to associate with the checkout
        */
      var client_reference_id: js.UndefOr[String] = js.undefined
      
      /**
        * Must be used with @param line_items
        * ID of existing customer to use
        */
      var customer: js.UndefOr[String] = js.undefined
      
      /**
        * Email of the customer
        */
      var customer_email: js.UndefOr[String] = js.undefined
      
      /**
        * A list of items the customer is purchasing. One-time.
        */
      var line_items: js.UndefOr[js.Array[ICheckoutLineItems]] = js.undefined
      
      /**
        * Language to use. If 'auto' or not specified, browser default is used
        */
      var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh] = js.undefined
      
      /**
        * The mode of the Checkout Session, one of payment, setup, or subscription.
        */
      var mode: js.UndefOr[payment | setup | subscription] = js.undefined
      
      /**
        * Details for creation of payment intent
        */
      var payment_intent_data: js.UndefOr[IPaymentIntentSessionSubset | IPaymentIntentData] = js.undefined
      
      /**
        * A list of accepted payment types.
        * 'card' is currently the only supported options
        */
      var payment_method_types: js.Array[String]
      
      /**
        * A subset of parameters to be passed to SetupIntent creation.
        */
      var setup_intent_data: js.UndefOr[ISetupIntentSessionSubset] = js.undefined
      
      /**
        * Describes the type of transaction being performed by Checkout in order to customize relevant text on the page, such as the submit button.
        * submit_type can only be specified on Checkout Sessions using line items or a SKU, but not Checkout Sessions for subscriptions.
        * Supported values are auto, book, donate, or pay.
        */
      var submit_type: js.UndefOr[auto | book | donate | pay] = js.undefined
      
      /**
        * Use instead of @param line_items when using a subscription
        */
      var subscription_data: js.UndefOr[ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions] = js.undefined
      
      /**
        * The url to return to upon successful payment
        */
      var success_url: String
    }
    object ICheckoutCreationOptions {
      
      @scala.inline
      def apply(cancel_url: String, payment_method_types: js.Array[String], success_url: String): ICheckoutCreationOptions = {
        val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICheckoutCreationOptions]
      }
      
      @scala.inline
      implicit class ICheckoutCreationOptionsMutableBuilder[Self <: ICheckoutCreationOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBilling_address_collection(value: required | auto): Self = StObject.set(x, "billing_address_collection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBilling_address_collectionUndefined: Self = StObject.set(x, "billing_address_collection", js.undefined)
        
        @scala.inline
        def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClient_reference_id(value: String): Self = StObject.set(x, "client_reference_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClient_reference_idUndefined: Self = StObject.set(x, "client_reference_id", js.undefined)
        
        @scala.inline
        def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
        
        @scala.inline
        def setCustomer_email(value: String): Self = StObject.set(x, "customer_email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomer_emailUndefined: Self = StObject.set(x, "customer_email", js.undefined)
        
        @scala.inline
        def setLine_items(value: js.Array[ICheckoutLineItems]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine_itemsUndefined: Self = StObject.set(x, "line_items", js.undefined)
        
        @scala.inline
        def setLine_itemsVarargs(value: ICheckoutLineItems*): Self = StObject.set(x, "line_items", js.Array(value :_*))
        
        @scala.inline
        def setLocale(value: auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setMode(value: payment | setup | subscription): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setPayment_intent_data(value: IPaymentIntentSessionSubset | IPaymentIntentData): Self = StObject.set(x, "payment_intent_data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayment_intent_dataUndefined: Self = StObject.set(x, "payment_intent_data", js.undefined)
        
        @scala.inline
        def setPayment_method_types(value: js.Array[String]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayment_method_typesVarargs(value: String*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
        
        @scala.inline
        def setSetup_intent_data(value: ISetupIntentSessionSubset): Self = StObject.set(x, "setup_intent_data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetup_intent_dataUndefined: Self = StObject.set(x, "setup_intent_data", js.undefined)
        
        @scala.inline
        def setSubmit_type(value: auto | book | donate | pay): Self = StObject.set(x, "submit_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubmit_typeUndefined: Self = StObject.set(x, "submit_type", js.undefined)
        
        @scala.inline
        def setSubscription_data(value: ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions): Self = StObject.set(x, "subscription_data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscription_dataUndefined: Self = StObject.set(x, "subscription_data", js.undefined)
        
        @scala.inline
        def setSuccess_url(value: String): Self = StObject.set(x, "success_url", value.asInstanceOf[js.Any])
      }
    }
    
    trait ICheckoutLineItems extends StObject {
      
      /**
        * Amount to be collected per unit of item
        */
      var amount: Double
      
      /**
        * Currency to collect payment in
        */
      var currency: String
      
      /**
        * An optional description for the item
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * A list of images for the item
        */
      var images: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The name of the item
        */
      var name: String
      
      /**
        * The amount of item being purchased
        */
      var quantity: Double
    }
    object ICheckoutLineItems {
      
      @scala.inline
      def apply(amount: Double, currency: String, name: String, quantity: Double): ICheckoutLineItems = {
        val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICheckoutLineItems]
      }
      
      @scala.inline
      implicit class ICheckoutLineItemsMutableBuilder[Self <: ICheckoutLineItems] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
        
        @scala.inline
        def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      }
    }
    
    trait ICheckoutSession extends StObject {
      
      /**
        * Whether or not billing address was collected
        */
      var billing_address_collection: js.UndefOr[String] = js.undefined
      
      /**
        * URL the customer will be redirected to upon cancellation
        */
      var cancel_url: String
      
      /**
        * Unique reference to session
        */
      var client_reference_id: js.UndefOr[String] = js.undefined
      
      /**
        * ID of customer [Expandable]
        */
      var customer: js.UndefOr[String | ICustomer] = js.undefined
      
      /**
        * Email address of customer
        */
      var customer_email: js.UndefOr[String] = js.undefined
      
      /**
        * The line items purchased
        */
      var display_items: js.Array[ICheckoutLineItems]
      
      /**
        * Unique ID for checkout session to pass to `redirectToCheckout` in Stripe.js
        */
      var id: String
      
      /**
        * If the object is in live mode or not
        */
      var livemode: Boolean
      
      /**
        * Language tag of the checkout session
        */
      var locale: js.UndefOr[String] = js.undefined
      
      /**
        * The mode of the Checkout Session, one of payment, setup, or subscription.
        */
      var mode: js.UndefOr[payment | setup | subscription] = js.undefined
      
      /**
        * String of object type. Is always 'checkout.session'
        */
      var `object`: String
      
      /**
        * ID of payment intent created [Expandable]
        */
      var payment_intent: js.UndefOr[String | IPaymentIntent] = js.undefined
      
      /**
        * Array of accepted payment methods
        */
      var payment_method_types: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The ID of the SetupIntent for Checkout Sessions in setup mode.
        */
      var setup_intent: js.UndefOr[String | Null] = js.undefined
      
      /**
        * ID of subscription if one was created [Expandable]
        */
      var subscription: js.UndefOr[String | ISubscription] = js.undefined
      
      /**
        * URL to redirect to upon success
        */
      var success_url: String
    }
    object ICheckoutSession {
      
      @scala.inline
      def apply(
        cancel_url: String,
        display_items: js.Array[ICheckoutLineItems],
        id: String,
        livemode: Boolean,
        `object`: String,
        success_url: String
      ): ICheckoutSession = {
        val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], display_items = display_items.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICheckoutSession]
      }
      
      @scala.inline
      implicit class ICheckoutSessionMutableBuilder[Self <: ICheckoutSession] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBilling_address_collection(value: String): Self = StObject.set(x, "billing_address_collection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBilling_address_collectionUndefined: Self = StObject.set(x, "billing_address_collection", js.undefined)
        
        @scala.inline
        def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClient_reference_id(value: String): Self = StObject.set(x, "client_reference_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClient_reference_idUndefined: Self = StObject.set(x, "client_reference_id", js.undefined)
        
        @scala.inline
        def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
        
        @scala.inline
        def setCustomer_email(value: String): Self = StObject.set(x, "customer_email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomer_emailUndefined: Self = StObject.set(x, "customer_email", js.undefined)
        
        @scala.inline
        def setDisplay_items(value: js.Array[ICheckoutLineItems]): Self = StObject.set(x, "display_items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplay_itemsVarargs(value: ICheckoutLineItems*): Self = StObject.set(x, "display_items", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setMode(value: payment | setup | subscription): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayment_intent(value: String | IPaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayment_intentUndefined: Self = StObject.set(x, "payment_intent", js.undefined)
        
        @scala.inline
        def setPayment_method_types(value: js.Array[String]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayment_method_typesUndefined: Self = StObject.set(x, "payment_method_types", js.undefined)
        
        @scala.inline
        def setPayment_method_typesVarargs(value: String*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
        
        @scala.inline
        def setSetup_intent(value: String): Self = StObject.set(x, "setup_intent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetup_intentNull: Self = StObject.set(x, "setup_intent", null)
        
        @scala.inline
        def setSetup_intentUndefined: Self = StObject.set(x, "setup_intent", js.undefined)
        
        @scala.inline
        def setSubscription(value: String | ISubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
        
        @scala.inline
        def setSuccess_url(value: String): Self = StObject.set(x, "success_url", value.asInstanceOf[js.Any])
      }
    }
  }
}
