package typings.stripe.mod.transferReversals

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReversalCreationOptions extends IDataOptionsWithMetadata {
  
  /**
    * A positive integer in cents/pence representing how much of this transfer to reverse. Can only reverse up to the unreversed amount
    * remaining of the transfer. Partial transfer reversals are only allowed for transfers to Stripe Accounts.
    */
  var amount: js.UndefOr[Double] = js.native
  
  /**
    * An arbitrary string which you can attach to a reversal object. It is displayed alongside the reversal in the dashboard. This will
    * be unset if you POST an empty value.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full transfer reversal is
    * given, the full application fee will be refunded. Otherwise, the application fee will be refunded with an amount proportional to
    * the amount of the transfer reversed.
    */
  var refund_application_fee: js.UndefOr[Boolean] = js.native
}
object IReversalCreationOptions {
  
  @scala.inline
  def apply(): IReversalCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReversalCreationOptions]
  }
  
  @scala.inline
  implicit class IReversalCreationOptionsOps[Self <: IReversalCreationOptions] (val x: Self) extends AnyVal {
    
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
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setRefund_application_fee(value: Boolean): Self = this.set("refund_application_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefund_application_fee: Self = this.set("refund_application_fee", js.undefined)
  }
}
