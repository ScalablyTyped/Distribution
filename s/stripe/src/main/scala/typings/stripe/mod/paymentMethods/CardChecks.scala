package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.pass
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unchecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardChecks extends js.Object {
  
  /**
    * If a address line1 was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_line1_check: pass | failed | unavailable | unchecked | Null = js.native
  
  /**
    * If a address postal code was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_postal_code_check: pass | failed | unavailable | unchecked | Null = js.native
  
  /**
    * If a CVC was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var cvc_check: pass | failed | unavailable | unchecked | Null = js.native
}
object CardChecks {
  
  @scala.inline
  def apply(): CardChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardChecks]
  }
  
  @scala.inline
  implicit class CardChecksOps[Self <: CardChecks] (val x: Self) extends AnyVal {
    
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
    def setAddress_line1_check(value: pass | failed | unavailable | unchecked): Self = this.set("address_line1_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1_checkNull: Self = this.set("address_line1_check", null)
    
    @scala.inline
    def setAddress_postal_code_check(value: pass | failed | unavailable | unchecked): Self = this.set("address_postal_code_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_postal_code_checkNull: Self = this.set("address_postal_code_check", null)
    
    @scala.inline
    def setCvc_check(value: pass | failed | unavailable | unchecked): Self = this.set("cvc_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvc_checkNull: Self = this.set("cvc_check", null)
  }
}
