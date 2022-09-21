package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPresetsMod.PresetsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Presets", JSImport.Default)
  @js.native
  val default: FC[PresetsProps] = js.native
  
  type _To = FC[PresetsProps]
  
  /* This means you don't have to write `default`, but can instead just say `presetsMod.foo` */
  override def _to: FC[PresetsProps] = default
}
