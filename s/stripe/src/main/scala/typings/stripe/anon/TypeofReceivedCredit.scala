package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReceivedCredit extends StObject {
  
  val InitiatingPaymentMethodDetails: Any
  
  val LinkedFlows: TypeofLinkedFlows
  
  val ReversalDetails: Any
}
object TypeofReceivedCredit {
  
  inline def apply(InitiatingPaymentMethodDetails: Any, LinkedFlows: TypeofLinkedFlows, ReversalDetails: Any): TypeofReceivedCredit = {
    val __obj = js.Dynamic.literal(InitiatingPaymentMethodDetails = InitiatingPaymentMethodDetails.asInstanceOf[js.Any], LinkedFlows = LinkedFlows.asInstanceOf[js.Any], ReversalDetails = ReversalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReceivedCredit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReceivedCredit] (val x: Self) extends AnyVal {
    
    inline def setInitiatingPaymentMethodDetails(value: Any): Self = StObject.set(x, "InitiatingPaymentMethodDetails", value.asInstanceOf[js.Any])
    
    inline def setLinkedFlows(value: TypeofLinkedFlows): Self = StObject.set(x, "LinkedFlows", value.asInstanceOf[js.Any])
    
    inline def setReversalDetails(value: Any): Self = StObject.set(x, "ReversalDetails", value.asInstanceOf[js.Any])
  }
}
