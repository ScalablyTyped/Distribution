package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPerson extends StObject {
  
  val FutureRequirements: TypeofFutureRequirements
  
  val Requirements: TypeofRequirements
  
  val Verification: Any
}
object TypeofPerson {
  
  inline def apply(FutureRequirements: TypeofFutureRequirements, Requirements: TypeofRequirements, Verification: Any): TypeofPerson = {
    val __obj = js.Dynamic.literal(FutureRequirements = FutureRequirements.asInstanceOf[js.Any], Requirements = Requirements.asInstanceOf[js.Any], Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPerson]
  }
  
  extension [Self <: TypeofPerson](x: Self) {
    
    inline def setFutureRequirements(value: TypeofFutureRequirements): Self = StObject.set(x, "FutureRequirements", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: TypeofRequirements): Self = StObject.set(x, "Requirements", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
