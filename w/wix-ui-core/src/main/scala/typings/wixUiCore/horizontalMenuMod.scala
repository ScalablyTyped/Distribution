package typings.wixUiCore

import typings.wixUiCore.anon.Columns
import typings.wixUiCore.anon.TypeofHorizontalMenuItem
import typings.wixUiCore.horizontalMenuHorizontalMenuMod.HorizontalMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuMod {
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu", "HorizontalMenu")
  @js.native
  class HorizontalMenu protected ()
    extends typings.wixUiCore.horizontalMenuHorizontalMenuMod.HorizontalMenu {
    def this(props: HorizontalMenuProps) = this()
  }
  /* static members */
  object HorizontalMenu {
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu", "HorizontalMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu", "HorizontalMenu.Item")
    @js.native
    def Item: TypeofHorizontalMenuItem = js.native
    inline def Item_=(x: TypeofHorizontalMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu", "HorizontalMenu.Layout")
    @js.native
    def Layout: Columns = js.native
    inline def Layout_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu", "HorizontalMenu.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
