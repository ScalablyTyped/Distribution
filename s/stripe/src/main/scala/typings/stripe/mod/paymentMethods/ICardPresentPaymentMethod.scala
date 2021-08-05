package typings.stripe.mod.paymentMethods

import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.card_present
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICardPresentPaymentMethod
  extends StObject
     with IBasePaymentMethod
     with IPaymentMethod {
  
  var `type`: card_present
}
object ICardPresentPaymentMethod {
  
  inline def apply(created: Double, id: String, livemode: Boolean, metadata: IMetadata): ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], billing_details = null, customer = null)
    __obj.updateDynamic("object")("payment_method")
    __obj.updateDynamic("type")("card_present")
    __obj.asInstanceOf[ICardPresentPaymentMethod]
  }
  
  extension [Self <: ICardPresentPaymentMethod](x: Self) {
    
    inline def setType(value: card_present): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
