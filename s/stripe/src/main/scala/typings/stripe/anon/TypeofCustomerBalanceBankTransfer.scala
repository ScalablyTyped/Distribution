package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomerBalanceBankTransfer extends StObject {
  
  val BankTransfer: Any
}
object TypeofCustomerBalanceBankTransfer {
  
  inline def apply(BankTransfer: Any): TypeofCustomerBalanceBankTransfer = {
    val __obj = js.Dynamic.literal(BankTransfer = BankTransfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomerBalanceBankTransfer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCustomerBalanceBankTransfer] (val x: Self) extends AnyVal {
    
    inline def setBankTransfer(value: Any): Self = StObject.set(x, "BankTransfer", value.asInstanceOf[js.Any])
  }
}
