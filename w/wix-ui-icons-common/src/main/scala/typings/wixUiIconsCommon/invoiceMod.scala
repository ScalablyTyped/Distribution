package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invoiceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Invoice", JSImport.Default)
  @js.native
  val default: SFC[InvoiceProps] = js.native
  
  trait InvoiceProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object InvoiceProps {
    
    inline def apply(): InvoiceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvoiceProps]
    }
    
    extension [Self <: InvoiceProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[InvoiceProps]
  
  /* This means you don't have to write `default`, but can instead just say `invoiceMod.foo` */
  override def _to: SFC[InvoiceProps] = default
}
