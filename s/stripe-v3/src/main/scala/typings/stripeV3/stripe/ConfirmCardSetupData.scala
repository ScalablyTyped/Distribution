package typings.stripeV3.stripe

import typings.stripeV3.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmCardSetupData extends StObject {
  
  /*
    * Pass an object to confirm using data collected by a card or
    * cardNumber Element or an with an existing token and to supply
    * additional data relevant to the PaymentMethod, such as billing
    * details:
    */
  var payment_method: js.UndefOr[String | `0`] = js.undefined
}
object ConfirmCardSetupData {
  
  inline def apply(): ConfirmCardSetupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardSetupData]
  }
  
  extension [Self <: ConfirmCardSetupData](x: Self) {
    
    inline def setPayment_method(value: String | `0`): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
