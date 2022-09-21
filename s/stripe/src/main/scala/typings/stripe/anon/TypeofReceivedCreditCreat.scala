package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReceivedCreditCreat extends StObject {
  
  val InitiatingPaymentMethodDetails: Any
}
object TypeofReceivedCreditCreat {
  
  inline def apply(InitiatingPaymentMethodDetails: Any): TypeofReceivedCreditCreat = {
    val __obj = js.Dynamic.literal(InitiatingPaymentMethodDetails = InitiatingPaymentMethodDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReceivedCreditCreat]
  }
  
  extension [Self <: TypeofReceivedCreditCreat](x: Self) {
    
    inline def setInitiatingPaymentMethodDetails(value: Any): Self = StObject.set(x, "InitiatingPaymentMethodDetails", value.asInstanceOf[js.Any])
  }
}
