package typings.stripe.anon

import typings.stripe.mod.Stripe.TestHelpers.CustomersResource
import typings.stripe.mod.Stripe.TestHelpers.RefundsResource
import typings.stripe.mod.Stripe.TestHelpers.TestClocksResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customers extends StObject {
  
  var customers: CustomersResource
  
  var issuing: Cards
  
  var refunds: RefundsResource
  
  var terminal: Readers
  
  var testClocks: TestClocksResource
  
  var treasury: InboundTransfers
}
object Customers {
  
  inline def apply(
    customers: CustomersResource,
    issuing: Cards,
    refunds: RefundsResource,
    terminal: Readers,
    testClocks: TestClocksResource,
    treasury: InboundTransfers
  ): Customers = {
    val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], issuing = issuing.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], testClocks = testClocks.asInstanceOf[js.Any], treasury = treasury.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Customers] (val x: Self) extends AnyVal {
    
    inline def setCustomers(value: CustomersResource): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setIssuing(value: Cards): Self = StObject.set(x, "issuing", value.asInstanceOf[js.Any])
    
    inline def setRefunds(value: RefundsResource): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setTerminal(value: Readers): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    inline def setTestClocks(value: TestClocksResource): Self = StObject.set(x, "testClocks", value.asInstanceOf[js.Any])
    
    inline def setTreasury(value: InboundTransfers): Self = StObject.set(x, "treasury", value.asInstanceOf[js.Any])
  }
}
