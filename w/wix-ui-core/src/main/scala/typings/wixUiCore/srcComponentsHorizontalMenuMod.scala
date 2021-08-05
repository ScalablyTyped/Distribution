package typings.wixUiCore

import typings.wixUiCore.anon.GridFC
import typings.wixUiCore.anon.TypeofHorizontalMenuItemInstantiableDefaultProps
import typings.wixUiCore.srcComponentsHorizontalMenuHorizontalMenuMod.HorizontalMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsHorizontalMenuMod {
  
  @JSImport("wix-ui-core/src/components/horizontal-menu", "HorizontalMenu")
  @js.native
  class HorizontalMenu protected ()
    extends typings.wixUiCore.srcComponentsHorizontalMenuHorizontalMenuMod.HorizontalMenu {
    def this(props: HorizontalMenuProps) = this()
  }
  /* static members */
  object HorizontalMenu {
    
    @JSImport("wix-ui-core/src/components/horizontal-menu", "HorizontalMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/horizontal-menu", "HorizontalMenu.Item")
    @js.native
    def Item: TypeofHorizontalMenuItemInstantiableDefaultProps = js.native
    inline def Item_=(x: TypeofHorizontalMenuItemInstantiableDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/horizontal-menu", "HorizontalMenu.Layout")
    @js.native
    def Layout: GridFC = js.native
    inline def Layout_=(x: GridFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/horizontal-menu", "HorizontalMenu.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
