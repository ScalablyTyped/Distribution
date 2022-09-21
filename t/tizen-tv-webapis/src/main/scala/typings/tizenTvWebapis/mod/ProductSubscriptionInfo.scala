package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductSubscriptionInfo extends StObject {
  
  var PaymentCycle: Double
  
  var PaymentCycleFrq: Double
  
  var PaymentCyclePeriod: String
}
object ProductSubscriptionInfo {
  
  inline def apply(PaymentCycle: Double, PaymentCycleFrq: Double, PaymentCyclePeriod: String): ProductSubscriptionInfo = {
    val __obj = js.Dynamic.literal(PaymentCycle = PaymentCycle.asInstanceOf[js.Any], PaymentCycleFrq = PaymentCycleFrq.asInstanceOf[js.Any], PaymentCyclePeriod = PaymentCyclePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductSubscriptionInfo]
  }
  
  extension [Self <: ProductSubscriptionInfo](x: Self) {
    
    inline def setPaymentCycle(value: Double): Self = StObject.set(x, "PaymentCycle", value.asInstanceOf[js.Any])
    
    inline def setPaymentCycleFrq(value: Double): Self = StObject.set(x, "PaymentCycleFrq", value.asInstanceOf[js.Any])
    
    inline def setPaymentCyclePeriod(value: String): Self = StObject.set(x, "PaymentCyclePeriod", value.asInstanceOf[js.Any])
  }
}
