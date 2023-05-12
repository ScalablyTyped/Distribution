package typings.tonicUiReact.mod

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalProps extends StObject {
  
  var appendToParentPortal: js.UndefOr[Boolean] = js.undefined
  
  var containerRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
}
object PortalProps {
  
  inline def apply(): PortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
    
    inline def setAppendToParentPortal(value: Boolean): Self = StObject.set(x, "appendToParentPortal", value.asInstanceOf[js.Any])
    
    inline def setAppendToParentPortalUndefined: Self = StObject.set(x, "appendToParentPortal", js.undefined)
    
    inline def setContainerRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
  }
}
