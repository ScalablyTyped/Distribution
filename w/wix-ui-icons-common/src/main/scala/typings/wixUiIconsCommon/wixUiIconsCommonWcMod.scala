package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.wcMod.WcProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonWcMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Wc", JSImport.Default)
  @js.native
  val default: FC[WcProps] = js.native
  
  type _To = FC[WcProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonWcMod.foo` */
  override def _to: FC[WcProps] = default
}
