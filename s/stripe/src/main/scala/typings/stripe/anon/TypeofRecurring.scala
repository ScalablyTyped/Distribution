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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRecurring] (val x: Self) extends AnyVal {
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
