package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.emailAlertMod.EmailAlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonEmailAlertMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/EmailAlert", JSImport.Default)
  @js.native
  val default: SFC[EmailAlertProps] = js.native
  
  type _To = SFC[EmailAlertProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonEmailAlertMod.foo` */
  override def _to: SFC[EmailAlertProps] = default
}
