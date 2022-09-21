package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.Stripe.PaymentIntent
import typings.stripe.mod.Stripe.PaymentMethod
import typings.stripe.mod.Stripe.RawErrorType
import typings.stripe.mod.Stripe.SetupIntent
import typings.stripe.mod.Stripe.Source
import typings.stripe.stripeStrings.api_error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.StripeRawError & {  type :'api_error'} */
trait StripeRawErrortypeapierro extends StObject {
  
  var charge: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var decline_code: js.UndefOr[String] = js.undefined
  
  var detail: js.UndefOr[String] = js.undefined
  
  var doc_code: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var param: js.UndefOr[String] = js.undefined
  
  var payment_intent: js.UndefOr[PaymentIntent] = js.undefined
  
  var payment_method: js.UndefOr[PaymentMethod] = js.undefined
  
  var requestId: js.UndefOr[String] = js.undefined
  
  var setup_intent: js.UndefOr[SetupIntent] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var `type`: RawErrorType & api_error
}
object StripeRawErrortypeapierro {
  
  inline def apply(`type`: RawErrorType & api_error): StripeRawErrortypeapierro = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeRawErrortypeapierro]
  }
  
  extension [Self <: StripeRawErrortypeapierro](x: Self) {
    
    inline def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setChargeUndefined: Self = StObject.set(x, "charge", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDecline_code(value: String): Self = StObject.set(x, "decline_code", value.asInstanceOf[js.Any])
    
    inline def setDecline_codeUndefined: Self = StObject.set(x, "decline_code", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDoc_code(value: String): Self = StObject.set(x, "doc_code", value.asInstanceOf[js.Any])
    
    inline def setDoc_codeUndefined: Self = StObject.set(x, "doc_code", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setPayment_intent(value: PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentUndefined: Self = StObject.set(x, "payment_intent", js.undefined)
    
    inline def setPayment_method(value: PaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSetup_intent(value: SetupIntent): Self = StObject.set(x, "setup_intent", value.asInstanceOf[js.Any])
    
    inline def setSetup_intentUndefined: Self = StObject.set(x, "setup_intent", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setType(value: RawErrorType & api_error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
