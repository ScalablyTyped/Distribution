package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSetupIntentCreatePa extends StObject {
  
  val MandateData: TypeofMandateData
  
  val PaymentMethodData: TypeofPaymentMethodData
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionSepaDebit
}
object TypeofSetupIntentCreatePa {
  
  inline def apply(
    MandateData: TypeofMandateData,
    PaymentMethodData: TypeofPaymentMethodData,
    PaymentMethodOptions: TypeofPaymentMethodOptionSepaDebit
  ): TypeofSetupIntentCreatePa = {
    val __obj = js.Dynamic.literal(MandateData = MandateData.asInstanceOf[js.Any], PaymentMethodData = PaymentMethodData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSetupIntentCreatePa]
  }
  
  extension [Self <: TypeofSetupIntentCreatePa](x: Self) {
    
    inline def setMandateData(value: TypeofMandateData): Self = StObject.set(x, "MandateData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodData(value: TypeofPaymentMethodData): Self = StObject.set(x, "PaymentMethodData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionSepaDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
