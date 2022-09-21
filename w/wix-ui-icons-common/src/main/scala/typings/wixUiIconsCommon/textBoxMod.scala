package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextBoxMod.TextBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textBoxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextBox", JSImport.Default)
  @js.native
  val default: FC[TextBoxProps] = js.native
  
  type _To = FC[TextBoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `textBoxMod.foo` */
  override def _to: FC[TextBoxProps] = default
}
