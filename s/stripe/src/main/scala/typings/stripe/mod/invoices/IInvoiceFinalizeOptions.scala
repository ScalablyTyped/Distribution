package typings.stripe.mod.invoices

import typings.stripe.mod.IDataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInvoiceFinalizeOptions
  extends StObject
     with IDataOptions {
  
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: Boolean
}
object IInvoiceFinalizeOptions {
  
  inline def apply(auto_advance: Boolean): IInvoiceFinalizeOptions = {
    val __obj = js.Dynamic.literal(auto_advance = auto_advance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceFinalizeOptions]
  }
  
  extension [Self <: IInvoiceFinalizeOptions](x: Self) {
    
    inline def setAuto_advance(value: Boolean): Self = StObject.set(x, "auto_advance", value.asInstanceOf[js.Any])
  }
}
