package typings.stripeV3.stripe

import typings.stripeV3.stripe.paymentIntents.PaymentIntent
import typings.stripeV3.stripe.paymentMethod.PaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  /**
    * For card errors, the ID of the failed charge.
    */
  var charge: String = js.native
  
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for
    * the decline if they provide one.
    */
  var decline_code: js.UndefOr[String] = js.native
  
  /**
    * A URL to more information about the error code reported.
    */
  var doc_url: js.UndefOr[String] = js.native
  
  /**
    * A human-readable message providing more details about the
    * error. For card errors, these messages can be shown to
    * your users.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * If the error is parameter-specific, the parameter related
    * to the error. For example, you can use this to display a
    * message near the correct form field.
    */
  var param: js.UndefOr[String] = js.native
  
  /**
    * The PaymentIntent object for errors returned on a request
    * involving a PaymentIntent.
    */
  var payment_intent: js.UndefOr[PaymentIntent] = js.native
  
  /**
    * The PaymentMethod object for errors returned on a
    * request involving a PaymentMethod.
    */
  var payment_method: js.UndefOr[PaymentMethod] = js.native
  
  /**
    * The source object for errors returned on a request involving
    * a source.
    */
  var source: js.UndefOr[Source] = js.native
  
  /**
    * The type of error returned.
    */
  var `type`: ErrorType = js.native
}
object Error {
  
  @scala.inline
  def apply(charge: String, `type`: ErrorType): Error = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDecline_code(value: String): Self = StObject.set(x, "decline_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecline_codeUndefined: Self = StObject.set(x, "decline_code", js.undefined)
    
    @scala.inline
    def setDoc_url(value: String): Self = StObject.set(x, "doc_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_urlUndefined: Self = StObject.set(x, "doc_url", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setPayment_intent(value: PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_intentUndefined: Self = StObject.set(x, "payment_intent", js.undefined)
    
    @scala.inline
    def setPayment_method(value: PaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: ErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
