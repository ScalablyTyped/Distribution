package typings.stripe.anon

import typings.stripe.mod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancellationreason extends StObject {
  
  var cancellation_reason: js.UndefOr[PaymentIntentUserProvidedCancellationReason] = js.undefined
}
object Cancellationreason {
  
  inline def apply(): Cancellationreason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancellationreason]
  }
  
  extension [Self <: Cancellationreason](x: Self) {
    
    inline def setCancellation_reason(value: PaymentIntentUserProvidedCancellationReason): Self = StObject.set(x, "cancellation_reason", value.asInstanceOf[js.Any])
    
    inline def setCancellation_reasonUndefined: Self = StObject.set(x, "cancellation_reason", js.undefined)
  }
}
