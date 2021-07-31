package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.toggleOnSmallMod.ToggleOnSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemToggleOnSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/ToggleOnSmall", JSImport.Default)
  @js.native
  val default: SFC[ToggleOnSmallProps] = js.native
  
  type _To = SFC[ToggleOnSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemToggleOnSmallMod.foo` */
  override def _to: SFC[ToggleOnSmallProps] = default
}
