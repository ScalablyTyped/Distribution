package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSecret extends StObject {
  
  val Scope: Any
}
object TypeofSecret {
  
  inline def apply(Scope: Any): TypeofSecret = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSecret]
  }
  
  extension [Self <: TypeofSecret](x: Self) {
    
    inline def setScope(value: Any): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
