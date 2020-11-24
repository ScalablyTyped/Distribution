package typings.stripejs.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentItem extends js.Object {
  
  /**
    * The amount the user has to pay in the given currency
    * @see StripePaymentOptions.currency
    */
  var amount: Double = js.native
  
  /**
    * A text that should be shown to the user
    */
  var label: String = js.native
  
  /**
    * Whether or not the payment should be executed immediately
    * If you might change this amount later (for example, after you have calculated shipping costs), set this to `true`
    */
  var pending: js.UndefOr[Boolean] = js.native
}
object PaymentItem {
  
  @scala.inline
  def apply(amount: Double, label: String): PaymentItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentItem]
  }
  
  @scala.inline
  implicit class PaymentItemOps[Self <: PaymentItem] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
  }
}
