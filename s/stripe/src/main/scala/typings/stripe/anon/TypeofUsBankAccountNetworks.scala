package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUsBankAccountNetworks extends StObject {
  
  val Networks: Any
}
object TypeofUsBankAccountNetworks {
  
  inline def apply(Networks: Any): TypeofUsBankAccountNetworks = {
    val __obj = js.Dynamic.literal(Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUsBankAccountNetworks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofUsBankAccountNetworks] (val x: Self) extends AnyVal {
    
    inline def setNetworks(value: Any): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
  }
}
