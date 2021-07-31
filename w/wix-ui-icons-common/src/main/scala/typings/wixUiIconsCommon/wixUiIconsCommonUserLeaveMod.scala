package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.userLeaveMod.UserLeaveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonUserLeaveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/UserLeave", JSImport.Default)
  @js.native
  val default: SFC[UserLeaveProps] = js.native
  
  type _To = SFC[UserLeaveProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonUserLeaveMod.foo` */
  override def _to: SFC[UserLeaveProps] = default
}
