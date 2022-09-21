package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUserChatBoldMod.UserChatBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userChatBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UserChatBold", JSImport.Default)
  @js.native
  val default: FC[UserChatBoldProps] = js.native
  
  type _To = FC[UserChatBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `userChatBoldMod.foo` */
  override def _to: FC[UserChatBoldProps] = default
}
