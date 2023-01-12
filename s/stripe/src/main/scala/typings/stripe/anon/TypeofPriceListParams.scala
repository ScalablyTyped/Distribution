package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPriceListParams extends StObject {
  
  val Recurring: Any
}
object TypeofPriceListParams {
  
  inline def apply(Recurring: Any): TypeofPriceListParams = {
    val __obj = js.Dynamic.literal(Recurring = Recurring.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPriceListParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPriceListParams] (val x: Self) extends AnyVal {
    
    inline def setRecurring(value: Any): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
  }
}
