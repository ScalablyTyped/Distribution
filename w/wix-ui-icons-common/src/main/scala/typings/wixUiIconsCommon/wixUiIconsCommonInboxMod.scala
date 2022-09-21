package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.inboxMod.InboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonInboxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Inbox", JSImport.Default)
  @js.native
  val default: FC[InboxProps] = js.native
  
  type _To = FC[InboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonInboxMod.foo` */
  override def _to: FC[InboxProps] = default
}
