package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsTextLtrDecreaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/TextLtrDecrease", JSImport.Default)
  @js.native
  val default: FC[TextLtrDecreaseProps] = js.native
  
  trait TextLtrDecreaseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextLtrDecreaseProps {
    
    inline def apply(): TextLtrDecreaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextLtrDecreaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextLtrDecreaseProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextLtrDecreaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsTextLtrDecreaseMod.foo` */
  override def _to: FC[TextLtrDecreaseProps] = default
}
