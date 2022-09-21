package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSettingsLockedMod.SettingsLockedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsLockedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SettingsLocked", JSImport.Default)
  @js.native
  val default: FC[SettingsLockedProps] = js.native
  
  type _To = FC[SettingsLockedProps]
  
  /* This means you don't have to write `default`, but can instead just say `settingsLockedMod.foo` */
  override def _to: FC[SettingsLockedProps] = default
}
