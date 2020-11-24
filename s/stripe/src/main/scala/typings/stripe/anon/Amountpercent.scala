package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amountpercent extends js.Object {
  
  /**
    * A non-negative decimal between 0 and 100, with at most two decimal places.
    * This represents the percentage of the subscription invoice subtotal that will be transferred to the destination account.
    * By default, the entire amount is transferred to the destination.
    */
  var amount_percent: js.UndefOr[Double] = js.native
  
  /**
    * ID of an existing, connected Stripe account.
    */
  var destination: String = js.native
}
object Amountpercent {
  
  @scala.inline
  def apply(destination: String): Amountpercent = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amountpercent]
  }
  
  @scala.inline
  implicit class AmountpercentOps[Self <: Amountpercent] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_percent(value: Double): Self = this.set("amount_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount_percent: Self = this.set("amount_percent", js.undefined)
  }
}
