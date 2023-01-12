package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scopes extends StObject {
  
  /** The scopes of the stackframe. If the array has length zero, there are no scopes available. */
  var scopes: js.Array[Scope]
}
object Scopes {
  
  inline def apply(scopes: js.Array[Scope]): Scopes = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
    
    inline def setScopes(value: js.Array[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
