package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsChatBoldMod.ChatBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ChatBold", JSImport.Default)
  @js.native
  val default: FC[ChatBoldProps] = js.native
  
  type _To = FC[ChatBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatBoldMod.foo` */
  override def _to: FC[ChatBoldProps] = default
}
