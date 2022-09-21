package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentIntentUpdate extends StObject {
  
  val PaymentMethodData: TypeofPaymentMethodData
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionBacsDebit
}
object TypeofPaymentIntentUpdate {
  
  inline def apply(
    PaymentMethodData: TypeofPaymentMethodData,
    PaymentMethodOptions: TypeofPaymentMethodOptionBacsDebit
  ): TypeofPaymentIntentUpdate = {
    val __obj = js.Dynamic.literal(PaymentMethodData = PaymentMethodData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentIntentUpdate]
  }
  
  extension [Self <: TypeofPaymentIntentUpdate](x: Self) {
    
    inline def setPaymentMethodData(value: TypeofPaymentMethodData): Self = StObject.set(x, "PaymentMethodData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionBacsDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
