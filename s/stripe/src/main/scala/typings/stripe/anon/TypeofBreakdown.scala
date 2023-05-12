package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBreakdown extends StObject {
  
  val Tax: Any
}
object TypeofBreakdown {
  
  inline def apply(Tax: Any): TypeofBreakdown = {
    val __obj = js.Dynamic.literal(Tax = Tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBreakdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBreakdown] (val x: Self) extends AnyVal {
    
    inline def setTax(value: Any): Self = StObject.set(x, "Tax", value.asInstanceOf[js.Any])
  }
}
