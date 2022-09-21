package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofShippingRateUpdateP extends StObject {
  
  val FixedAmount: TypeofFixedAmount
}
object TypeofShippingRateUpdateP {
  
  inline def apply(FixedAmount: TypeofFixedAmount): TypeofShippingRateUpdateP = {
    val __obj = js.Dynamic.literal(FixedAmount = FixedAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofShippingRateUpdateP]
  }
  
  extension [Self <: TypeofShippingRateUpdateP](x: Self) {
    
    inline def setFixedAmount(value: TypeofFixedAmount): Self = StObject.set(x, "FixedAmount", value.asInstanceOf[js.Any])
  }
}
