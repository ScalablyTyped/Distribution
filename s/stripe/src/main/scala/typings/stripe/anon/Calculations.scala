package typings.stripe.anon

import typings.stripe.mod.Stripe.Tax.CalculationsResource
import typings.stripe.mod.Stripe.Tax.TransactionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calculations extends StObject {
  
  var calculations: CalculationsResource
  
  var transactions: TransactionsResource
}
object Calculations {
  
  inline def apply(calculations: CalculationsResource, transactions: TransactionsResource): Calculations = {
    val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calculations] (val x: Self) extends AnyVal {
    
    inline def setCalculations(value: CalculationsResource): Self = StObject.set(x, "calculations", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: TransactionsResource): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
  }
}
