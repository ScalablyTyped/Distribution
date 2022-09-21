package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsParagraphMod.ParagraphProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paragraphMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Paragraph", JSImport.Default)
  @js.native
  val default: FC[ParagraphProps] = js.native
  
  type _To = FC[ParagraphProps]
  
  /* This means you don't have to write `default`, but can instead just say `paragraphMod.foo` */
  override def _to: FC[ParagraphProps] = default
}
