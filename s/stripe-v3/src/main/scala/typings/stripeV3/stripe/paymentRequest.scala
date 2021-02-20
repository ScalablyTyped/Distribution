package typings.stripeV3.stripe

import typings.stripeV3.anon.ApplePay
import typings.stripeV3.stripe.paymentMethod.PaymentMethod
import typings.stripeV3.stripeV3Strings.cancel
import typings.stripeV3.stripeV3Strings.fail
import typings.stripeV3.stripeV3Strings.invalid_shipping_address
import typings.stripeV3.stripeV3Strings.paymentmethod
import typings.stripeV3.stripeV3Strings.shippingaddresschange
import typings.stripeV3.stripeV3Strings.shippingoptionchange
import typings.stripeV3.stripeV3Strings.source
import typings.stripeV3.stripeV3Strings.success
import typings.stripeV3.stripeV3Strings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Container for all payment request related types
object paymentRequest {
  
  @js.native
  trait DisplayItem extends StObject {
    
    var amount: Double = js.native
    
    var label: String = js.native
    
    var pending: js.UndefOr[Boolean] = js.native
  }
  object DisplayItem {
    
    @scala.inline
    def apply(amount: Double, label: String): DisplayItem = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayItem]
    }
    
    @scala.inline
    implicit class DisplayItemMutableBuilder[Self <: DisplayItem] (val x: Self) extends AnyVal {
      
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
  trait ShippingAddress extends StObject {
    
    var addressLine: js.Array[String] = js.native
    
    var city: String = js.native
    
    var country: String = js.native
    
    var dependentLocality: js.UndefOr[String] = js.native
    
    var phone: String = js.native
    
    var postalCode: String = js.native
    
    var recipient: String = js.native
    
    var region: String = js.native
    
    var sortingCode: js.UndefOr[String] = js.native
  }
  object ShippingAddress {
    
    @scala.inline
    def apply(
      addressLine: js.Array[String],
      city: String,
      country: String,
      phone: String,
      postalCode: String,
      recipient: String,
      region: String
    ): ShippingAddress = {
      val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShippingAddress]
    }
    
    @scala.inline
    implicit class ShippingAddressMutableBuilder[Self <: ShippingAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressLine(value: js.Array[String]): Self = StObject.set(x, "addressLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressLineVarargs(value: String*): Self = StObject.set(x, "addressLine", js.Array(value :_*))
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependentLocality(value: String): Self = StObject.set(x, "dependentLocality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependentLocalityUndefined: Self = StObject.set(x, "dependentLocality", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingCode(value: String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingCodeUndefined: Self = StObject.set(x, "sortingCode", js.undefined)
    }
  }
  
  @js.native
  trait ShippingOption extends StObject {
    
    var amount: Double = js.native
    
    var detail: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var label: String = js.native
  }
  object ShippingOption {
    
    @scala.inline
    def apply(amount: Double, id: String, label: String): ShippingOption = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShippingOption]
    }
    
    @scala.inline
    implicit class ShippingOptionMutableBuilder[Self <: ShippingOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StripePaymentMethodPaymentResponse extends StripePaymentResponse {
    
    var paymentMethod: PaymentMethod = js.native
  }
  object StripePaymentMethodPaymentResponse {
    
    @scala.inline
    def apply(complete: String => Unit, methodName: String, paymentMethod: PaymentMethod): StripePaymentMethodPaymentResponse = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentMethodPaymentResponse]
    }
    
    @scala.inline
    implicit class StripePaymentMethodPaymentResponseMutableBuilder[Self <: StripePaymentMethodPaymentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaymentMethod(value: PaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StripePaymentRequest extends StObject {
    
    def canMakePayment(): js.Promise[ApplePay | Null] = js.native
    
    @JSName("on")
    def on_cancel(event: cancel, handler: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_paymentmethod(
      event: paymentmethod,
      handler: js.Function1[/* response */ StripePaymentMethodPaymentResponse, Unit]
    ): Unit = js.native
    @JSName("on")
    def on_shippingaddresschange(
      event: shippingaddresschange,
      handler: js.Function1[/* response */ typings.stripeV3.anon.ShippingAddress, Unit]
    ): Unit = js.native
    @JSName("on")
    def on_shippingoptionchange(
      event: shippingoptionchange,
      handler: js.Function1[/* response */ typings.stripeV3.anon.ShippingOption, Unit]
    ): Unit = js.native
    @JSName("on")
    def on_source(event: source, handler: js.Function1[/* response */ StripeSourcePaymentResponse, Unit]): Unit = js.native
    @JSName("on")
    def on_token(event: token, handler: js.Function1[/* response */ StripeTokenPaymentResponse, Unit]): Unit = js.native
    
    def show(): Unit = js.native
    
    def update(options: StripePaymentRequestUpdateOptions): Unit = js.native
  }
  
  @js.native
  trait StripePaymentRequestOptions extends StripePaymentRequestUpdateOptions {
    
    var country: String = js.native
    
    var requestPayerEmail: js.UndefOr[Boolean] = js.native
    
    var requestPayerName: js.UndefOr[Boolean] = js.native
    
    var requestPayerPhone: js.UndefOr[Boolean] = js.native
    
    var requestShipping: js.UndefOr[Boolean] = js.native
  }
  object StripePaymentRequestOptions {
    
    @scala.inline
    def apply(country: String, currency: String, total: DisplayItem): StripePaymentRequestOptions = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentRequestOptions]
    }
    
    @scala.inline
    implicit class StripePaymentRequestOptionsMutableBuilder[Self <: StripePaymentRequestOptions] (val x: Self) extends AnyVal {
      
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
  trait StripePaymentRequestUpdateOptions extends StObject {
    
    var currency: String = js.native
    
    var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.native
    
    var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
    
    var total: DisplayItem = js.native
  }
  object StripePaymentRequestUpdateOptions {
    
    @scala.inline
    def apply(currency: String, total: DisplayItem): StripePaymentRequestUpdateOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentRequestUpdateOptions]
    }
    
    @scala.inline
    implicit class StripePaymentRequestUpdateOptionsMutableBuilder[Self <: StripePaymentRequestUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayItems(value: js.Array[DisplayItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
      
      @scala.inline
      def setDisplayItemsVarargs(value: DisplayItem*): Self = StObject.set(x, "displayItems", js.Array(value :_*))
      
      @scala.inline
      def setShippingOptions(value: js.Array[ShippingOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
      
      @scala.inline
      def setShippingOptionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shippingOptions", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: DisplayItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StripePaymentResponse extends StObject {
    
    def complete(status: String): Unit = js.native
    
    var methodName: String = js.native
    
    var payerEmail: js.UndefOr[String] = js.native
    
    var payerName: js.UndefOr[String] = js.native
    
    var payerPhone: js.UndefOr[String] = js.native
    
    var shippingAddress: js.UndefOr[ShippingAddress] = js.native
    
    var shippingOption: js.UndefOr[ShippingOption] = js.native
  }
  object StripePaymentResponse {
    
    @scala.inline
    def apply(complete: String => Unit, methodName: String): StripePaymentResponse = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentResponse]
    }
    
    @scala.inline
    implicit class StripePaymentResponseMutableBuilder[Self <: StripePaymentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: String => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
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
      def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
      
      @scala.inline
      def setShippingOption(value: ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingOptionUndefined: Self = StObject.set(x, "shippingOption", js.undefined)
    }
  }
  
  @js.native
  trait StripeSourcePaymentResponse extends StripePaymentResponse {
    
    var source: Source = js.native
  }
  object StripeSourcePaymentResponse {
    
    @scala.inline
    def apply(complete: String => Unit, methodName: String, source: Source): StripeSourcePaymentResponse = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripeSourcePaymentResponse]
    }
    
    @scala.inline
    implicit class StripeSourcePaymentResponseMutableBuilder[Self <: StripeSourcePaymentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StripeTokenPaymentResponse extends StripePaymentResponse {
    
    var token: Token = js.native
  }
  object StripeTokenPaymentResponse {
    
    @scala.inline
    def apply(complete: String => Unit, methodName: String, token: Token): StripeTokenPaymentResponse = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripeTokenPaymentResponse]
    }
    
    @scala.inline
    implicit class StripeTokenPaymentResponseMutableBuilder[Self <: StripeTokenPaymentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateDetails extends StObject {
    
    var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.native
    
    var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
    
    var status: success | fail | invalid_shipping_address = js.native
    
    var total: js.UndefOr[DisplayItem] = js.native
  }
  object UpdateDetails {
    
    @scala.inline
    def apply(status: success | fail | invalid_shipping_address): UpdateDetails = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateDetails]
    }
    
    @scala.inline
    implicit class UpdateDetailsMutableBuilder[Self <: UpdateDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayItems(value: js.Array[DisplayItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
      
      @scala.inline
      def setDisplayItemsVarargs(value: DisplayItem*): Self = StObject.set(x, "displayItems", js.Array(value :_*))
      
      @scala.inline
      def setShippingOptions(value: js.Array[ShippingOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
      
      @scala.inline
      def setShippingOptionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shippingOptions", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: success | fail | invalid_shipping_address): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: DisplayItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
