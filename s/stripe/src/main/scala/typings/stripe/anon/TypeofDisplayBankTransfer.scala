package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDisplayBankTransfer extends StObject {
  
  val FinancialAddress: Any
}
object TypeofDisplayBankTransfer {
  
  inline def apply(FinancialAddress: Any): TypeofDisplayBankTransfer = {
    val __obj = js.Dynamic.literal(FinancialAddress = FinancialAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDisplayBankTransfer]
  }
  
  extension [Self <: TypeofDisplayBankTransfer](x: Self) {
    
    inline def setFinancialAddress(value: Any): Self = StObject.set(x, "FinancialAddress", value.asInstanceOf[js.Any])
  }
}
