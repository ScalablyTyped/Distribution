package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.emailSendMod.EmailSendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonEmailSendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/EmailSend", JSImport.Default)
  @js.native
  val default: SFC[EmailSendProps] = js.native
  
  type _To = SFC[EmailSendProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonEmailSendMod.foo` */
  override def _to: SFC[EmailSendProps] = default
}
