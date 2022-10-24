package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarDividerNextMod {
  
  @JSImport("wix-style-react/dist/types/SidebarDividerNext", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarDividerNextProps, js.Object, Any]
  
  type SidebarDividerNext = PureComponent[SidebarDividerNextProps, js.Object, Any]
  
  trait SidebarDividerNextProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
  }
  object SidebarDividerNextProps {
    
    inline def apply(): SidebarDividerNextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarDividerNextProps]
    }
    
    extension [Self <: SidebarDividerNextProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    }
  }
}
