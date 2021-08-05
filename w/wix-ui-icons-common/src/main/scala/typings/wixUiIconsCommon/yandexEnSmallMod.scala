package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yandexEnSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YandexEnSmall", JSImport.Default)
  @js.native
  val default: SFC[YandexEnSmallProps] = js.native
  
  trait YandexEnSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object YandexEnSmallProps {
    
    inline def apply(): YandexEnSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YandexEnSmallProps]
    }
    
    extension [Self <: YandexEnSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[YandexEnSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `yandexEnSmallMod.foo` */
  override def _to: SFC[YandexEnSmallProps] = default
}
