package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUpgradeMod.UpgradeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Upgrade", JSImport.Default)
  @js.native
  val default: FC[UpgradeProps] = js.native
  
  type _To = FC[UpgradeProps]
  
  /* This means you don't have to write `default`, but can instead just say `upgradeMod.foo` */
  override def _to: FC[UpgradeProps] = default
}
