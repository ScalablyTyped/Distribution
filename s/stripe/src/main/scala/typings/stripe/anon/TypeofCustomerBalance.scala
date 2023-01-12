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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCustomerBalance] (val x: Self) extends AnyVal {
    
    inline def setBankTransfer(value: TypeofBankTransfer): Self = StObject.set(x, "BankTransfer", value.asInstanceOf[js.Any])
  }
}
