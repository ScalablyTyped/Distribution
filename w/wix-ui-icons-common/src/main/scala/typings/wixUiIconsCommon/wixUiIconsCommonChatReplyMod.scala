package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.chatReplyMod.ChatReplyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonChatReplyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/ChatReply", JSImport.Default)
  @js.native
  val default: SFC[ChatReplyProps] = js.native
  
  type _To = SFC[ChatReplyProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonChatReplyMod.foo` */
  override def _to: SFC[ChatReplyProps] = default
}
