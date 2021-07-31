package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.hiddenMod.HiddenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonHiddenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Hidden", JSImport.Default)
  @js.native
  val default: SFC[HiddenProps] = js.native
  
  type _To = SFC[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonHiddenMod.foo` */
  override def _to: SFC[HiddenProps] = default
}
