package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.userAddMod.UserAddProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonUserAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/UserAdd", JSImport.Default)
  @js.native
  val default: SFC[UserAddProps] = js.native
  
  type _To = SFC[UserAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonUserAddMod.foo` */
  override def _to: SFC[UserAddProps] = default
}
