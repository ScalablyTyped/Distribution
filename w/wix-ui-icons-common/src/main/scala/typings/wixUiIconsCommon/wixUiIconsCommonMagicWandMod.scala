package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.magicWandMod.MagicWandProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonMagicWandMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/MagicWand", JSImport.Default)
  @js.native
  val default: FC[MagicWandProps] = js.native
  
  type _To = FC[MagicWandProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonMagicWandMod.foo` */
  override def _to: FC[MagicWandProps] = default
}
