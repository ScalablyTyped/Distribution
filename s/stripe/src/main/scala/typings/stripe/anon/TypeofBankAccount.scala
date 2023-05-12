package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBankAccount extends StObject {
  
  val FutureRequirements: TypeofFutureRequirements
  
  val Requirements: TypeofRequirements
}
object TypeofBankAccount {
  
  inline def apply(FutureRequirements: TypeofFutureRequirements, Requirements: TypeofRequirements): TypeofBankAccount = {
    val __obj = js.Dynamic.literal(FutureRequirements = FutureRequirements.asInstanceOf[js.Any], Requirements = Requirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBankAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBankAccount] (val x: Self) extends AnyVal {
    
    inline def setFutureRequirements(value: TypeofFutureRequirements): Self = StObject.set(x, "FutureRequirements", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: TypeofRequirements): Self = StObject.set(x, "Requirements", value.asInstanceOf[js.Any])
  }
}
