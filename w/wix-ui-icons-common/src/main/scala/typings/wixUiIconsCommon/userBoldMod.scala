package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUserBoldMod.UserBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UserBold", JSImport.Default)
  @js.native
  val default: FC[UserBoldProps] = js.native
  
  type _To = FC[UserBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `userBoldMod.foo` */
  override def _to: FC[UserBoldProps] = default
}
