package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCollapseMod {
  
  @JSImport("wix-style-react/dist/types/Collapse", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CollapseProps, js.Object, Any]
  
  type Collapse = Component[CollapseProps, js.Object, Any]
  
  trait CollapseProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var mountOnEnter: js.UndefOr[Boolean] = js.undefined
    
    var onCollapseAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpandAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setOnCollapseAnimationEnd(value: () => Unit): Self = StObject.set(x, "onCollapseAnimationEnd", js.Any.fromFunction0(value))
      
      inline def setOnCollapseAnimationEndUndefined: Self = StObject.set(x, "onCollapseAnimationEnd", js.undefined)
      
      inline def setOnExpandAnimationEnd(value: () => Unit): Self = StObject.set(x, "onExpandAnimationEnd", js.Any.fromFunction0(value))
      
      inline def setOnExpandAnimationEndUndefined: Self = StObject.set(x, "onExpandAnimationEnd", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
