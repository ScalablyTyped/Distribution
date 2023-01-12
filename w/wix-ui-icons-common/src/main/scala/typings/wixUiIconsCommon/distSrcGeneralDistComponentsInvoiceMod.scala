package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsInvoiceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Invoice", JSImport.Default)
  @js.native
  val default: FC[InvoiceProps] = js.native
  
  trait InvoiceProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InvoiceProps {
    
    inline def apply(): InvoiceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvoiceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvoiceProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InvoiceProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsInvoiceMod.foo` */
  override def _to: FC[InvoiceProps] = default
}
