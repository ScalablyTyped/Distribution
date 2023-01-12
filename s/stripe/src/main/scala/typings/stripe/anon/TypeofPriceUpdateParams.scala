package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPriceUpdateParams extends StObject {
  
  val CurrencyOptions: Any
}
object TypeofPriceUpdateParams {
  
  inline def apply(CurrencyOptions: Any): TypeofPriceUpdateParams = {
    val __obj = js.Dynamic.literal(CurrencyOptions = CurrencyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPriceUpdateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPriceUpdateParams] (val x: Self) extends AnyVal {
    
    inline def setCurrencyOptions(value: Any): Self = StObject.set(x, "CurrencyOptions", value.asInstanceOf[js.Any])
  }
}
