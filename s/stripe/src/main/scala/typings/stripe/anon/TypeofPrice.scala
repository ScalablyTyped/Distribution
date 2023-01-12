package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPrice extends StObject {
  
  val CurrencyOptions: Any
  
  val Recurring: Any
  
  val TransformQuantity: Any
}
object TypeofPrice {
  
  inline def apply(CurrencyOptions: Any, Recurring: Any, TransformQuantity: Any): TypeofPrice = {
    val __obj = js.Dynamic.literal(CurrencyOptions = CurrencyOptions.asInstanceOf[js.Any], Recurring = Recurring.asInstanceOf[js.Any], TransformQuantity = TransformQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPrice] (val x: Self) extends AnyVal {
    
    inline def setCurrencyOptions(value: Any): Self = StObject.set(x, "CurrencyOptions", value.asInstanceOf[js.Any])
    
    inline def setRecurring(value: Any): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
    
    inline def setTransformQuantity(value: Any): Self = StObject.set(x, "TransformQuantity", value.asInstanceOf[js.Any])
  }
}
