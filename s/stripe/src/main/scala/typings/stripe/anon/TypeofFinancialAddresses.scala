package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFinancialAddresses extends StObject {
  
  val Aba: TypeofAba
}
object TypeofFinancialAddresses {
  
  inline def apply(Aba: TypeofAba): TypeofFinancialAddresses = {
    val __obj = js.Dynamic.literal(Aba = Aba.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFinancialAddresses]
  }
  
  extension [Self <: TypeofFinancialAddresses](x: Self) {
    
    inline def setAba(value: TypeofAba): Self = StObject.set(x, "Aba", value.asInstanceOf[js.Any])
  }
}
