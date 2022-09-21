package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBankTransferFinancialAddress extends StObject {
  
  val FinancialAddress: Any
}
object TypeofBankTransferFinancialAddress {
  
  inline def apply(FinancialAddress: Any): TypeofBankTransferFinancialAddress = {
    val __obj = js.Dynamic.literal(FinancialAddress = FinancialAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBankTransferFinancialAddress]
  }
  
  extension [Self <: TypeofBankTransferFinancialAddress](x: Self) {
    
    inline def setFinancialAddress(value: Any): Self = StObject.set(x, "FinancialAddress", value.asInstanceOf[js.Any])
  }
}
