package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUpfront extends StObject {
  
  val TotalDetails: TypeofTotalDetails
}
object TypeofUpfront {
  
  inline def apply(TotalDetails: TypeofTotalDetails): TypeofUpfront = {
    val __obj = js.Dynamic.literal(TotalDetails = TotalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUpfront]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofUpfront] (val x: Self) extends AnyVal {
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
