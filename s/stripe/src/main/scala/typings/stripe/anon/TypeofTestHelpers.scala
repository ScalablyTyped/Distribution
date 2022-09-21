package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.TestHelpers.CustomersResource
import typings.stripe.mod.Stripe.TestHelpers.RefundsResource
import typings.stripe.mod.Stripe.TestHelpers.TestClocksResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTestHelpers extends StObject {
  
  var CustomersResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.CustomersResource]
  
  val Issuing: TypeofIssuingCardsResource
  
  var RefundsResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.RefundsResource]
  
  val Terminal: TypeofTerminalReaderPresentPaymentMethodParams
  
  val TestClock: Any
  
  var TestClocksResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.TestClocksResource]
  
  val Treasury: TypeofTreasury
}
object TypeofTestHelpers {
  
  inline def apply(
    CustomersResource: Instantiable0[CustomersResource],
    Issuing: TypeofIssuingCardsResource,
    RefundsResource: Instantiable0[RefundsResource],
    Terminal: TypeofTerminalReaderPresentPaymentMethodParams,
    TestClock: Any,
    TestClocksResource: Instantiable0[TestClocksResource],
    Treasury: TypeofTreasury
  ): TypeofTestHelpers = {
    val __obj = js.Dynamic.literal(CustomersResource = CustomersResource.asInstanceOf[js.Any], Issuing = Issuing.asInstanceOf[js.Any], RefundsResource = RefundsResource.asInstanceOf[js.Any], Terminal = Terminal.asInstanceOf[js.Any], TestClock = TestClock.asInstanceOf[js.Any], TestClocksResource = TestClocksResource.asInstanceOf[js.Any], Treasury = Treasury.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTestHelpers]
  }
  
  extension [Self <: TypeofTestHelpers](x: Self) {
    
    inline def setCustomersResource(value: Instantiable0[CustomersResource]): Self = StObject.set(x, "CustomersResource", value.asInstanceOf[js.Any])
    
    inline def setIssuing(value: TypeofIssuingCardsResource): Self = StObject.set(x, "Issuing", value.asInstanceOf[js.Any])
    
    inline def setRefundsResource(value: Instantiable0[RefundsResource]): Self = StObject.set(x, "RefundsResource", value.asInstanceOf[js.Any])
    
    inline def setTerminal(value: TypeofTerminalReaderPresentPaymentMethodParams): Self = StObject.set(x, "Terminal", value.asInstanceOf[js.Any])
    
    inline def setTestClock(value: Any): Self = StObject.set(x, "TestClock", value.asInstanceOf[js.Any])
    
    inline def setTestClocksResource(value: Instantiable0[TestClocksResource]): Self = StObject.set(x, "TestClocksResource", value.asInstanceOf[js.Any])
    
    inline def setTreasury(value: TypeofTreasury): Self = StObject.set(x, "Treasury", value.asInstanceOf[js.Any])
  }
}
