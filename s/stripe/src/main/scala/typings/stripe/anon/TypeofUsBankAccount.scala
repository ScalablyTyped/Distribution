package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUsBankAccount extends StObject {
  
  val FinancialConnections: Any
}
object TypeofUsBankAccount {
  
  inline def apply(FinancialConnections: Any): TypeofUsBankAccount = {
    val __obj = js.Dynamic.literal(FinancialConnections = FinancialConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUsBankAccount]
  }
  
  extension [Self <: TypeofUsBankAccount](x: Self) {
    
    inline def setFinancialConnections(value: Any): Self = StObject.set(x, "FinancialConnections", value.asInstanceOf[js.Any])
  }
}
