package typings.stripe.mod.issuing.authorizations

import typings.stripe.stripeStrings.`match`
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.failure
import typings.stripe.stripeStrings.mismatch
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.not_provided
import typings.stripe.stripeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerificationData extends js.Object {
  
  /**
    * One of match, mismatch, or not_provided.
    */
  var address_line1_check: `match` | mismatch | not_provided = js.native
  
  /**
    * One of match, mismatch, or not_provided.
    */
  var address_zip_check: `match` | mismatch | not_provided = js.native
  
  /**
    * One of exempt, failure, none, or success.
    */
  var authentication: exempt | failure | none | success = js.native
  
  /**
    * One of match, mismatch, or not_provided.
    */
  var cvc_check: `match` | mismatch | not_provided = js.native
}
object VerificationData {
  
  @scala.inline
  def apply(
    address_line1_check: `match` | mismatch | not_provided,
    address_zip_check: `match` | mismatch | not_provided,
    authentication: exempt | failure | none | success,
    cvc_check: `match` | mismatch | not_provided
  ): VerificationData = {
    val __obj = js.Dynamic.literal(address_line1_check = address_line1_check.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationData]
  }
  
  @scala.inline
  implicit class VerificationDataOps[Self <: VerificationData] (val x: Self) extends AnyVal {
    
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
    def setAddress_line1_check(value: `match` | mismatch | not_provided): Self = this.set("address_line1_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zip_check(value: `match` | mismatch | not_provided): Self = this.set("address_zip_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthentication(value: exempt | failure | none | success): Self = this.set("authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvc_check(value: `match` | mismatch | not_provided): Self = this.set("cvc_check", value.asInstanceOf[js.Any])
  }
}
