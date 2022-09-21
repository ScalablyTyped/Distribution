package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSecretCreateParams extends StObject {
  
  val Scope: Any
}
object TypeofSecretCreateParams {
  
  inline def apply(Scope: Any): TypeofSecretCreateParams = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSecretCreateParams]
  }
  
  extension [Self <: TypeofSecretCreateParams](x: Self) {
    
    inline def setScope(value: Any): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
