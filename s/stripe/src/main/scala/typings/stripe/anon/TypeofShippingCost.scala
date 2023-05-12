package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofShippingCost extends StObject {
  
  val Tax: Any
}
object TypeofShippingCost {
  
  inline def apply(Tax: Any): TypeofShippingCost = {
    val __obj = js.Dynamic.literal(Tax = Tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofShippingCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofShippingCost] (val x: Self) extends AnyVal {
    
    inline def setTax(value: Any): Self = StObject.set(x, "Tax", value.asInstanceOf[js.Any])
  }
}
