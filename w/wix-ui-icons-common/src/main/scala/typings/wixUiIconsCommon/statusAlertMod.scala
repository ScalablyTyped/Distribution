package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsStatusAlertMod.StatusAlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusAlertMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/StatusAlert", JSImport.Default)
  @js.native
  val default: FC[StatusAlertProps] = js.native
  
  type _To = FC[StatusAlertProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusAlertMod.foo` */
  override def _to: FC[StatusAlertProps] = default
}
