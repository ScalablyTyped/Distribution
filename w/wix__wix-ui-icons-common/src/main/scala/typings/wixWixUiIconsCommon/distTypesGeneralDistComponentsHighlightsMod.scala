package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsHighlightsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Highlights", JSImport.Default)
  @js.native
  val default: FC[HighlightsProps] = js.native
  
  trait HighlightsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HighlightsProps {
    
    inline def apply(): HighlightsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightsProps]
    }
    
    extension [Self <: HighlightsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HighlightsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsHighlightsMod.foo` */
  override def _to: FC[HighlightsProps] = default
}
