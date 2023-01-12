package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsTextRtlIncreaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/TextRtlIncrease", JSImport.Default)
  @js.native
  val default: FC[TextRtlIncreaseProps] = js.native
  
  trait TextRtlIncreaseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextRtlIncreaseProps {
    
    inline def apply(): TextRtlIncreaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextRtlIncreaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextRtlIncreaseProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextRtlIncreaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsTextRtlIncreaseMod.foo` */
  override def _to: FC[TextRtlIncreaseProps] = default
}
