package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUsBankAccountFinancialConnections extends StObject {
  
  val FinancialConnections: Any
  
  val Networks: Any
}
object TypeofUsBankAccountFinancialConnections {
  
  inline def apply(FinancialConnections: Any, Networks: Any): TypeofUsBankAccountFinancialConnections = {
    val __obj = js.Dynamic.literal(FinancialConnections = FinancialConnections.asInstanceOf[js.Any], Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUsBankAccountFinancialConnections]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofUsBankAccountFinancialConnections] (val x: Self) extends AnyVal {
    
    inline def setFinancialConnections(value: Any): Self = StObject.set(x, "FinancialConnections", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: Any): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
  }
}
