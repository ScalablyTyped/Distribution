package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSectionTitleMod {
  
  @JSImport("wix-style-react/dist/types/SidebarSectionTitle", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarSectionTitleProps, js.Object, Any]
  
  type SidebarSectionTitle = PureComponent[SidebarSectionTitleProps, js.Object, Any]
  
  trait SidebarSectionTitleProps extends StObject {
    
    var children: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object SidebarSectionTitleProps {
    
    inline def apply(): SidebarSectionTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarSectionTitleProps]
    }
    
    extension [Self <: SidebarSectionTitleProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
