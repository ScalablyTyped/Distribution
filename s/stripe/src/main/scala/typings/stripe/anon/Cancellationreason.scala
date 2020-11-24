package typings.stripe.anon

import typings.stripe.mod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancellationreason extends js.Object {
  
  var cancellation_reason: js.UndefOr[PaymentIntentUserProvidedCancellationReason] = js.native
}
object Cancellationreason {
  
  @scala.inline
  def apply(): Cancellationreason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancellationreason]
  }
  
  @scala.inline
  implicit class CancellationreasonOps[Self <: Cancellationreason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancellation_reason(value: PaymentIntentUserProvidedCancellationReason): Self = this.set("cancellation_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellation_reason: Self = this.set("cancellation_reason", js.undefined)
  }
}
