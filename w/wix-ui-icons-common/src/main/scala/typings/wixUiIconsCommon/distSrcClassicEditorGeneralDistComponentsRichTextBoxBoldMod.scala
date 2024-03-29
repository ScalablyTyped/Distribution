package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsRichTextBoxBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/RichTextBoxBold", JSImport.Default)
  @js.native
  val default: FC[RichTextBoxBoldProps] = js.native
  
  trait RichTextBoxBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RichTextBoxBoldProps {
    
    inline def apply(): RichTextBoxBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RichTextBoxBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RichTextBoxBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RichTextBoxBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsRichTextBoxBoldMod.foo` */
  override def _to: FC[RichTextBoxBoldProps] = default
}
