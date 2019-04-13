package typings
package stripeLib.stripeMod

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
    - stripeLib.stripeLibStrings.card_error
    - stripeLib.stripeLibStrings.invalid_request_error
    - stripeLib.stripeLibStrings.api_error
    - stripeLib.stripeLibStrings.idempotency_error
  */
  trait RawType extends js.Object
  
  @js.native
  class StripeAPIError () extends StripeError {
    @JSName("type")
    val type_StripeAPIError: stripeLib.stripeLibStrings.StripeAPIError = js.native
  }
  
  @js.native
  class StripeAuthenticationError () extends StripeError {
    @JSName("type")
    val type_StripeAuthenticationError: stripeLib.stripeLibStrings.StripeAuthenticationError = js.native
  }
  
  @js.native
  class StripeCardError () extends StripeError {
    @JSName("type")
    val type_StripeCardError: stripeLib.stripeLibStrings.StripeCardError = js.native
  }
  
  @js.native
  class StripeConnectionError () extends StripeError {
    @JSName("type")
    val type_StripeConnectionError: stripeLib.stripeLibStrings.StripeConnectionError = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stripeLib.stripeMod.IStripeError because var conflicts: message. Inlined `type`, code, param */ @js.native
  abstract class StripeError () extends _Error {
    val code: js.UndefOr[java.lang.String] = js.native
    val detail: js.UndefOr[js.Any] = js.native
    val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    /**
      * The parameter the error relates to if the error is parameter-specific. You can use this to display a
      * message near the correct form field, for example.
      */
    var param: js.UndefOr[java.lang.String] = js.native
    val params: js.UndefOr[java.lang.String] = js.native
    val raw: js.Any = js.native
    val rawType: RawType = js.native
    var readonly: scala.Double = js.native
    val requestId: java.lang.String = js.native
    val `type`: java.lang.String = js.native
  }
  
  @js.native
  class StripeIdempotencyError () extends StripeError {
    @JSName("type")
    val type_StripeIdempotencyError: stripeLib.stripeLibStrings.StripeIdempotencyError = js.native
  }
  
  @js.native
  class StripeInvalidRequestError () extends StripeError {
    @JSName("type")
    val type_StripeInvalidRequestError: stripeLib.stripeLibStrings.StripeInvalidRequestError = js.native
  }
  
  @js.native
  class StripePermissionError () extends StripeError {
    @JSName("type")
    val type_StripePermissionError: stripeLib.stripeLibStrings.StripePermissionError = js.native
  }
  
  @js.native
  class StripeRateLimitError () extends StripeError {
    @JSName("type")
    val type_StripeRateLimitError: stripeLib.stripeLibStrings.StripeRateLimitError = js.native
  }
  
  @js.native
  class StripeSignatureVerificationError () extends StripeError {
    @JSName("type")
    val type_StripeSignatureVerificationError: stripeLib.stripeLibStrings.StripeSignatureVerificationError = js.native
  }
  
  @js.native
  class _Error ()
    extends stdLib.Error {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object StripeError extends js.Object {
    def populate(`type`: stripeLib.stripeMod.errorsNs.RawType): stripeLib.stripeMod.errorsNs.StripeError = js.native
  }
  
}

