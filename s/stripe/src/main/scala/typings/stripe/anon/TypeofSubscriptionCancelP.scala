package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionCancelP extends StObject {
  
  val CancellationDetails: Any
}
object TypeofSubscriptionCancelP {
  
  inline def apply(CancellationDetails: Any): TypeofSubscriptionCancelP = {
    val __obj = js.Dynamic.literal(CancellationDetails = CancellationDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionCancelP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionCancelP] (val x: Self) extends AnyVal {
    
    inline def setCancellationDetails(value: Any): Self = StObject.set(x, "CancellationDetails", value.asInstanceOf[js.Any])
  }
}
