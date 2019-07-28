package typings.stripe.stripeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.stripe.stripeMod.errorsNs.RawType
import typings.stripe.stripeMod.errorsNs.StripeError
import typings.stripe.stripeMod.errorsNs._Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains all stripe error classes
  */
@JSImport("stripe", "errors")
@js.native
object errorsNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.card_error
    - typings.stripe.stripeStrings.invalid_request_error
    - typings.stripe.stripeStrings.api_error
    - typings.stripe.stripeStrings.idempotency_error
  */
  trait RawType extends js.Object
  
  @js.native
  class StripeAPIError () extends StripeError {
    @JSName("type")
    val type_StripeAPIError: typings.stripe.stripeStrings.StripeAPIError = js.native
  }
  
  @js.native
  class StripeAuthenticationError () extends StripeError {
    @JSName("type")
    val type_StripeAuthenticationError: typings.stripe.stripeStrings.StripeAuthenticationError = js.native
  }
  
  @js.native
  class StripeCardError () extends StripeError {
    @JSName("type")
    val type_StripeCardError: typings.stripe.stripeStrings.StripeCardError = js.native
  }
  
  @js.native
  class StripeConnectionError () extends StripeError {
    @JSName("type")
    val type_StripeConnectionError: typings.stripe.stripeStrings.StripeConnectionError = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stripe.stripeMod.IStripeError because var conflicts: message. Inlined `type`, code, param */ @js.native
  abstract class StripeError () extends _Error {
    val code: js.UndefOr[String] = js.native
    val detail: js.UndefOr[js.Any] = js.native
    val headers: StringDictionary[String] = js.native
    /**
      * The parameter the error relates to if the error is parameter-specific. You can use this to display a
      * message near the correct form field, for example.
      */
    var param: js.UndefOr[String] = js.native
    val params: js.UndefOr[String] = js.native
    val raw: js.Any = js.native
    val rawType: RawType = js.native
    var readonly: Double = js.native
    val requestId: String = js.native
    val `type`: String = js.native
  }
  
  @js.native
  class StripeIdempotencyError () extends StripeError {
    @JSName("type")
    val type_StripeIdempotencyError: typings.stripe.stripeStrings.StripeIdempotencyError = js.native
  }
  
  @js.native
  class StripeInvalidRequestError () extends StripeError {
    @JSName("type")
    val type_StripeInvalidRequestError: typings.stripe.stripeStrings.StripeInvalidRequestError = js.native
  }
  
  @js.native
  class StripePermissionError () extends StripeError {
    @JSName("type")
    val type_StripePermissionError: typings.stripe.stripeStrings.StripePermissionError = js.native
  }
  
  @js.native
  class StripeRateLimitError () extends StripeError {
    @JSName("type")
    val type_StripeRateLimitError: typings.stripe.stripeStrings.StripeRateLimitError = js.native
  }
  
  @js.native
  class StripeSignatureVerificationError () extends StripeError {
    @JSName("type")
    val type_StripeSignatureVerificationError: typings.stripe.stripeStrings.StripeSignatureVerificationError = js.native
  }
  
  @js.native
  class _Error () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /* static members */
  @js.native
  object StripeError extends js.Object {
    def populate(`type`: RawType): StripeError = js.native
  }
  
}

