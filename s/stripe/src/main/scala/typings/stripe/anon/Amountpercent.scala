package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amountpercent extends StObject {
  
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
  implicit class AmountpercentMutableBuilder[Self <: Amountpercent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount_percent(value: Double): Self = StObject.set(x, "amount_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_percentUndefined: Self = StObject.set(x, "amount_percent", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
