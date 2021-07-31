package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yandexEnMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YandexEn", JSImport.Default)
  @js.native
  val default: SFC[YandexEnProps] = js.native
  
  trait YandexEnProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object YandexEnProps {
    
    @scala.inline
    def apply(): YandexEnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YandexEnProps]
    }
    
    @scala.inline
    implicit class YandexEnPropsMutableBuilder[Self <: YandexEnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[YandexEnProps]
  
  /* This means you don't have to write `default`, but can instead just say `yandexEnMod.foo` */
  override def _to: SFC[YandexEnProps] = default
}
