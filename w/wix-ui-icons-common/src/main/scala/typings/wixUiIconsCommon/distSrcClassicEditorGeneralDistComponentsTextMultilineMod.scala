package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsTextMultilineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/TextMultiline", JSImport.Default)
  @js.native
  val default: FC[TextMultilineProps] = js.native
  
  trait TextMultilineProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextMultilineProps {
    
    inline def apply(): TextMultilineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextMultilineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextMultilineProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextMultilineProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsTextMultilineMod.foo` */
  override def _to: FC[TextMultilineProps] = default
}
