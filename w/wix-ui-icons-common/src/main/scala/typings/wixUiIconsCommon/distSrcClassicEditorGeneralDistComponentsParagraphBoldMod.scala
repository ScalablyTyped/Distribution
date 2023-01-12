package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsParagraphBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ParagraphBold", JSImport.Default)
  @js.native
  val default: FC[ParagraphBoldProps] = js.native
  
  trait ParagraphBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ParagraphBoldProps {
    
    inline def apply(): ParagraphBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParagraphBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParagraphBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ParagraphBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsParagraphBoldMod.foo` */
  override def _to: FC[ParagraphBoldProps] = default
}
