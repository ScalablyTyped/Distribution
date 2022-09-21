package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAccessibilityMod.AccessibilityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibilityMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Accessibility", JSImport.Default)
  @js.native
  val default: FC[AccessibilityProps] = js.native
  
  type _To = FC[AccessibilityProps]
  
  /* This means you don't have to write `default`, but can instead just say `accessibilityMod.foo` */
  override def _to: FC[AccessibilityProps] = default
}
