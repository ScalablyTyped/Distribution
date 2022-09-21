package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofChargeUpdateParams extends StObject {
  
  val FraudDetails: Any
}
object TypeofChargeUpdateParams {
  
  inline def apply(FraudDetails: Any): TypeofChargeUpdateParams = {
    val __obj = js.Dynamic.literal(FraudDetails = FraudDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChargeUpdateParams]
  }
  
  extension [Self <: TypeofChargeUpdateParams](x: Self) {
    
    inline def setFraudDetails(value: Any): Self = StObject.set(x, "FraudDetails", value.asInstanceOf[js.Any])
  }
}
