package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsEmailSendMod.EmailSendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailSendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/EmailSend", JSImport.Default)
  @js.native
  val default: FC[EmailSendProps] = js.native
  
  type _To = FC[EmailSendProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailSendMod.foo` */
  override def _to: FC[EmailSendProps] = default
}
