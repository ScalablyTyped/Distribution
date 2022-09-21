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
  
  extension [Self <: TypeofUpfront](x: Self) {
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
