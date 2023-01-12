package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInteracPresent extends StObject {
  
  val Receipt: Any
}
object TypeofInteracPresent {
  
  inline def apply(Receipt: Any): TypeofInteracPresent = {
    val __obj = js.Dynamic.literal(Receipt = Receipt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInteracPresent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInteracPresent] (val x: Self) extends AnyVal {
    
    inline def setReceipt(value: Any): Self = StObject.set(x, "Receipt", value.asInstanceOf[js.Any])
  }
}
