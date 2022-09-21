package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUsersSmallMod.UsersSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UsersSmall", JSImport.Default)
  @js.native
  val default: FC[UsersSmallProps] = js.native
  
  type _To = FC[UsersSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `usersSmallMod.foo` */
  override def _to: FC[UsersSmallProps] = default
}
