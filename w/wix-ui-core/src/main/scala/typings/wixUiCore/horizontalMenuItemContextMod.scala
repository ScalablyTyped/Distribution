package typings.wixUiCore

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import typings.typeZoo.mod.Omit
import typings.wixUiCore.horizontalMenuItemHorizontalMenuItemMod.ExpandSize
import typings.wixUiCore.wixUiCoreStrings.menuItemContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuItemContextMod {
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItemContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItemContext", "HorizontalMenuItemContext")
  @js.native
  val HorizontalMenuItemContext: Context[HorizontalMenuItemContextValue] = js.native
  
  @scala.inline
  def withHorizontalMenuItemContext[P /* <: WithHorizontalMenuItemContextProps */](WrappedComponent: ComponentType[P]): FC[Omit[P, menuItemContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withHorizontalMenuItemContext")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FC[Omit[P, menuItemContext]]]
  
  trait HorizontalMenuItemContextValue extends StObject {
    
    var expandSize: js.UndefOr[ExpandSize] = js.undefined
    
    var isOpen: Boolean
    
    var menuItemRef: RefObject[HTMLLIElement]
    
    var rootMenuRef: RefObject[HTMLUListElement]
  }
  object HorizontalMenuItemContextValue {
    
    @scala.inline
    def apply(isOpen: Boolean, menuItemRef: RefObject[HTMLLIElement], rootMenuRef: RefObject[HTMLUListElement]): HorizontalMenuItemContextValue = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], menuItemRef = menuItemRef.asInstanceOf[js.Any], rootMenuRef = rootMenuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuItemContextValue]
    }
    
    @scala.inline
    implicit class HorizontalMenuItemContextValueMutableBuilder[Self <: HorizontalMenuItemContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandSize(value: ExpandSize): Self = StObject.set(x, "expandSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandSizeUndefined: Self = StObject.set(x, "expandSize", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemRef(value: RefObject[HTMLLIElement]): Self = StObject.set(x, "menuItemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootMenuRef(value: RefObject[HTMLUListElement]): Self = StObject.set(x, "rootMenuRef", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithHorizontalMenuItemContextProps extends StObject {
    
    var menuItemContext: HorizontalMenuItemContextValue
  }
  object WithHorizontalMenuItemContextProps {
    
    @scala.inline
    def apply(menuItemContext: HorizontalMenuItemContextValue): WithHorizontalMenuItemContextProps = {
      val __obj = js.Dynamic.literal(menuItemContext = menuItemContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithHorizontalMenuItemContextProps]
    }
    
    @scala.inline
    implicit class WithHorizontalMenuItemContextPropsMutableBuilder[Self <: WithHorizontalMenuItemContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenuItemContext(value: HorizontalMenuItemContextValue): Self = StObject.set(x, "menuItemContext", value.asInstanceOf[js.Any])
    }
  }
}
