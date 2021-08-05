package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Checks
import typings.stripe.mod.IMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stripe.mod.paymentMethods.ICardPaymentMethod
  - typings.stripe.mod.paymentMethods.ICardPresentPaymentMethod
*/
trait IPaymentMethod extends StObject
object IPaymentMethod {
  
  inline def ICardPaymentMethod(card: Checks, created: Double, id: String, livemode: Boolean, metadata: IMetadata): typings.stripe.mod.paymentMethods.ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], billing_details = null, customer = null)
    __obj.updateDynamic("object")("payment_method")
    __obj.updateDynamic("type")("card")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.ICardPaymentMethod]
  }
  
  inline def ICardPresentPaymentMethod(created: Double, id: String, livemode: Boolean, metadata: IMetadata): typings.stripe.mod.paymentMethods.ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], billing_details = null, customer = null)
    __obj.updateDynamic("object")("payment_method")
    __obj.updateDynamic("type")("card_present")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.ICardPresentPaymentMethod]
  }
}
