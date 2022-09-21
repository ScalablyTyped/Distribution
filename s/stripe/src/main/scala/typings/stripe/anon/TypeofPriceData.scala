package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPriceData extends StObject {
  
  val Recurring: Any
}
object TypeofPriceData {
  
  inline def apply(Recurring: Any): TypeofPriceData = {
    val __obj = js.Dynamic.literal(Recurring = Recurring.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPriceData]
  }
  
  extension [Self <: TypeofPriceData](x: Self) {
    
    inline def setRecurring(value: Any): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
  }
}
