package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardholderUpdatePar extends StObject {
  
  val Billing: Any
  
  val Individual: TypeofIndividualCardIssuing
  
  val SpendingControls: TypeofSpendingControls
}
object TypeofCardholderUpdatePar {
  
  inline def apply(Billing: Any, Individual: TypeofIndividualCardIssuing, SpendingControls: TypeofSpendingControls): TypeofCardholderUpdatePar = {
    val __obj = js.Dynamic.literal(Billing = Billing.asInstanceOf[js.Any], Individual = Individual.asInstanceOf[js.Any], SpendingControls = SpendingControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardholderUpdatePar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardholderUpdatePar] (val x: Self) extends AnyVal {
    
    inline def setBilling(value: Any): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setIndividual(value: TypeofIndividualCardIssuing): Self = StObject.set(x, "Individual", value.asInstanceOf[js.Any])
    
    inline def setSpendingControls(value: TypeofSpendingControls): Self = StObject.set(x, "SpendingControls", value.asInstanceOf[js.Any])
  }
}
