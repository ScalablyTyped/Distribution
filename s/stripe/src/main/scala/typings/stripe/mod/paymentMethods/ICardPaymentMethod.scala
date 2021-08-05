package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Checks
import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICardPaymentMethod
  extends StObject
     with IBasePaymentMethod
     with IPaymentMethod {
  
  var card: Checks
  
  var `type`: card
}
object ICardPaymentMethod {
  
  inline def apply(card: Checks, created: Double, id: String, livemode: Boolean, metadata: IMetadata): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], billing_details = null, customer = null)
    __obj.updateDynamic("object")("payment_method")
    __obj.updateDynamic("type")("card")
    __obj.asInstanceOf[ICardPaymentMethod]
  }
  
  extension [Self <: ICardPaymentMethod](x: Self) {
    
    inline def setCard(value: Checks): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setType(value: card): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
