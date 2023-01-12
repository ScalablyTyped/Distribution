package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFunded extends StObject {
  
  val BankTransfer: Any
}
object TypeofFunded {
  
  inline def apply(BankTransfer: Any): TypeofFunded = {
    val __obj = js.Dynamic.literal(BankTransfer = BankTransfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFunded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFunded] (val x: Self) extends AnyVal {
    
    inline def setBankTransfer(value: Any): Self = StObject.set(x, "BankTransfer", value.asInstanceOf[js.Any])
  }
}
