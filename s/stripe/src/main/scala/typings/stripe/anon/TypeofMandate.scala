package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMandate extends StObject {
  
  val CustomerAcceptance: Any
  
  val PaymentMethodDetails: TypeofPaymentMethodDetailAcssDebit
}
object TypeofMandate {
  
  inline def apply(CustomerAcceptance: Any, PaymentMethodDetails: TypeofPaymentMethodDetailAcssDebit): TypeofMandate = {
    val __obj = js.Dynamic.literal(CustomerAcceptance = CustomerAcceptance.asInstanceOf[js.Any], PaymentMethodDetails = PaymentMethodDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMandate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMandate] (val x: Self) extends AnyVal {
    
    inline def setCustomerAcceptance(value: Any): Self = StObject.set(x, "CustomerAcceptance", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodDetails(value: TypeofPaymentMethodDetailAcssDebit): Self = StObject.set(x, "PaymentMethodDetails", value.asInstanceOf[js.Any])
  }
}
