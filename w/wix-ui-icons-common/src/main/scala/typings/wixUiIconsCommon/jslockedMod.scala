package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsJslockedMod.JSLockedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jslockedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/JSLocked", JSImport.Default)
  @js.native
  val default: FC[JSLockedProps] = js.native
  
  type _To = FC[JSLockedProps]
  
  /* This means you don't have to write `default`, but can instead just say `jslockedMod.foo` */
  override def _to: FC[JSLockedProps] = default
}
