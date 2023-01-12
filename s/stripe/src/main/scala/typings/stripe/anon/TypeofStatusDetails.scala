package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofStatusDetails extends StObject {
  
  val Closed: Any
}
object TypeofStatusDetails {
  
  inline def apply(Closed: Any): TypeofStatusDetails = {
    val __obj = js.Dynamic.literal(Closed = Closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStatusDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofStatusDetails] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: Any): Self = StObject.set(x, "Closed", value.asInstanceOf[js.Any])
  }
}
