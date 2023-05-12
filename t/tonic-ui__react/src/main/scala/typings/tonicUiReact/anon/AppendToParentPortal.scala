package typings.tonicUiReact.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendToParentPortal extends StObject {
  
  var appendToParentPortal: js.UndefOr[Boolean] = js.undefined
  
  var containerRef: js.UndefOr[Element | Null] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object AppendToParentPortal {
  
  inline def apply(): AppendToParentPortal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendToParentPortal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppendToParentPortal] (val x: Self) extends AnyVal {
    
    inline def setAppendToParentPortal(value: Boolean): Self = StObject.set(x, "appendToParentPortal", value.asInstanceOf[js.Any])
    
    inline def setAppendToParentPortalUndefined: Self = StObject.set(x, "appendToParentPortal", js.undefined)
    
    inline def setContainerRef(value: Element): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
    
    inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
