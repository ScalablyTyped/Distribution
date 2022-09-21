package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.hiddenMod.HiddenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonHiddenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Hidden", JSImport.Default)
  @js.native
  val default: FC[HiddenProps] = js.native
  
  type _To = FC[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonHiddenMod.foo` */
  override def _to: FC[HiddenProps] = default
}
