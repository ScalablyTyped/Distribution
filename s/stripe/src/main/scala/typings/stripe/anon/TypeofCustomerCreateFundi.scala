package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomerCreateFundi extends StObject {
  
  val BankTransfer: Any
}
object TypeofCustomerCreateFundi {
  
  inline def apply(BankTransfer: Any): TypeofCustomerCreateFundi = {
    val __obj = js.Dynamic.literal(BankTransfer = BankTransfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomerCreateFundi]
  }
  
  extension [Self <: TypeofCustomerCreateFundi](x: Self) {
    
    inline def setBankTransfer(value: Any): Self = StObject.set(x, "BankTransfer", value.asInstanceOf[js.Any])
  }
}
