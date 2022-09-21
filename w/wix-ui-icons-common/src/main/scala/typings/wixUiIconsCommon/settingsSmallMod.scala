package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSettingsSmallMod.SettingsSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SettingsSmall", JSImport.Default)
  @js.native
  val default: FC[SettingsSmallProps] = js.native
  
  type _To = FC[SettingsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `settingsSmallMod.foo` */
  override def _to: FC[SettingsSmallProps] = default
}
