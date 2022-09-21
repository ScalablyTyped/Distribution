package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMultilineBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/TextMultilineBold", JSImport.Default)
  @js.native
  val default: FC[TextMultilineBoldProps] = js.native
  
  trait TextMultilineBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextMultilineBoldProps {
    
    inline def apply(): TextMultilineBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextMultilineBoldProps]
    }
    
    extension [Self <: TextMultilineBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextMultilineBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `textMultilineBoldMod.foo` */
  override def _to: FC[TextMultilineBoldProps] = default
}
