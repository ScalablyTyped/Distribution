package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUserMenuMod.UserMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMenuMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UserMenu", JSImport.Default)
  @js.native
  val default: FC[UserMenuProps] = js.native
  
  type _To = FC[UserMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `userMenuMod.foo` */
  override def _to: FC[UserMenuProps] = default
}
