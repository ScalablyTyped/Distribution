package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDefaultPriceData extends StObject {
  
  val CurrencyOptions: Any
  
  val Recurring: Any
}
object TypeofDefaultPriceData {
  
  inline def apply(CurrencyOptions: Any, Recurring: Any): TypeofDefaultPriceData = {
    val __obj = js.Dynamic.literal(CurrencyOptions = CurrencyOptions.asInstanceOf[js.Any], Recurring = Recurring.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDefaultPriceData]
  }
  
  extension [Self <: TypeofDefaultPriceData](x: Self) {
    
    inline def setCurrencyOptions(value: Any): Self = StObject.set(x, "CurrencyOptions", value.asInstanceOf[js.Any])
    
    inline def setRecurring(value: Any): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
  }
}
