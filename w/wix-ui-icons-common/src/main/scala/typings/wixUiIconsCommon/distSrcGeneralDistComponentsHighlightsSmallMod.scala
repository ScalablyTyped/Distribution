package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsHighlightsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HighlightsSmall", JSImport.Default)
  @js.native
  val default: FC[HighlightsSmallProps] = js.native
  
  trait HighlightsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HighlightsSmallProps {
    
    inline def apply(): HighlightsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightsSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightsSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HighlightsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsHighlightsSmallMod.foo` */
  override def _to: FC[HighlightsSmallProps] = default
}
