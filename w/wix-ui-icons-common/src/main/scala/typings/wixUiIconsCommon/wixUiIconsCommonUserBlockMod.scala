package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.userBlockMod.UserBlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonUserBlockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/UserBlock", JSImport.Default)
  @js.native
  val default: FC[UserBlockProps] = js.native
  
  type _To = FC[UserBlockProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonUserBlockMod.foo` */
  override def _to: FC[UserBlockProps] = default
}
