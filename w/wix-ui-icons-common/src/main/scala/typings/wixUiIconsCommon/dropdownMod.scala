package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDropdownMod.DropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Dropdown", JSImport.Default)
  @js.native
  val default: FC[DropdownProps] = js.native
  
  type _To = FC[DropdownProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownMod.foo` */
  override def _to: FC[DropdownProps] = default
}
