package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasDecorator extends StObject {
  
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
}
object HasDecorator {
  
  inline def apply(): HasDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasDecorator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasDecorator] (val x: Self) extends AnyVal {
    
    inline def setDecorators(value: js.Array[Decorator]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator*): Self = StObject.set(x, "decorators", js.Array(value*))
  }
}
