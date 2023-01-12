package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFixedAmount extends StObject {
  
  val CurrencyOptions: Any
}
object TypeofFixedAmount {
  
  inline def apply(CurrencyOptions: Any): TypeofFixedAmount = {
    val __obj = js.Dynamic.literal(CurrencyOptions = CurrencyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFixedAmount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFixedAmount] (val x: Self) extends AnyVal {
    
    inline def setCurrencyOptions(value: Any): Self = StObject.set(x, "CurrencyOptions", value.asInstanceOf[js.Any])
  }
}
