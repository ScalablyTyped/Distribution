package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsRichTextBoxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/RichTextBox", JSImport.Default)
  @js.native
  val default: FC[RichTextBoxProps] = js.native
  
  trait RichTextBoxProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RichTextBoxProps {
    
    inline def apply(): RichTextBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RichTextBoxProps]
    }
    
    extension [Self <: RichTextBoxProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RichTextBoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsRichTextBoxMod.foo` */
  override def _to: FC[RichTextBoxProps] = default
}
