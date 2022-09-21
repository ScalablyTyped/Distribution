package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomerCreateParam extends StObject {
  
  val CashBalance: TypeofCashBalance
  
  val InvoiceSettings: TypeofInvoiceSettings
  
  val TaxIdDatum: Any
}
object TypeofCustomerCreateParam {
  
  inline def apply(CashBalance: TypeofCashBalance, InvoiceSettings: TypeofInvoiceSettings, TaxIdDatum: Any): TypeofCustomerCreateParam = {
    val __obj = js.Dynamic.literal(CashBalance = CashBalance.asInstanceOf[js.Any], InvoiceSettings = InvoiceSettings.asInstanceOf[js.Any], TaxIdDatum = TaxIdDatum.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomerCreateParam]
  }
  
  extension [Self <: TypeofCustomerCreateParam](x: Self) {
    
    inline def setCashBalance(value: TypeofCashBalance): Self = StObject.set(x, "CashBalance", value.asInstanceOf[js.Any])
    
    inline def setInvoiceSettings(value: TypeofInvoiceSettings): Self = StObject.set(x, "InvoiceSettings", value.asInstanceOf[js.Any])
    
    inline def setTaxIdDatum(value: Any): Self = StObject.set(x, "TaxIdDatum", value.asInstanceOf[js.Any])
  }
}
