package typings.wixUiCore

import typings.wixUiCore.anon.ColumnsGrid
import typings.wixUiCore.anon.TypeofHorizontalMenuItemInstantiable
import typings.wixUiCore.componentsHorizontalMenuHorizontalMenuMod.HorizontalMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHorizontalMenuMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu", "HorizontalMenu")
  @js.native
  class HorizontalMenu protected ()
    extends typings.wixUiCore.componentsHorizontalMenuHorizontalMenuMod.HorizontalMenu {
    def this(props: HorizontalMenuProps) = this()
  }
  /* static members */
  object HorizontalMenu {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu", "HorizontalMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu", "HorizontalMenu.Item")
    @js.native
    def Item: TypeofHorizontalMenuItemInstantiable = js.native
    @scala.inline
    def Item_=(x: TypeofHorizontalMenuItemInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu", "HorizontalMenu.Layout")
    @js.native
    def Layout: ColumnsGrid = js.native
    @scala.inline
    def Layout_=(x: ColumnsGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu", "HorizontalMenu.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
