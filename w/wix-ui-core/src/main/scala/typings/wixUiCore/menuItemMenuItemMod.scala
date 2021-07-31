package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMenuItemMod {
  
  @JSImport("wix-ui-core/dist/src/components/menu-item/menu-item", "MenuItem")
  @js.native
  val MenuItem: FunctionComponent[MenuItemProps] = js.native
  
  trait MenuItemProps extends StObject {
    
    /** any node to be rendered inside MenuItem */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** define if MenuItem is in disabled state */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** define if MenuItem is in highlighted state */
    var highlighted: js.UndefOr[Boolean] = js.undefined
    
    /** callback which will be called uppon item selection */
    var onSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** define if MenuItem is in selected state */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
      
      @scala.inline
      def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
