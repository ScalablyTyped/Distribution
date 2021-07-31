package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.settingsMod.SettingsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSettingsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Settings", JSImport.Default)
  @js.native
  val default: SFC[SettingsProps] = js.native
  
  type _To = SFC[SettingsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSettingsMod.foo` */
  override def _to: SFC[SettingsProps] = default
}
