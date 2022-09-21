package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.multiSelectMod.MultiSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonMultiSelectMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/MultiSelect", JSImport.Default)
  @js.native
  val default: FC[MultiSelectProps] = js.native
  
  type _To = FC[MultiSelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonMultiSelectMod.foo` */
  override def _to: FC[MultiSelectProps] = default
}
