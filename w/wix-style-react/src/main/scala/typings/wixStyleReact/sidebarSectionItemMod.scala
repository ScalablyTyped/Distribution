package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarSectionItemMod {
  
  @JSImport("wix-style-react/dist/es/src/SidebarSectionItem", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SidebarSectionItemProps, js.Object, js.Any]
  
  type SidebarSectionItem = PureComponent[SidebarSectionItemProps, js.Object, js.Any]
  
  trait SidebarSectionItemProps extends StObject {
    
    var alwaysDisplayChevron: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var drillable: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
  }
  object SidebarSectionItemProps {
    
    @scala.inline
    def apply(): SidebarSectionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarSectionItemProps]
    }
    
    @scala.inline
    implicit class SidebarSectionItemPropsMutableBuilder[Self <: SidebarSectionItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysDisplayChevron(value: Boolean): Self = StObject.set(x, "alwaysDisplayChevron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysDisplayChevronUndefined: Self = StObject.set(x, "alwaysDisplayChevron", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDrillable(value: Boolean): Self = StObject.set(x, "drillable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillableUndefined: Self = StObject.set(x, "drillable", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
