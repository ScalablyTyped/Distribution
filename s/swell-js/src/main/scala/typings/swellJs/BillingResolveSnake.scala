package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingResolveSnake extends StObject {
  
  var charge_id: js.UndefOr[String] = js.undefined
}
object BillingResolveSnake {
  
  inline def apply(): BillingResolveSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingResolveSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingResolveSnake] (val x: Self) extends AnyVal {
    
    inline def setCharge_id(value: String): Self = StObject.set(x, "charge_id", value.asInstanceOf[js.Any])
    
    inline def setCharge_idUndefined: Self = StObject.set(x, "charge_id", js.undefined)
  }
}
