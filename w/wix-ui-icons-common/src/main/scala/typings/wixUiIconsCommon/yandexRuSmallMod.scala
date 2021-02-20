package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yandexRuSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YandexRuSmall", JSImport.Default)
  @js.native
  val default: SFC[YandexRuSmallProps] = js.native
  
  @js.native
  trait YandexRuSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object YandexRuSmallProps {
    
    @scala.inline
    def apply(): YandexRuSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YandexRuSmallProps]
    }
    
    @scala.inline
    implicit class YandexRuSmallPropsMutableBuilder[Self <: YandexRuSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[YandexRuSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `yandexRuSmallMod.foo` */
  override def _to: SFC[YandexRuSmallProps] = default
}
