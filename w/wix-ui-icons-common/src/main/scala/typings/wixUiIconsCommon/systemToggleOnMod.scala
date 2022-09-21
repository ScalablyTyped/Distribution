package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.toggleOnMod.ToggleOnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemToggleOnMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/ToggleOn", JSImport.Default)
  @js.native
  val default: FC[ToggleOnProps] = js.native
  
  type _To = FC[ToggleOnProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemToggleOnMod.foo` */
  override def _to: FC[ToggleOnProps] = default
}
