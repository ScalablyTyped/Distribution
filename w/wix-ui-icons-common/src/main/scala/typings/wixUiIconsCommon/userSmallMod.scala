package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUserSmallMod.UserSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UserSmall", JSImport.Default)
  @js.native
  val default: FC[UserSmallProps] = js.native
  
  type _To = FC[UserSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userSmallMod.foo` */
  override def _to: FC[UserSmallProps] = default
}
