package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarTitleItemNextMod {
  
  @JSImport("wix-style-react/dist/types/SidebarTitleItemNext", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarTitleItemNextProps, js.Object, Any]
  
  type SidebarTitleItemNext = PureComponent[SidebarTitleItemNextProps, js.Object, Any]
  
  trait SidebarTitleItemNextProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object SidebarTitleItemNextProps {
    
    inline def apply(): SidebarTitleItemNextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarTitleItemNextProps]
    }
    
    extension [Self <: SidebarTitleItemNextProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
