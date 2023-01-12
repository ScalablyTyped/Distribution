package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNextActionDisplayDetails extends StObject {
  
  val DisplayDetails: Any
}
object TypeofNextActionDisplayDetails {
  
  inline def apply(DisplayDetails: Any): TypeofNextActionDisplayDetails = {
    val __obj = js.Dynamic.literal(DisplayDetails = DisplayDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNextActionDisplayDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofNextActionDisplayDetails] (val x: Self) extends AnyVal {
    
    inline def setDisplayDetails(value: Any): Self = StObject.set(x, "DisplayDetails", value.asInstanceOf[js.Any])
  }
}
