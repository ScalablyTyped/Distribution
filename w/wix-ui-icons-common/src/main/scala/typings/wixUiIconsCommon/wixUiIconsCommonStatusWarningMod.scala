package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.statusWarningMod.StatusWarningProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonStatusWarningMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/StatusWarning", JSImport.Default)
  @js.native
  val default: SFC[StatusWarningProps] = js.native
  
  type _To = SFC[StatusWarningProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonStatusWarningMod.foo` */
  override def _to: SFC[StatusWarningProps] = default
}
