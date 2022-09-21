package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quoteSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/QuoteSmall", JSImport.Default)
  @js.native
  val default: FC[QuoteSmallProps] = js.native
  
  trait QuoteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object QuoteSmallProps {
    
    inline def apply(): QuoteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuoteSmallProps]
    }
    
    extension [Self <: QuoteSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[QuoteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `quoteSmallMod.foo` */
  override def _to: FC[QuoteSmallProps] = default
}
