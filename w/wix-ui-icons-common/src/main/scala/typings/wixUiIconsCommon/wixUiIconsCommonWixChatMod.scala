package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.wixChatMod.WixChatProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonWixChatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/WixChat", JSImport.Default)
  @js.native
  val default: SFC[WixChatProps] = js.native
  
  type _To = SFC[WixChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonWixChatMod.foo` */
  override def _to: SFC[WixChatProps] = default
}
