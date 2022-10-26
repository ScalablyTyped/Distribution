package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarHeaderNextMod {
  
  @JSImport("wix-style-react/dist/types/SidebarHeaderNext", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarHeaderNextProps, js.Object, Any]
  
  type SidebarHeaderNext = PureComponent[SidebarHeaderNextProps, js.Object, Any]
  
  trait SidebarHeaderNextProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object SidebarHeaderNextProps {
    
    inline def apply(): SidebarHeaderNextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarHeaderNextProps]
    }
    
    extension [Self <: SidebarHeaderNextProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
