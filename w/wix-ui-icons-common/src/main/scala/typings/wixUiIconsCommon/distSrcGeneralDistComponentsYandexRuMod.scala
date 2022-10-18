package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsYandexRuMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YandexRu", JSImport.Default)
  @js.native
  val default: FC[YandexRuProps] = js.native
  
  trait YandexRuProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object YandexRuProps {
    
    inline def apply(): YandexRuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YandexRuProps]
    }
    
    extension [Self <: YandexRuProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[YandexRuProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsYandexRuMod.foo` */
  override def _to: FC[YandexRuProps] = default
}
