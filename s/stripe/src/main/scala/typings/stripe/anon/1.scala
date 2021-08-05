package typings.stripe.anon

import typings.stripe.mod.setupIntents.SetupIntentCancelationReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setCancellation_reason(value: SetupIntentCancelationReason): Self = StObject.set(x, "cancellation_reason", value.asInstanceOf[js.Any])
    
    inline def setCancellation_reasonUndefined: Self = StObject.set(x, "cancellation_reason", js.undefined)
  }
}
