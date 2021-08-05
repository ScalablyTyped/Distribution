package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.std.HTMLUListElement
import typings.wixUiCore.anon.GridFC
import typings.wixUiCore.anon.TypeofHorizontalMenuItemInstantiableDefaultProps
import typings.wixUiCore.componentsHorizontalMenuHorizontalMenuContextMod.HorizontalMenuContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsHorizontalMenuHorizontalMenuMod {
  
  @JSImport("wix-ui-core/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu")
  @js.native
  class HorizontalMenu protected ()
    extends PureComponent[HorizontalMenuProps, js.Object, js.Any] {
    def this(props: HorizontalMenuProps) = this()
    
    var contextValue: HorizontalMenuContextValue = js.native
    
    var rootRef: RefObject[HTMLUListElement] = js.native
  }
  /* static members */
  object HorizontalMenu {
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu.Item")
    @js.native
    def Item: TypeofHorizontalMenuItemInstantiableDefaultProps = js.native
    inline def Item_=(x: TypeofHorizontalMenuItemInstantiableDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu.Layout")
    @js.native
    def Layout: GridFC = js.native
    inline def Layout_=(x: GridFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait HorizontalMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Menu inline styles */
    var menuStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** Nav inline styles */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HorizontalMenuProps {
    
    inline def apply(): HorizontalMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalMenuProps]
    }
    
    extension [Self <: HorizontalMenuProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
