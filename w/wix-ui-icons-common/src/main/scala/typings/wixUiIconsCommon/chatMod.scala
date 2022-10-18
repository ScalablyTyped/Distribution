package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsChatMod.ChatProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Chat", JSImport.Default)
  @js.native
  val default: FC[ChatProps] = js.native
  
  type _To = FC[ChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatMod.foo` */
  override def _to: FC[ChatProps] = default
}
