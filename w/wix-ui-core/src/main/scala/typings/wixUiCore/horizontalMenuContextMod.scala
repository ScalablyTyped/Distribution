package typings.wixUiCore

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.std.HTMLUListElement
import typings.typeZoo.mod.Omit
import typings.wixUiCore.wixUiCoreStrings.menuContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuContextMod {
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/HorizontalMenuContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/HorizontalMenuContext", "HorizontalMenuContext")
  @js.native
  val HorizontalMenuContext: Context[HorizontalMenuContextValue] = js.native
  
  @scala.inline
  def withHorizontalMenuContext[P /* <: WithHorizontalMenuContextProps */](WrappedComponent: ComponentType[P]): FC[Omit[P, menuContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withHorizontalMenuContext")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FC[Omit[P, menuContext]]]
  
  trait HorizontalMenuContextValue extends StObject {
    
    var columnsLayoutClassName: String
    
    var gridLayoutClassName: String
    
    var menuItemClassName: String
    
    var rootMenuRef: RefObject[HTMLUListElement]
  }
  object HorizontalMenuContextValue {
    
    @scala.inline
    def apply(
      columnsLayoutClassName: String,
      gridLayoutClassName: String,
      menuItemClassName: String,
      rootMenuRef: RefObject[HTMLUListElement]
    ): HorizontalMenuContextValue = {
      val __obj = js.Dynamic.literal(columnsLayoutClassName = columnsLayoutClassName.asInstanceOf[js.Any], gridLayoutClassName = gridLayoutClassName.asInstanceOf[js.Any], menuItemClassName = menuItemClassName.asInstanceOf[js.Any], rootMenuRef = rootMenuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuContextValue]
    }
    
    @scala.inline
    implicit class HorizontalMenuContextValueMutableBuilder[Self <: HorizontalMenuContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnsLayoutClassName(value: String): Self = StObject.set(x, "columnsLayoutClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridLayoutClassName(value: String): Self = StObject.set(x, "gridLayoutClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemClassName(value: String): Self = StObject.set(x, "menuItemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootMenuRef(value: RefObject[HTMLUListElement]): Self = StObject.set(x, "rootMenuRef", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithHorizontalMenuContextProps extends StObject {
    
    var menuContext: HorizontalMenuContextValue
  }
  object WithHorizontalMenuContextProps {
    
    @scala.inline
    def apply(menuContext: HorizontalMenuContextValue): WithHorizontalMenuContextProps = {
      val __obj = js.Dynamic.literal(menuContext = menuContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithHorizontalMenuContextProps]
    }
    
    @scala.inline
    implicit class WithHorizontalMenuContextPropsMutableBuilder[Self <: WithHorizontalMenuContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenuContext(value: HorizontalMenuContextValue): Self = StObject.set(x, "menuContext", value.asInstanceOf[js.Any])
    }
  }
}
