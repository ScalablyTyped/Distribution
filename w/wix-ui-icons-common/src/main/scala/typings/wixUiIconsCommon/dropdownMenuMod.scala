package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDropdownMenuMod.DropdownMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DropdownMenu", JSImport.Default)
  @js.native
  val default: FC[DropdownMenuProps] = js.native
  
  type _To = FC[DropdownMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownMenuMod.foo` */
  override def _to: FC[DropdownMenuProps] = default
}
