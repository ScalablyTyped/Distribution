package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.userMod.UserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonUserMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/User", JSImport.Default)
  @js.native
  val default: SFC[UserProps] = js.native
  
  type _To = SFC[UserProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonUserMod.foo` */
  override def _to: SFC[UserProps] = default
}
