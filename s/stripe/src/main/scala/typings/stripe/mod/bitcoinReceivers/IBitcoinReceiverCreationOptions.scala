package typings.stripe.mod.bitcoinReceivers

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitcoinReceiverCreationOptions extends IDataOptionsWithMetadata {
  
  /**
    * The amount of currency that you will be paid.
    */
  var amount: Double = js.native
  
  /**
    * The currency to which the bitcoin will be converted. You will be paid out in this currency. Only USD is currently supported.
    */
  var currency: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  /**
    * The email address of the customer.
    */
  var email: String = js.native
  
  /**
    * A flag that indicates whether you would like Stripe to automatically handle refunds for any mispayments to the receiver.
    */
  var refund_mispayments: js.UndefOr[Boolean] = js.native
}
object IBitcoinReceiverCreationOptions {
  
  @scala.inline
  def apply(amount: Double, currency: String, email: String): IBitcoinReceiverCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitcoinReceiverCreationOptions]
  }
  
  @scala.inline
  implicit class IBitcoinReceiverCreationOptionsOps[Self <: IBitcoinReceiverCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setRefund_mispayments(value: Boolean): Self = this.set("refund_mispayments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefund_mispayments: Self = this.set("refund_mispayments", js.undefined)
  }
}
