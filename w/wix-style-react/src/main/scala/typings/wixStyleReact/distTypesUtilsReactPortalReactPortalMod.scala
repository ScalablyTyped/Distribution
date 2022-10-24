package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.DocumentFragment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsReactPortalReactPortalMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/utils/ReactPortal/ReactPortal", JSImport.Default)
  @js.native
  val default: FunctionComponent[ReactPortalProps] = js.native
  
  trait ReactPortalProps extends StObject {
    
    var children: ReactNode
    
    var node: js.UndefOr[Element | DocumentFragment] = js.undefined
  }
  object ReactPortalProps {
    
    inline def apply(): ReactPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactPortalProps]
    }
    
    extension [Self <: ReactPortalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNode(value: Element | DocumentFragment): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ReactPortalProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesUtilsReactPortalReactPortalMod.foo` */
  override def _to: FunctionComponent[ReactPortalProps] = default
}
