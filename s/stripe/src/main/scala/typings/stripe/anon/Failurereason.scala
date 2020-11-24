package typings.stripe.anon

import typings.stripe.stripeStrings.declined
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.not_required
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.processing_error
import typings.stripe.stripeStrings.succeeded
import typings.stripe.stripeStrings.user_abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Failurereason extends js.Object {
  
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.native
  
  var return_url: String = js.native
  
  var status: pending | succeeded | not_required | failed = js.native
  
  var url: String = js.native
}
object Failurereason {
  
  @scala.inline
  def apply(return_url: String, status: pending | succeeded | not_required | failed, url: String): Failurereason = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failurereason]
  }
  
  @scala.inline
  implicit class FailurereasonOps[Self <: Failurereason] (val x: Self) extends AnyVal {
    
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
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending | succeeded | not_required | failed): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_reason(value: user_abort | declined | processing_error): Self = this.set("failure_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure_reason: Self = this.set("failure_reason", js.undefined)
  }
}
