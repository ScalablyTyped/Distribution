package typings.stripejs.sourceMod

import typings.stripejs.stripejsStrings.declined
import typings.stripejs.stripejsStrings.failed
import typings.stripejs.stripejsStrings.not_required
import typings.stripejs.stripejsStrings.pending
import typings.stripejs.stripejsStrings.processing_error
import typings.stripejs.stripejsStrings.succeeded
import typings.stripejs.stripejsStrings.user_abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redirect extends js.Object {
  
  /**
    * The failure reason for the redirect
    * Present only if the redirect status is `'failed'`
    */
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.native
  
  /**
    * The URL you provide to redirect the customer to after they authenticated their payment
    */
  var return_url: String = js.native
  
  /**
    * The status of the redirect
    * - Pending: ready to be used by your customer to authenticate the transaction
    * - succeeded: succesful authentication, cannot be reused
    * - not_required: redirect should not be used
    * - failed: failed authentication, cannot be reused
    */
  var status: pending | succeeded | not_required | failed = js.native
  
  /**
    * The URL provided to you to redirect a customer to as part of a redirect
    * authentication flow
    */
  var url: String = js.native
}
object Redirect {
  
  @scala.inline
  def apply(return_url: String, status: pending | succeeded | not_required | failed, url: String): Redirect = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
    
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
