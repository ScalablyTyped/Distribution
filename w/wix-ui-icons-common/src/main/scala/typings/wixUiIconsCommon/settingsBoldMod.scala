package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSettingsBoldMod.SettingsBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SettingsBold", JSImport.Default)
  @js.native
  val default: FC[SettingsBoldProps] = js.native
  
  type _To = FC[SettingsBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `settingsBoldMod.foo` */
  override def _to: FC[SettingsBoldProps] = default
}
