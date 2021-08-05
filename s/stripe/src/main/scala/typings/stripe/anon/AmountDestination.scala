package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountDestination extends StObject {
  
  /**
    * The amount transferred to the destination account, if specified.
    * By default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[Double] = js.undefined
  
  /**
    * ID of an existing, connected Stripe account.
    */
  var destination: String
}
object AmountDestination {
  
  inline def apply(destination: String): AmountDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountDestination]
  }
  
  extension [Self <: AmountDestination](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
