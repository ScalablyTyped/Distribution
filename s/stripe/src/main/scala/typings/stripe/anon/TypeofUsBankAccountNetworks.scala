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
  
  extension [Self <: TypeofUsBankAccountNetworks](x: Self) {
    
    inline def setNetworks(value: Any): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
  }
}
