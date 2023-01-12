package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDepositInsurance extends StObject {
  
  val StatusDetail: Any
}
object TypeofDepositInsurance {
  
  inline def apply(StatusDetail: Any): TypeofDepositInsurance = {
    val __obj = js.Dynamic.literal(StatusDetail = StatusDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDepositInsurance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDepositInsurance] (val x: Self) extends AnyVal {
    
    inline def setStatusDetail(value: Any): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
  }
}
