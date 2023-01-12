package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentIntentCreate extends StObject {
  
  val MandateData: TypeofMandateData
  
  val PaymentMethodData: TypeofPaymentMethodData
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionBacsDebit
}
object TypeofPaymentIntentCreate {
  
  inline def apply(
    MandateData: TypeofMandateData,
    PaymentMethodData: TypeofPaymentMethodData,
    PaymentMethodOptions: TypeofPaymentMethodOptionBacsDebit
  ): TypeofPaymentIntentCreate = {
    val __obj = js.Dynamic.literal(MandateData = MandateData.asInstanceOf[js.Any], PaymentMethodData = PaymentMethodData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentIntentCreate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentIntentCreate] (val x: Self) extends AnyVal {
    
    inline def setMandateData(value: TypeofMandateData): Self = StObject.set(x, "MandateData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodData(value: TypeofPaymentMethodData): Self = StObject.set(x, "PaymentMethodData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionBacsDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
