package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSettingsMod.SettingsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classicEditorSettingsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Settings", JSImport.Default)
  @js.native
  val default: FC[SettingsProps] = js.native
  
  type _To = FC[SettingsProps]
  
  /* This means you don't have to write `default`, but can instead just say `classicEditorSettingsMod.foo` */
  override def _to: FC[SettingsProps] = default
}
