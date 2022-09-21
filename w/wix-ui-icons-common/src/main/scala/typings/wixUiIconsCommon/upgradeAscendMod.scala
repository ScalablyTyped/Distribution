package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUpgradeAscendMod.UpgradeAscendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeAscendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/UpgradeAscend", JSImport.Default)
  @js.native
  val default: FC[UpgradeAscendProps] = js.native
  
  type _To = FC[UpgradeAscendProps]
  
  /* This means you don't have to write `default`, but can instead just say `upgradeAscendMod.foo` */
  override def _to: FC[UpgradeAscendProps] = default
}
