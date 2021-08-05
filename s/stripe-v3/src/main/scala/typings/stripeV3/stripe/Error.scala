package typings.stripeV3.stripe

import typings.stripeV3.stripe.paymentIntents.PaymentIntent
import typings.stripeV3.stripe.paymentMethod.PaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  /**
    * For card errors, the ID of the failed charge.
    */
  var charge: String
  
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for
    * the decline if they provide one.
    */
  var decline_code: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to more information about the error code reported.
    */
  var doc_url: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable message providing more details about the
    * error. For card errors, these messages can be shown to
    * your users.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * If the error is parameter-specific, the parameter related
    * to the error. For example, you can use this to display a
    * message near the correct form field.
    */
  var param: js.UndefOr[String] = js.undefined
  
  /**
    * The PaymentIntent object for errors returned on a request
    * involving a PaymentIntent.
    */
  var payment_intent: js.UndefOr[PaymentIntent] = js.undefined
  
  /**
    * The PaymentMethod object for errors returned on a
    * request involving a PaymentMethod.
    */
  var payment_method: js.UndefOr[PaymentMethod] = js.undefined
  
  /**
    * The source object for errors returned on a request involving
    * a source.
    */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * The type of error returned.
    */
  var `type`: ErrorType
}
object Error {
  
  inline def apply(charge: String, `type`: ErrorType): Error = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDecline_code(value: String): Self = StObject.set(x, "decline_code", value.asInstanceOf[js.Any])
    
    inline def setDecline_codeUndefined: Self = StObject.set(x, "decline_code", js.undefined)
    
    inline def setDoc_url(value: String): Self = StObject.set(x, "doc_url", value.asInstanceOf[js.Any])
    
    inline def setDoc_urlUndefined: Self = StObject.set(x, "doc_url", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setPayment_intent(value: PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentUndefined: Self = StObject.set(x, "payment_intent", js.undefined)
    
    inline def setPayment_method(value: PaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: ErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
