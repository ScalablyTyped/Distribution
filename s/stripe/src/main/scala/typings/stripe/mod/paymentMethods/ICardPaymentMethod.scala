package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Checks
import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  
  var card: Checks = js.native
  
  var `type`: card = js.native
}
object ICardPaymentMethod {
  
  @scala.inline
  def apply(
    card: Checks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card
  ): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethod]
  }
  
  @scala.inline
  implicit class ICardPaymentMethodMutableBuilder[Self <: ICardPaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: Checks): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: card): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
