package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPaymentSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PaymentSmall", JSImport.Default)
  @js.native
  val default: FC[PaymentSmallProps] = js.native
  
  trait PaymentSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PaymentSmallProps {
    
    inline def apply(): PaymentSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PaymentSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPaymentSmallMod.foo` */
  override def _to: FC[PaymentSmallProps] = default
}
