package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDeliveryEstimate extends StObject {
  
  val Maximum: Any
  
  val Minimum: Any
}
object TypeofDeliveryEstimate {
  
  inline def apply(Maximum: Any, Minimum: Any): TypeofDeliveryEstimate = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDeliveryEstimate]
  }
  
  extension [Self <: TypeofDeliveryEstimate](x: Self) {
    
    inline def setMaximum(value: Any): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Any): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
  }
}
