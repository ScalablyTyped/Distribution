package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomerCashBalance extends StObject {
  
  val Funded: TypeofFunded
}
object TypeofCustomerCashBalance {
  
  inline def apply(Funded: TypeofFunded): TypeofCustomerCashBalance = {
    val __obj = js.Dynamic.literal(Funded = Funded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomerCashBalance]
  }
  
  extension [Self <: TypeofCustomerCashBalance](x: Self) {
    
    inline def setFunded(value: TypeofFunded): Self = StObject.set(x, "Funded", value.asInstanceOf[js.Any])
  }
}
