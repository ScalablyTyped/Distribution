package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightColorMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/HighlightColor", JSImport.Default)
  @js.native
  val default: FC[HighlightColorProps] = js.native
  
  trait HighlightColorProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HighlightColorProps {
    
    inline def apply(): HighlightColorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightColorProps]
    }
    
    extension [Self <: HighlightColorProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HighlightColorProps]
  
  /* This means you don't have to write `default`, but can instead just say `highlightColorMod.foo` */
  override def _to: FC[HighlightColorProps] = default
}
