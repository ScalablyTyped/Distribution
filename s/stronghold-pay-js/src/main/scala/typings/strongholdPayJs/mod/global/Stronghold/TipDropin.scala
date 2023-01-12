package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TipDropin
  extends StObject
     with TipDataDropin {
  
  var chargeId: String
  
  var paymentSourceId: String
}
object TipDropin {
  
  inline def apply(amount: Double, beneficiaryName: String, chargeId: String, paymentSourceId: String): TipDropin = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], beneficiaryName = beneficiaryName.asInstanceOf[js.Any], chargeId = chargeId.asInstanceOf[js.Any], paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipDropin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TipDropin] (val x: Self) extends AnyVal {
    
    inline def setChargeId(value: String): Self = StObject.set(x, "chargeId", value.asInstanceOf[js.Any])
    
    inline def setPaymentSourceId(value: String): Self = StObject.set(x, "paymentSourceId", value.asInstanceOf[js.Any])
  }
}
