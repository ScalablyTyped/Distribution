package typings.stripejs.elementMod

import typings.stripejs.anon.Base
import typings.stripejs.anon.Complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentButtonOptions extends js.Object {
  
  /**
    * Set custom class names on the container DOM element when the Stripe Element is in a
    * particular state.
    */
  var classes: js.UndefOr[Base] = js.native
  
  var paymentRequest: js.Any = js.native
  
  var style: js.UndefOr[Complete] = js.native
}
object PaymentButtonOptions {
  
  @scala.inline
  def apply(paymentRequest: js.Any): PaymentButtonOptions = {
    val __obj = js.Dynamic.literal(paymentRequest = paymentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentButtonOptions]
  }
  
  @scala.inline
  implicit class PaymentButtonOptionsOps[Self <: PaymentButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setPaymentRequest(value: js.Any): Self = this.set("paymentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: Base): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setStyle(value: Complete): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
