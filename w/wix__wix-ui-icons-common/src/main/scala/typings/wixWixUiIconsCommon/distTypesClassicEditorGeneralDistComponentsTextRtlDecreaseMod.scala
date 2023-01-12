package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsTextRtlDecreaseMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/TextRtlDecrease", JSImport.Default)
  @js.native
  val default: FC[TextRtlDecreaseProps] = js.native
  
  trait TextRtlDecreaseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextRtlDecreaseProps {
    
    inline def apply(): TextRtlDecreaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextRtlDecreaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextRtlDecreaseProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextRtlDecreaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsTextRtlDecreaseMod.foo` */
  override def _to: FC[TextRtlDecreaseProps] = default
}
