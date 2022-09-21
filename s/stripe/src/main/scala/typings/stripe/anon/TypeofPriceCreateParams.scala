package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPriceCreateParams extends StObject {
  
  val CurrencyOptions: Any
  
  val Recurring: Any
  
  val TransformQuantity: Any
}
object TypeofPriceCreateParams {
  
  inline def apply(CurrencyOptions: Any, Recurring: Any, TransformQuantity: Any): TypeofPriceCreateParams = {
    val __obj = js.Dynamic.literal(CurrencyOptions = CurrencyOptions.asInstanceOf[js.Any], Recurring = Recurring.asInstanceOf[js.Any], TransformQuantity = TransformQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPriceCreateParams]
  }
  
  extension [Self <: TypeofPriceCreateParams](x: Self) {
    
    inline def setCurrencyOptions(value: Any): Self = StObject.set(x, "CurrencyOptions", value.asInstanceOf[js.Any])
    
    inline def setRecurring(value: Any): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
    
    inline def setTransformQuantity(value: Any): Self = StObject.set(x, "TransformQuantity", value.asInstanceOf[js.Any])
  }
}
