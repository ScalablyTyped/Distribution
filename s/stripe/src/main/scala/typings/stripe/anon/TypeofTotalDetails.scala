package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTotalDetails extends StObject {
  
  val Breakdown: Any
}
object TypeofTotalDetails {
  
  inline def apply(Breakdown: Any): TypeofTotalDetails = {
    val __obj = js.Dynamic.literal(Breakdown = Breakdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTotalDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTotalDetails] (val x: Self) extends AnyVal {
    
    inline def setBreakdown(value: Any): Self = StObject.set(x, "Breakdown", value.asInstanceOf[js.Any])
  }
}
