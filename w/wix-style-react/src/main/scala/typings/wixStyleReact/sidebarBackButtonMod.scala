package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarBackButtonMod {
  
  @JSImport("wix-style-react/dist/es/src/SidebarBackButton", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SidebarBackButtonProps, js.Object, js.Any]
  
  type SidebarBackButton = PureComponent[SidebarBackButtonProps, js.Object, js.Any]
  
  trait SidebarBackButtonProps extends StObject {
    
    var animateArrow: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  }
  object SidebarBackButtonProps {
    
    @scala.inline
    def apply(): SidebarBackButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarBackButtonProps]
    }
    
    @scala.inline
    implicit class SidebarBackButtonPropsMutableBuilder[Self <: SidebarBackButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateArrow(value: Boolean): Self = StObject.set(x, "animateArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateArrowUndefined: Self = StObject.set(x, "animateArrow", js.undefined)
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
