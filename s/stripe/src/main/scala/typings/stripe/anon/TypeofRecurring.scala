package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRecurring extends StObject {
  
  val TotalDetails: TypeofTotalDetails
}
object TypeofRecurring {
  
  inline def apply(TotalDetails: TypeofTotalDetails): TypeofRecurring = {
    val __obj = js.Dynamic.literal(TotalDetails = TotalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRecurring]
  }
  
  extension [Self <: TypeofRecurring](x: Self) {
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
