package typings.stripejs.anon

import typings.stripejs.elementMod.PaymentRequestButtonStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete extends js.Object {
  
  var base: js.UndefOr[PaymentRequestButtonStyle] = js.native
  
  var complete: js.UndefOr[PaymentRequestButtonStyle] = js.native
  
  var empty: js.UndefOr[PaymentRequestButtonStyle] = js.native
  
  var invalid: js.UndefOr[PaymentRequestButtonStyle] = js.native
  
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyle] = js.native
}
object Complete {
  
  @scala.inline
  def apply(): Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete]
  }
  
  @scala.inline
  implicit class CompleteOps[Self <: Complete] (val x: Self) extends AnyVal {
    
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
    def setBase(value: PaymentRequestButtonStyle): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setComplete(value: PaymentRequestButtonStyle): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setEmpty(value: PaymentRequestButtonStyle): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setInvalid(value: PaymentRequestButtonStyle): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setPaymentRequestButton(value: PaymentRequestButtonStyle): Self = this.set("paymentRequestButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentRequestButton: Self = this.set("paymentRequestButton", js.undefined)
  }
}
