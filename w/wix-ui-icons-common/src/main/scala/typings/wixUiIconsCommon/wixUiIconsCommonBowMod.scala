package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.bowMod.BowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonBowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Bow", JSImport.Default)
  @js.native
  val default: FC[BowProps] = js.native
  
  type _To = FC[BowProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonBowMod.foo` */
  override def _to: FC[BowProps] = default
}
