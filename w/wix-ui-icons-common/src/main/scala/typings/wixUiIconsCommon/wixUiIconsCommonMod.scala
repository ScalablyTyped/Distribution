package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.accessibilityMod.AccessibilityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Accessibility", JSImport.Default)
  @js.native
  val default: SFC[AccessibilityProps] = js.native
  
  type _To = SFC[AccessibilityProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonMod.foo` */
  override def _to: SFC[AccessibilityProps] = default
}
