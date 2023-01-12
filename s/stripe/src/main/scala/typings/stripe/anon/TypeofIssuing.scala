package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIssuing extends StObject {
  
  val Available: Any
}
object TypeofIssuing {
  
  inline def apply(Available: Any): TypeofIssuing = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIssuing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofIssuing] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Any): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
  }
}
