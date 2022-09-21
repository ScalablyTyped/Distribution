package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUserPrivateSmallMod.UserPrivateSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPrivateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UserPrivateSmall", JSImport.Default)
  @js.native
  val default: FC[UserPrivateSmallProps] = js.native
  
  type _To = FC[UserPrivateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userPrivateSmallMod.foo` */
  override def _to: FC[UserPrivateSmallProps] = default
}
