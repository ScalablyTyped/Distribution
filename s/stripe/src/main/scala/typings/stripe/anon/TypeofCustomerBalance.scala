package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomerBalance extends StObject {
  
  val BankTransfer: TypeofBankTransfer
}
object TypeofCustomerBalance {
  
  inline def apply(BankTransfer: TypeofBankTransfer): TypeofCustomerBalance = {
    val __obj = js.Dynamic.literal(BankTransfer = BankTransfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomerBalance]
  }
  
  extension [Self <: TypeofCustomerBalance](x: Self) {
    
    inline def setBankTransfer(value: TypeofBankTransfer): Self = StObject.set(x, "BankTransfer", value.asInstanceOf[js.Any])
  }
}
