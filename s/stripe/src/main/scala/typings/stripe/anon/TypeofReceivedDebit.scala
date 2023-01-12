package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReceivedDebit extends StObject {
  
  val InitiatingPaymentMethodDetails: Any
  
  val ReversalDetails: Any
}
object TypeofReceivedDebit {
  
  inline def apply(InitiatingPaymentMethodDetails: Any, ReversalDetails: Any): TypeofReceivedDebit = {
    val __obj = js.Dynamic.literal(InitiatingPaymentMethodDetails = InitiatingPaymentMethodDetails.asInstanceOf[js.Any], ReversalDetails = ReversalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReceivedDebit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReceivedDebit] (val x: Self) extends AnyVal {
    
    inline def setInitiatingPaymentMethodDetails(value: Any): Self = StObject.set(x, "InitiatingPaymentMethodDetails", value.asInstanceOf[js.Any])
    
    inline def setReversalDetails(value: Any): Self = StObject.set(x, "ReversalDetails", value.asInstanceOf[js.Any])
  }
}
