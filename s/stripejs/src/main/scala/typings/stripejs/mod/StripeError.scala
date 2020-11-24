package typings.stripejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeError extends js.Object {
  
  /**
    * For card errors, the ID of the failed charge
    */
  var charge: js.UndefOr[String] = js.native
  
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for the decline if they provide one
    */
  var decline_code: js.UndefOr[String] = js.native
  
  /**
    * A URL to more information about the error code reported
    */
  var doc_url: js.UndefOr[String] = js.native
  
  /**
    * A human-readable message providing more details about the error.
    * NOTE: For card errors, these messages can be shown to your users
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * If the error is parameter-specific, the parameter related to the error
    */
  var param: js.UndefOr[String] = js.native
  
  /**
    * The type of error that has occurred
    */
  var `type`: errorType = js.native
}
object StripeError {
  
  @scala.inline
  def apply(`type`: errorType): StripeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeError]
  }
  
  @scala.inline
  implicit class StripeErrorOps[Self <: StripeError] (val x: Self) extends AnyVal {
    
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
    def setType(value: errorType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharge(value: String): Self = this.set("charge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharge: Self = this.set("charge", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDecline_code(value: String): Self = this.set("decline_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecline_code: Self = this.set("decline_code", js.undefined)
    
    @scala.inline
    def setDoc_url(value: String): Self = this.set("doc_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc_url: Self = this.set("doc_url", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
}
