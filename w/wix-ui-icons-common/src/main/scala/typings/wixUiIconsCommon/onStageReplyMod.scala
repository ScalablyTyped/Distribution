package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.replyMod.ReplyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageReplyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Reply", JSImport.Default)
  @js.native
  val default: FC[ReplyProps] = js.native
  
  type _To = FC[ReplyProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageReplyMod.foo` */
  override def _to: FC[ReplyProps] = default
}
