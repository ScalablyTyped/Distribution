package typings.stripe.mod.customerTaxIds

import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unverified
import typings.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaxIdVerification extends js.Object {
  
  /**
    * Verification status, one of pending, unavailable, unverified, or verified.
    */
  var status: pending | unavailable | unverified | verified = js.native
  
  /**
    * Verified address.
    */
  var verified_address: String = js.native
  
  /**
    * Verified name.
    */
  var verified_name: String = js.native
}
object ITaxIdVerification {
  
  @scala.inline
  def apply(
    status: pending | unavailable | unverified | verified,
    verified_address: String,
    verified_name: String
  ): ITaxIdVerification = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxIdVerification]
  }
  
  @scala.inline
  implicit class ITaxIdVerificationOps[Self <: ITaxIdVerification] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: pending | unavailable | unverified | verified): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_address(value: String): Self = this.set("verified_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
  }
}
