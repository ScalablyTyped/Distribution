package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover-next/components/Portal", JSImport.Default)
  @js.native
  class default () extends Portal
  
  @js.native
  trait Portal
    extends PureComponent[PortalProps, js.Object, js.Any]
  
  trait PortalProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var node: js.UndefOr[js.Any] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
}
