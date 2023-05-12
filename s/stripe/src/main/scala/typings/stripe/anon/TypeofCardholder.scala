package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardholder extends StObject {
  
  val Individual: TypeofIndividualCardIssuing
  
  val Requirements: Any
  
  val SpendingControls: TypeofSpendingControls
}
object TypeofCardholder {
  
  inline def apply(
    Individual: TypeofIndividualCardIssuing,
    Requirements: Any,
    SpendingControls: TypeofSpendingControls
  ): TypeofCardholder = {
    val __obj = js.Dynamic.literal(Individual = Individual.asInstanceOf[js.Any], Requirements = Requirements.asInstanceOf[js.Any], SpendingControls = SpendingControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardholder] (val x: Self) extends AnyVal {
    
    inline def setIndividual(value: TypeofIndividualCardIssuing): Self = StObject.set(x, "Individual", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: Any): Self = StObject.set(x, "Requirements", value.asInstanceOf[js.Any])
    
    inline def setSpendingControls(value: TypeofSpendingControls): Self = StObject.set(x, "SpendingControls", value.asInstanceOf[js.Any])
  }
}
