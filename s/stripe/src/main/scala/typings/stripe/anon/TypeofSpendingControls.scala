package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSpendingControls extends StObject {
  
  val SpendingLimit: Any
}
object TypeofSpendingControls {
  
  inline def apply(SpendingLimit: Any): TypeofSpendingControls = {
    val __obj = js.Dynamic.literal(SpendingLimit = SpendingLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSpendingControls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSpendingControls] (val x: Self) extends AnyVal {
    
    inline def setSpendingLimit(value: Any): Self = StObject.set(x, "SpendingLimit", value.asInstanceOf[js.Any])
  }
}
