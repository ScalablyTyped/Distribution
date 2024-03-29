package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPersonFutureRequirements extends StObject {
  
  val FutureRequirements: TypeofFutureRequirements
  
  val Requirements: TypeofRequirements
  
  val Verification: Any
}
object TypeofPersonFutureRequirements {
  
  inline def apply(FutureRequirements: TypeofFutureRequirements, Requirements: TypeofRequirements, Verification: Any): TypeofPersonFutureRequirements = {
    val __obj = js.Dynamic.literal(FutureRequirements = FutureRequirements.asInstanceOf[js.Any], Requirements = Requirements.asInstanceOf[js.Any], Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPersonFutureRequirements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPersonFutureRequirements] (val x: Self) extends AnyVal {
    
    inline def setFutureRequirements(value: TypeofFutureRequirements): Self = StObject.set(x, "FutureRequirements", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: TypeofRequirements): Self = StObject.set(x, "Requirements", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
