package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.attachmentMod.AttachmentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonAttachmentMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Attachment", JSImport.Default)
  @js.native
  val default: FC[AttachmentProps] = js.native
  
  type _To = FC[AttachmentProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonAttachmentMod.foo` */
  override def _to: FC[AttachmentProps] = default
}
