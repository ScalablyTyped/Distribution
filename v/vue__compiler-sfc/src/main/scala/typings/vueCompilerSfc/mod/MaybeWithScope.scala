package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaybeWithScope extends StObject {
  
  var _ownerScope: js.UndefOr[TypeScope] = js.undefined
}
object MaybeWithScope {
  
  inline def apply(): MaybeWithScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeWithScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaybeWithScope] (val x: Self) extends AnyVal {
    
    inline def set_ownerScope(value: TypeScope): Self = StObject.set(x, "_ownerScope", value.asInstanceOf[js.Any])
    
    inline def set_ownerScopeUndefined: Self = StObject.set(x, "_ownerScope", js.undefined)
  }
}
