package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLineItemTax extends StObject {
  
  val Tax: Any
}
object TypeofLineItemTax {
  
  inline def apply(Tax: Any): TypeofLineItemTax = {
    val __obj = js.Dynamic.literal(Tax = Tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLineItemTax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLineItemTax] (val x: Self) extends AnyVal {
    
    inline def setTax(value: Any): Self = StObject.set(x, "Tax", value.asInstanceOf[js.Any])
  }
}
