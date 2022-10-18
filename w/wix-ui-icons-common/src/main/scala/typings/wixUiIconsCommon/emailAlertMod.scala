package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsEmailAlertMod.EmailAlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailAlertMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/EmailAlert", JSImport.Default)
  @js.native
  val default: FC[EmailAlertProps] = js.native
  
  type _To = FC[EmailAlertProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailAlertMod.foo` */
  override def _to: FC[EmailAlertProps] = default
}
