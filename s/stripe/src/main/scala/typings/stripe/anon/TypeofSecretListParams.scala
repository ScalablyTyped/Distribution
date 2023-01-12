package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSecretListParams extends StObject {
  
  val Scope: Any
}
object TypeofSecretListParams {
  
  inline def apply(Scope: Any): TypeofSecretListParams = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSecretListParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSecretListParams] (val x: Self) extends AnyVal {
    
    inline def setScope(value: Any): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
