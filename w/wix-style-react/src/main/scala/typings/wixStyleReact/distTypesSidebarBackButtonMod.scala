package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarBackButtonMod {
  
  @JSImport("wix-style-react/dist/types/SidebarBackButton", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarBackButtonProps, js.Object, Any]
  
  type SidebarBackButton = PureComponent[SidebarBackButtonProps, js.Object, Any]
  
  trait SidebarBackButtonProps extends StObject {
    
    var animateArrow: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  }
  object SidebarBackButtonProps {
    
    inline def apply(): SidebarBackButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarBackButtonProps]
    }
    
    extension [Self <: SidebarBackButtonProps](x: Self) {
      
      inline def setAnimateArrow(value: Boolean): Self = StObject.set(x, "animateArrow", value.asInstanceOf[js.Any])
      
      inline def setAnimateArrowUndefined: Self = StObject.set(x, "animateArrow", js.undefined)
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
