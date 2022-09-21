package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsThemeManagerMod.ThemeManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeManagerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/ThemeManager", JSImport.Default)
  @js.native
  val default: FC[ThemeManagerProps] = js.native
  
  type _To = FC[ThemeManagerProps]
  
  /* This means you don't have to write `default`, but can instead just say `themeManagerMod.foo` */
  override def _to: FC[ThemeManagerProps] = default
}
