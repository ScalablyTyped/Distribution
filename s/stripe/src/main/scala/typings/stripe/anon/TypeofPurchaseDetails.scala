package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPurchaseDetails extends StObject {
  
  val Flight: Any
}
object TypeofPurchaseDetails {
  
  inline def apply(Flight: Any): TypeofPurchaseDetails = {
    val __obj = js.Dynamic.literal(Flight = Flight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPurchaseDetails]
  }
  
  extension [Self <: TypeofPurchaseDetails](x: Self) {
    
    inline def setFlight(value: Any): Self = StObject.set(x, "Flight", value.asInstanceOf[js.Any])
  }
}
