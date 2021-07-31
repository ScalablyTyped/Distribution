package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.toggleOffMod.ToggleOffProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemToggleOffMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/ToggleOff", JSImport.Default)
  @js.native
  val default: SFC[ToggleOffProps] = js.native
  
  type _To = SFC[ToggleOffProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemToggleOffMod.foo` */
  override def _to: SFC[ToggleOffProps] = default
}
