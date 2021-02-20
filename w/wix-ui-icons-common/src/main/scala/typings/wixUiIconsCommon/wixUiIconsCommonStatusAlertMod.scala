package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.statusAlertMod.StatusAlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonStatusAlertMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/StatusAlert", JSImport.Default)
  @js.native
  val default: SFC[StatusAlertProps] = js.native
  
  type _To = SFC[StatusAlertProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonStatusAlertMod.foo` */
  override def _to: SFC[StatusAlertProps] = default
}
