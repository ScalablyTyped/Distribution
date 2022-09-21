package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUserPrivateMod.UserPrivateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPrivateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UserPrivate", JSImport.Default)
  @js.native
  val default: FC[UserPrivateProps] = js.native
  
  type _To = FC[UserPrivateProps]
  
  /* This means you don't have to write `default`, but can instead just say `userPrivateMod.foo` */
  override def _to: FC[UserPrivateProps] = default
}
