package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQuote extends StObject {
  
  val AutomaticTax: Any
  
  val Computed: TypeofComputed
  
  val TotalDetails: TypeofTotalDetails
}
object TypeofQuote {
  
  inline def apply(AutomaticTax: Any, Computed: TypeofComputed, TotalDetails: TypeofTotalDetails): TypeofQuote = {
    val __obj = js.Dynamic.literal(AutomaticTax = AutomaticTax.asInstanceOf[js.Any], Computed = Computed.asInstanceOf[js.Any], TotalDetails = TotalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQuote]
  }
  
  extension [Self <: TypeofQuote](x: Self) {
    
    inline def setAutomaticTax(value: Any): Self = StObject.set(x, "AutomaticTax", value.asInstanceOf[js.Any])
    
    inline def setComputed(value: TypeofComputed): Self = StObject.set(x, "Computed", value.asInstanceOf[js.Any])
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
