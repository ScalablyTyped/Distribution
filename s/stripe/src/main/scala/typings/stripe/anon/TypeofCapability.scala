package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCapability extends StObject {
  
  val FutureRequirements: TypeofFutureRequirements
  
  val Requirements: TypeofRequirements
}
object TypeofCapability {
  
  inline def apply(FutureRequirements: TypeofFutureRequirements, Requirements: TypeofRequirements): TypeofCapability = {
    val __obj = js.Dynamic.literal(FutureRequirements = FutureRequirements.asInstanceOf[js.Any], Requirements = Requirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCapability]
  }
  
  extension [Self <: TypeofCapability](x: Self) {
    
    inline def setFutureRequirements(value: TypeofFutureRequirements): Self = StObject.set(x, "FutureRequirements", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: TypeofRequirements): Self = StObject.set(x, "Requirements", value.asInstanceOf[js.Any])
  }
}
