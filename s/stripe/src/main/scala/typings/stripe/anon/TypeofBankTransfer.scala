package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBankTransfer extends StObject {
  
  val EuBankTransfer: Any
}
object TypeofBankTransfer {
  
  inline def apply(EuBankTransfer: Any): TypeofBankTransfer = {
    val __obj = js.Dynamic.literal(EuBankTransfer = EuBankTransfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBankTransfer]
  }
  
  extension [Self <: TypeofBankTransfer](x: Self) {
    
    inline def setEuBankTransfer(value: Any): Self = StObject.set(x, "EuBankTransfer", value.asInstanceOf[js.Any])
  }
}
