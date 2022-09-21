package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.checkboxCheckedMod.CheckboxCheckedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCheckboxCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/CheckboxChecked", JSImport.Default)
  @js.native
  val default: FC[CheckboxCheckedProps] = js.native
  
  type _To = FC[CheckboxCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCheckboxCheckedMod.foo` */
  override def _to: FC[CheckboxCheckedProps] = default
}
