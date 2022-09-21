package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Input", JSImport.Default)
  @js.native
  val default: FC[InputProps] = js.native
  
  type _To = FC[InputProps]
  
  /* This means you don't have to write `default`, but can instead just say `inputMod.foo` */
  override def _to: FC[InputProps] = default
}
