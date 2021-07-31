package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Payment", JSImport.Default)
  @js.native
  val default: SFC[PaymentProps] = js.native
  
  trait PaymentProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PaymentProps {
    
    @scala.inline
    def apply(): PaymentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentProps]
    }
    
    @scala.inline
    implicit class PaymentPropsMutableBuilder[Self <: PaymentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PaymentProps]
  
  /* This means you don't have to write `default`, but can instead just say `paymentMod.foo` */
  override def _to: SFC[PaymentProps] = default
}
