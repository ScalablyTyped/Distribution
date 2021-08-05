package typings.wixStyleReact.mod

import typings.react.mod.ReactElement
import typings.wixStyleReact.popoverMenuMod.PopoverMenuDividerProps
import typings.wixStyleReact.popoverMenuMod.PopoverMenuItemProps
import typings.wixStyleReact.popoverMenuMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "PopoverMenu")
@js.native
class PopoverMenu () extends default
/* static members */
object PopoverMenu {
  
  @JSImport("wix-style-react", "PopoverMenu")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Divider(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")().asInstanceOf[ReactElement]
  inline def Divider(props: PopoverMenuDividerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuItem(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")().asInstanceOf[ReactElement]
  inline def MenuItem(props: PopoverMenuItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
