package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.userSearchMod.UserSearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonUserSearchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/UserSearch", JSImport.Default)
  @js.native
  val default: FC[UserSearchProps] = js.native
  
  type _To = FC[UserSearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonUserSearchMod.foo` */
  override def _to: FC[UserSearchProps] = default
}
