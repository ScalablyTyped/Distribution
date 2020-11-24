package typings.stripejs.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanMakePaymentResult extends js.Object {
  
  /**
    * true if the browser payment API supports Apple Pay.
    * NOTE: using the paymentRequestButton Element is automatically cross-browser.
    * If you use this PaymentRequest object to create a paymentRequestButton Element, you don‘t need to check applePay yourself
    */
  val applePay: Boolean = js.native
}
object CanMakePaymentResult {
  
  @scala.inline
  def apply(applePay: Boolean): CanMakePaymentResult = {
    val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanMakePaymentResult]
  }
  
  @scala.inline
  implicit class CanMakePaymentResultOps[Self <: CanMakePaymentResult] (val x: Self) extends AnyVal {
    
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
    def setApplePay(value: Boolean): Self = this.set("applePay", value.asInstanceOf[js.Any])
  }
}
