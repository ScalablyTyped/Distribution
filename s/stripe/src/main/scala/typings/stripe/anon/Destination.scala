package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * The amount transferred to the destination account, if specified. By
    * default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * ID of an existing, connected Stripe account to transfer funds to if
    * transfer_data was specified in the charge request.
    */
  var destination: String
}
object Destination {
  
  @scala.inline
  def apply(destination: String): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountNull: Self = StObject.set(x, "amount", null)
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
