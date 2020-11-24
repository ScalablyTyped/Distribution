package typings.stripe.mod.balance

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptionsCreated
import typings.stripe.stripeStrings.adjustment
import typings.stripe.stripeStrings.application_fee
import typings.stripe.stripeStrings.application_fee_refund
import typings.stripe.stripeStrings.charge
import typings.stripe.stripeStrings.network_cost
import typings.stripe.stripeStrings.payment
import typings.stripe.stripeStrings.payout
import typings.stripe.stripeStrings.payout_failure
import typings.stripe.stripeStrings.refund
import typings.stripe.stripeStrings.stripe_fee
import typings.stripe.stripeStrings.transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBalanceListOptions extends IListOptionsCreated {
  
  var available_on: js.UndefOr[String | IDateFilter] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  /**
    * For automatic Stripe payouts only, only returns transactions that were payed out on the specified payout ID.
    */
  var payout: js.UndefOr[String] = js.native
  
  /**
    * Only returns transactions that are related to the specified Stripe object ID
    * (e.g. filtering by a charge ID will return all related charge transactions).
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Only returns transactions of the given type.
    */
  var `type`: js.UndefOr[
    charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost
  ] = js.native
}
object IBalanceListOptions {
  
  @scala.inline
  def apply(): IBalanceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBalanceListOptions]
  }
  
  @scala.inline
  implicit class IBalanceListOptionsOps[Self <: IBalanceListOptions] (val x: Self) extends AnyVal {
    
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
    def setAvailable_on(value: String | IDateFilter): Self = this.set("available_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailable_on: Self = this.set("available_on", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setPayout(value: String): Self = this.set("payout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayout: Self = this.set("payout", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setType(
      value: charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
