package typings.stripe.mod

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.paymentIntents.IPaymentIntent
import typings.stripe.mod.paymentMethods.IPaymentMethod
import typings.stripe.mod.setupIntents.ISetupIntent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains all stripe error classes
  */
object errors {
  
  @JSImport("stripe", "errors._Error")
  @js.native
  class Error ()
    extends StObject
       with typings.std.Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("stripe", "errors.StripeAPIError")
  @js.native
  class StripeAPIError () extends StripeError {
    
    @JSName("type")
    val type_StripeAPIError: typings.stripe.stripeStrings.StripeAPIError = js.native
  }
  
  @JSImport("stripe", "errors.StripeAuthenticationError")
  @js.native
  class StripeAuthenticationError () extends StripeError {
    
    @JSName("type")
    val type_StripeAuthenticationError: typings.stripe.stripeStrings.StripeAuthenticationError = js.native
  }
  
  @JSImport("stripe", "errors.StripeCardError")
  @js.native
  class StripeCardError () extends StripeError {
    
    @JSName("type")
    val type_StripeCardError: typings.stripe.stripeStrings.StripeCardError = js.native
  }
  
  @JSImport("stripe", "errors.StripeConnectionError")
  @js.native
  class StripeConnectionError () extends StripeError {
    
    @JSName("type")
    val type_StripeConnectionError: typings.stripe.stripeStrings.StripeConnectionError = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.stripe.mod.IStripeError because var conflicts: message. Inlined `type`, code, param */ @JSImport("stripe", "errors.StripeError")
  @js.native
  abstract class StripeError () extends Error {
    
    val charge: js.UndefOr[String] = js.native
    
    val code: js.UndefOr[String] = js.native
    
    val decline_code: js.UndefOr[String] = js.native
    
    val detail: js.UndefOr[js.Any] = js.native
    
    val headers: StringDictionary[String] = js.native
    
    /**
      * The parameter the error relates to if the error is parameter-specific. You can use this to display a
      * message near the correct form field, for example.
      */
    var param: js.UndefOr[String] = js.native
    
    val params: js.UndefOr[String] = js.native
    
    val payment_intent: js.UndefOr[IPaymentIntent] = js.native
    
    val payment_method: js.UndefOr[IPaymentMethod] = js.native
    
    val raw: js.Any = js.native
    
    val rawType: RawType = js.native
    
    val requestId: String = js.native
    
    val setup_intent: js.UndefOr[ISetupIntent] = js.native
    
    val source: js.UndefOr[typings.stripe.mod.sources.ISource] = js.native
    
    val statusCode: js.UndefOr[Double] = js.native
    
    val `type`: String = js.native
  }
  object StripeError {
    
    @JSImport("stripe", "errors.StripeError")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def populate(`type`: RawType): StripeError = ^.asInstanceOf[js.Dynamic].applyDynamic("populate")(`type`.asInstanceOf[js.Any]).asInstanceOf[StripeError]
  }
  
  @JSImport("stripe", "errors.StripeIdempotencyError")
  @js.native
  class StripeIdempotencyError () extends StripeError {
    
    @JSName("type")
    val type_StripeIdempotencyError: typings.stripe.stripeStrings.StripeIdempotencyError = js.native
  }
  
  @JSImport("stripe", "errors.StripeInvalidRequestError")
  @js.native
  class StripeInvalidRequestError () extends StripeError {
    
    @JSName("type")
    val type_StripeInvalidRequestError: typings.stripe.stripeStrings.StripeInvalidRequestError = js.native
  }
  
  @JSImport("stripe", "errors.StripePermissionError")
  @js.native
  class StripePermissionError () extends StripeError {
    
    @JSName("type")
    val type_StripePermissionError: typings.stripe.stripeStrings.StripePermissionError = js.native
  }
  
  @JSImport("stripe", "errors.StripeRateLimitError")
  @js.native
  class StripeRateLimitError () extends StripeError {
    
    @JSName("type")
    val type_StripeRateLimitError: typings.stripe.stripeStrings.StripeRateLimitError = js.native
  }
  
  @JSImport("stripe", "errors.StripeSignatureVerificationError")
  @js.native
  class StripeSignatureVerificationError () extends StripeError {
    
    @JSName("type")
    val type_StripeSignatureVerificationError: typings.stripe.stripeStrings.StripeSignatureVerificationError = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.card_error
    - typings.stripe.stripeStrings.invalid_request_error
    - typings.stripe.stripeStrings.api_error
    - typings.stripe.stripeStrings.idempotency_error
  */
  trait RawType extends StObject
  object RawType {
    
    @scala.inline
    def api_error: typings.stripe.stripeStrings.api_error = "api_error".asInstanceOf[typings.stripe.stripeStrings.api_error]
    
    @scala.inline
    def card_error: typings.stripe.stripeStrings.card_error = "card_error".asInstanceOf[typings.stripe.stripeStrings.card_error]
    
    @scala.inline
    def idempotency_error: typings.stripe.stripeStrings.idempotency_error = "idempotency_error".asInstanceOf[typings.stripe.stripeStrings.idempotency_error]
    
    @scala.inline
    def invalid_request_error: typings.stripe.stripeStrings.invalid_request_error = "invalid_request_error".asInstanceOf[typings.stripe.stripeStrings.invalid_request_error]
  }
}
