package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.richTextMod.RichTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonRichTextMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/RichText", JSImport.Default)
  @js.native
  val default: FC[RichTextProps] = js.native
  
  type _To = FC[RichTextProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonRichTextMod.foo` */
  override def _to: FC[RichTextProps] = default
}
