package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.chatMod.ChatProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonChatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Chat", JSImport.Default)
  @js.native
  val default: SFC[ChatProps] = js.native
  
  type _To = SFC[ChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonChatMod.foo` */
  override def _to: SFC[ChatProps] = default
}
