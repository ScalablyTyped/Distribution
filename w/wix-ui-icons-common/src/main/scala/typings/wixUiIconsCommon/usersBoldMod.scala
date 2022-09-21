package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUsersBoldMod.UsersBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UsersBold", JSImport.Default)
  @js.native
  val default: FC[UsersBoldProps] = js.native
  
  type _To = FC[UsersBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `usersBoldMod.foo` */
  override def _to: FC[UsersBoldProps] = default
}
