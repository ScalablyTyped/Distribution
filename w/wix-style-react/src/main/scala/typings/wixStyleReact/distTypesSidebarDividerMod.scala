package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarDividerMod {
  
  @JSImport("wix-style-react/dist/types/SidebarDivider", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarDividerProps, js.Object, Any]
  
  type SidebarDivider = PureComponent[SidebarDividerProps, js.Object, Any]
  
  trait SidebarDividerProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
  }
  object SidebarDividerProps {
    
    inline def apply(): SidebarDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarDividerProps]
    }
    
    extension [Self <: SidebarDividerProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    }
  }
}
