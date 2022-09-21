package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRichTextBoxMod.RichTextBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object richTextBoxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/RichTextBox", JSImport.Default)
  @js.native
  val default: FC[RichTextBoxProps] = js.native
  
  type _To = FC[RichTextBoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `richTextBoxMod.foo` */
  override def _to: FC[RichTextBoxProps] = default
}
