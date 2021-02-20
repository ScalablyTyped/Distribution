package typings.stripejs

import typings.stripejs.shippingMod.ShippingAddress
import typings.stripejs.shippingMod.ShippingOption
import typings.stripejs.stripejsStrings.cancel
import typings.stripejs.stripejsStrings.shippingaddresschange
import typings.stripejs.stripejsStrings.shippingoptionchange
import typings.stripejs.stripejsStrings.source
import typings.stripejs.stripejsStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentMod {
  
  @js.native
  trait CanMakePaymentResult extends StObject {
    
    /**
      * true if the browser payment API supports Apple Pay.
      * NOTE: using the paymentRequestButton Element is automatically cross-browser.
      * If you use this PaymentRequest object to create a paymentRequestButton Element, you don‘t need to check applePay yourself
      */
    val applePay: Boolean = js.native
  }
  object CanMakePaymentResult {
    
    @scala.inline
    def apply(applePay: Boolean): CanMakePaymentResult = {
      val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanMakePaymentResult]
    }
    
    @scala.inline
    implicit class CanMakePaymentResultMutableBuilder[Self <: CanMakePaymentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplePay(value: Boolean): Self = StObject.set(x, "applePay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewShippingAddress extends StObject {
    
    /**
      * The customer's selected ShippingAddress.
      */
    var shippingAddress: ShippingAddress = js.native
    
    /**
      * Calling this function with an UpdateDetails object merges your updates into the
      * current PaymentRequest object.
      */
    def updateWith(dataToUpdate: UpdateOptions): Unit = js.native
  }
  object NewShippingAddress {
    
    @scala.inline
    def apply(shippingAddress: ShippingAddress, updateWith: UpdateOptions => Unit): NewShippingAddress = {
      val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
      __obj.asInstanceOf[NewShippingAddress]
    }
    
    @scala.inline
    implicit class NewShippingAddressMutableBuilder[Self <: NewShippingAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShippingAddress(value: ShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWith(value: UpdateOptions => Unit): Self = StObject.set(x, "updateWith", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NewShippingOptions extends StObject {
    
    /**
      * The selected shipping option
      */
    var shippingOption: ShippingOption = js.native
    
    /**
      * Calling this function with an UpdateDetails object merges your updates into the
      * current PaymentRequest object.
      */
    def updateWith(dataToUpdate: UpdateOptions): Unit = js.native
  }
  object NewShippingOptions {
    
    @scala.inline
    def apply(shippingOption: ShippingOption, updateWith: UpdateOptions => Unit): NewShippingOptions = {
      val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
      __obj.asInstanceOf[NewShippingOptions]
    }
    
    @scala.inline
    implicit class NewShippingOptionsMutableBuilder[Self <: NewShippingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShippingOption(value: ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWith(value: UpdateOptions => Unit): Self = StObject.set(x, "updateWith", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PaymentItem extends StObject {
    
    /**
      * The amount the user has to pay in the given currency
      * @see StripePaymentOptions.currency
      */
    var amount: Double = js.native
    
    /**
      * A text that should be shown to the user
      */
    var label: String = js.native
    
    /**
      * Whether or not the payment should be executed immediately
      * If you might change this amount later (for example, after you have calculated shipping costs), set this to `true`
      */
    var pending: js.UndefOr[Boolean] = js.native
  }
  object PaymentItem {
    
    @scala.inline
    def apply(amount: Double, label: String): PaymentItem = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentItem]
    }
    
    @scala.inline
    implicit class PaymentItemMutableBuilder[Self <: PaymentItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    }
  }
  
  @js.native
  trait StripePaymentOptions extends UpdateOptions {
    
    /**
      * The two letter code representing your country
      * @example 'US'
      */
    var country: String = js.native
    
    /**
      * Whether or not the form should ask for the payer's email address
      * @default false
      */
    var requestPayerEmail: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the form should ask for the payer's name
      * @default false
      */
    var requestPayerName: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the form should ask for the payer's phone number
      * @default false
      */
    var requestPayerPhone: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not a shipping address should be requested
      * NOTE: Setting this to true requires `shippingOptions` to be set with at least one option!
      * @see shippingOptions
      */
    var requestShipping: js.UndefOr[Boolean] = js.native
  }
  object StripePaymentOptions {
    
    @scala.inline
    def apply(country: String, currency: String, total: PaymentItem): StripePaymentOptions = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentOptions]
    }
    
    @scala.inline
    implicit class StripePaymentOptionsMutableBuilder[Self <: StripePaymentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPayerEmail(value: Boolean): Self = StObject.set(x, "requestPayerEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPayerEmailUndefined: Self = StObject.set(x, "requestPayerEmail", js.undefined)
      
      @scala.inline
      def setRequestPayerName(value: Boolean): Self = StObject.set(x, "requestPayerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPayerNameUndefined: Self = StObject.set(x, "requestPayerName", js.undefined)
      
      @scala.inline
      def setRequestPayerPhone(value: Boolean): Self = StObject.set(x, "requestPayerPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPayerPhoneUndefined: Self = StObject.set(x, "requestPayerPhone", js.undefined)
      
      @scala.inline
      def setRequestShipping(value: Boolean): Self = StObject.set(x, "requestShipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestShippingUndefined: Self = StObject.set(x, "requestShipping", js.undefined)
    }
  }
  
  @js.native
  trait StripePaymentRequest extends StObject {
    
    /**
      * Whether or not a payment can be made
      * NOTE: When no API is available it resolves with `null`
      *
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-can-make-payment
      */
    def canMakePayment(): js.Promise[CanMakePaymentResult | Null] = js.native
    
    /**
      * Register your event listener
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-on
      */
    @JSName("on")
    def on_cancel(event: cancel, handler: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_shippingaddresschange(event: shippingaddresschange, handler: js.Function1[/* event */ NewShippingAddress, Unit]): Unit = js.native
    @JSName("on")
    def on_shippingoptionchange(event: shippingoptionchange, handler: js.Function1[/* event */ NewShippingOptions, Unit]): Unit = js.native
    @JSName("on")
    def on_source(event: source, handler: js.Function1[/* event */ StripePaymentResponse, Unit]): Unit = js.native
    @JSName("on")
    def on_token(event: token, handler: js.Function1[/* event */ StripePaymentResponse, Unit]): Unit = js.native
    
    /**
      * Shows the browser’s payment UI
      * NOTE: When using the paymentRequestButton Element, this is called for you under the hood
      * NOTE: This method must be called as the result of a user interaction (for example, in a click handler)
      *
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-show
      */
    def show(): Unit = js.native
    
    /**
      * Updates the payment information
      * NOTE: can only be called when the browser payment UI is not showing
      *
      * @param options - Payment information that should be used by Stripe
      *
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-update
      */
    def update(options: UpdateOptions): Unit = js.native
  }
  
  @js.native
  trait StripePaymentResponse extends StObject {
    
    /**
      * A function to complete the payment and give feedback to the user
      * Call this when you have processed the token data provided by the API
      *
      * @param status - The status that should be shown to the user
      */
    def complete(status: completeStatus): Unit = js.native
    
    /**
      * The unique name of the payment handler the customer chose to authorize payment
      * @example 'basic-card'
      */
    val methodName: String = js.native
    
    val payerEmail: js.UndefOr[String] = js.native
    
    /**
      * Information about the payer
      * NOTE: This is only set if the corresponding field was set to `true` in the `PaymentOptions`
      *
      * @see PaymentOptions.requestPayerName
      * @see PaymentOptions.requestPayerEmail
      * @see PaymentOptions.requestPayerPhone
      */
    val payerName: js.UndefOr[String] = js.native
    
    val payerPhone: js.UndefOr[String] = js.native
    
    /**
      * The shipping address the payer selected
      */
    val shippingAddress: ShippingAddress = js.native
    
    /**
      * The shipping option the payer selected
      */
    val shippingOption: ShippingOption = js.native
    
    /**
      * NOTE: Only available when the event type 'source' was used
      */
    val source: js.UndefOr[js.Any] = js.native
    
    /**
      * NOTE: Only available when the event type 'token' was used
      */
    val token: js.UndefOr[js.Any] = js.native
  }
  object StripePaymentResponse {
    
    @scala.inline
    def apply(
      complete: completeStatus => Unit,
      methodName: String,
      shippingAddress: ShippingAddress,
      shippingOption: ShippingOption
    ): StripePaymentResponse = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shippingOption = shippingOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentResponse]
    }
    
    @scala.inline
    implicit class StripePaymentResponseMutableBuilder[Self <: StripePaymentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: completeStatus => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayerEmail(value: String): Self = StObject.set(x, "payerEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayerEmailUndefined: Self = StObject.set(x, "payerEmail", js.undefined)
      
      @scala.inline
      def setPayerName(value: String): Self = StObject.set(x, "payerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayerNameUndefined: Self = StObject.set(x, "payerName", js.undefined)
      
      @scala.inline
      def setPayerPhone(value: String): Self = StObject.set(x, "payerPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayerPhoneUndefined: Self = StObject.set(x, "payerPhone", js.undefined)
      
      @scala.inline
      def setShippingAddress(value: ShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingOption(value: ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait UpdateOptions extends StObject {
    
    /**
      * The currency in which the customer should be charged
      * @example 'usd'
      */
    var currency: String = js.native
    
    /**
      * An array of payment item objects
      * NOTE: The sum of the line item amounts does not need to add up to the total amount above
      * @see total
      *
      * @default []
      */
    var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.native
    
    /**
      * An array of possible shipping options
      * NOTE: This first one in the array will be listed as the default option
      *
      * @default []
      */
    var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
    
    /**
      * The total amount the customer has to pay
      * NOTE: This object is shown to the customer in the browser‘s payment UI
      */
    var total: PaymentItem = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(currency: String, total: PaymentItem): UpdateOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
      
      @scala.inline
      def setDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "displayItems", js.Array(value :_*))
      
      @scala.inline
      def setShippingOptions(value: js.Array[ShippingOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
      
      @scala.inline
      def setShippingOptionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shippingOptions", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripejs.stripejsStrings.success
    - typings.stripejs.stripejsStrings.fail
    - typings.stripejs.stripejsStrings.invalid_payer_name
    - typings.stripejs.stripejsStrings.invalid_payer_phone
    - typings.stripejs.stripejsStrings.invalid_payer_email
    - typings.stripejs.stripejsStrings.invalid_shipping_address
  */
  trait completeStatus extends StObject
  object completeStatus {
    
    @scala.inline
    def fail: typings.stripejs.stripejsStrings.fail = "fail".asInstanceOf[typings.stripejs.stripejsStrings.fail]
    
    @scala.inline
    def invalid_payer_email: typings.stripejs.stripejsStrings.invalid_payer_email = "invalid_payer_email".asInstanceOf[typings.stripejs.stripejsStrings.invalid_payer_email]
    
    @scala.inline
    def invalid_payer_name: typings.stripejs.stripejsStrings.invalid_payer_name = "invalid_payer_name".asInstanceOf[typings.stripejs.stripejsStrings.invalid_payer_name]
    
    @scala.inline
    def invalid_payer_phone: typings.stripejs.stripejsStrings.invalid_payer_phone = "invalid_payer_phone".asInstanceOf[typings.stripejs.stripejsStrings.invalid_payer_phone]
    
    @scala.inline
    def invalid_shipping_address: typings.stripejs.stripejsStrings.invalid_shipping_address = "invalid_shipping_address".asInstanceOf[typings.stripejs.stripejsStrings.invalid_shipping_address]
    
    @scala.inline
    def success: typings.stripejs.stripejsStrings.success = "success".asInstanceOf[typings.stripejs.stripejsStrings.success]
  }
}
