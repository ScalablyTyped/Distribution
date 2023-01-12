package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofKonbini extends StObject {
  
  val Store: Any
}
object TypeofKonbini {
  
  inline def apply(Store: Any): TypeofKonbini = {
    val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofKonbini]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofKonbini] (val x: Self) extends AnyVal {
    
    inline def setStore(value: Any): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
  }
}
