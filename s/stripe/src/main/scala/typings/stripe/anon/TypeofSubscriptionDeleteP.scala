package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionDeleteP extends StObject {
  
  val CancellationDetails: Any
}
object TypeofSubscriptionDeleteP {
  
  inline def apply(CancellationDetails: Any): TypeofSubscriptionDeleteP = {
    val __obj = js.Dynamic.literal(CancellationDetails = CancellationDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionDeleteP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionDeleteP] (val x: Self) extends AnyVal {
    
    inline def setCancellationDetails(value: Any): Self = StObject.set(x, "CancellationDetails", value.asInstanceOf[js.Any])
  }
}
