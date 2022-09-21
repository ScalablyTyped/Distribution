package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsButtonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Button", JSImport.Default)
  @js.native
  val default: FC[ButtonProps] = js.native
  
  type _To = FC[ButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonMod.foo` */
  override def _to: FC[ButtonProps] = default
}
