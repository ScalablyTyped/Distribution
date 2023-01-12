package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomerUpdateParam extends StObject {
  
  val CashBalance: TypeofCashBalance
  
  val InvoiceSettings: TypeofInvoiceSettings
}
object TypeofCustomerUpdateParam {
  
  inline def apply(CashBalance: TypeofCashBalance, InvoiceSettings: TypeofInvoiceSettings): TypeofCustomerUpdateParam = {
    val __obj = js.Dynamic.literal(CashBalance = CashBalance.asInstanceOf[js.Any], InvoiceSettings = InvoiceSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomerUpdateParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCustomerUpdateParam] (val x: Self) extends AnyVal {
    
    inline def setCashBalance(value: TypeofCashBalance): Self = StObject.set(x, "CashBalance", value.asInstanceOf[js.Any])
    
    inline def setInvoiceSettings(value: TypeofInvoiceSettings): Self = StObject.set(x, "InvoiceSettings", value.asInstanceOf[js.Any])
  }
}
