package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithScope extends StObject {
  
  var _ownerScope: TypeScope
}
object WithScope {
  
  inline def apply(_ownerScope: TypeScope): WithScope = {
    val __obj = js.Dynamic.literal(_ownerScope = _ownerScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithScope] (val x: Self) extends AnyVal {
    
    inline def set_ownerScope(value: TypeScope): Self = StObject.set(x, "_ownerScope", value.asInstanceOf[js.Any])
  }
}
