package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionCancel extends StObject {
  
  val CancellationReason: Any
}
object TypeofSubscriptionCancel {
  
  inline def apply(CancellationReason: Any): TypeofSubscriptionCancel = {
    val __obj = js.Dynamic.literal(CancellationReason = CancellationReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionCancel]
  }
  
  extension [Self <: TypeofSubscriptionCancel](x: Self) {
    
    inline def setCancellationReason(value: Any): Self = StObject.set(x, "CancellationReason", value.asInstanceOf[js.Any])
  }
}
