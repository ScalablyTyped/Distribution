package typings.symphonyApiClientNode.signalsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalSubscriptionResult extends js.Object {
  
  var failedSubscription: Double = js.native
  
  var requestedSubscription: Double = js.native
  
  var subscriptionErrors: js.Array[_] = js.native
  
  var successfulSubscription: Double = js.native
}
object SignalSubscriptionResult {
  
  @scala.inline
  def apply(
    failedSubscription: Double,
    requestedSubscription: Double,
    subscriptionErrors: js.Array[_],
    successfulSubscription: Double
  ): SignalSubscriptionResult = {
    val __obj = js.Dynamic.literal(failedSubscription = failedSubscription.asInstanceOf[js.Any], requestedSubscription = requestedSubscription.asInstanceOf[js.Any], subscriptionErrors = subscriptionErrors.asInstanceOf[js.Any], successfulSubscription = successfulSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalSubscriptionResult]
  }
  
  @scala.inline
  implicit class SignalSubscriptionResultOps[Self <: SignalSubscriptionResult] (val x: Self) extends AnyVal {
    
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
    def setFailedSubscription(value: Double): Self = this.set("failedSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedSubscription(value: Double): Self = this.set("requestedSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionErrorsVarargs(value: js.Any*): Self = this.set("subscriptionErrors", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptionErrors(value: js.Array[_]): Self = this.set("subscriptionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulSubscription(value: Double): Self = this.set("successfulSubscription", value.asInstanceOf[js.Any])
  }
}
