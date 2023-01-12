package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTax extends StObject {
  
  val Location: Any
}
object TypeofTax {
  
  inline def apply(Location: Any): TypeofTax = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTax] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Any): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
