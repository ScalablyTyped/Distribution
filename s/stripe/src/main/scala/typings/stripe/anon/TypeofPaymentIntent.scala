package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentIntent extends StObject {
  
  val AmountDetails: Any
  
  val LastPaymentError: Any
  
  val NextAction: TypeofNextAction
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionAuBecsDebit
  
  val Processing: TypeofProcessing
}
object TypeofPaymentIntent {
  
  inline def apply(
    AmountDetails: Any,
    LastPaymentError: Any,
    NextAction: TypeofNextAction,
    PaymentMethodOptions: TypeofPaymentMethodOptionAuBecsDebit,
    Processing: TypeofProcessing
  ): TypeofPaymentIntent = {
    val __obj = js.Dynamic.literal(AmountDetails = AmountDetails.asInstanceOf[js.Any], LastPaymentError = LastPaymentError.asInstanceOf[js.Any], NextAction = NextAction.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any], Processing = Processing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentIntent]
  }
  
  extension [Self <: TypeofPaymentIntent](x: Self) {
    
    inline def setAmountDetails(value: Any): Self = StObject.set(x, "AmountDetails", value.asInstanceOf[js.Any])
    
    inline def setLastPaymentError(value: Any): Self = StObject.set(x, "LastPaymentError", value.asInstanceOf[js.Any])
    
    inline def setNextAction(value: TypeofNextAction): Self = StObject.set(x, "NextAction", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionAuBecsDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
    
    inline def setProcessing(value: TypeofProcessing): Self = StObject.set(x, "Processing", value.asInstanceOf[js.Any])
  }
}
