package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReceivedDebitCreate extends StObject {
  
  val InitiatingPaymentMethodDetails: Any
}
object TypeofReceivedDebitCreate {
  
  inline def apply(InitiatingPaymentMethodDetails: Any): TypeofReceivedDebitCreate = {
    val __obj = js.Dynamic.literal(InitiatingPaymentMethodDetails = InitiatingPaymentMethodDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReceivedDebitCreate]
  }
  
  extension [Self <: TypeofReceivedDebitCreate](x: Self) {
    
    inline def setInitiatingPaymentMethodDetails(value: Any): Self = StObject.set(x, "InitiatingPaymentMethodDetails", value.asInstanceOf[js.Any])
  }
}
