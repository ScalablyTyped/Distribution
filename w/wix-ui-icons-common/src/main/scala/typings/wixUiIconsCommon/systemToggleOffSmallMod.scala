package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.toggleOffSmallMod.ToggleOffSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemToggleOffSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/ToggleOffSmall", JSImport.Default)
  @js.native
  val default: SFC[ToggleOffSmallProps] = js.native
  
  type _To = SFC[ToggleOffSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemToggleOffSmallMod.foo` */
  override def _to: SFC[ToggleOffSmallProps] = default
}
