package typings.stripe.mod.paymentMethods

import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardPresentPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  
  var `type`: card_present = js.native
}
object ICardPresentPaymentMethod {
  
  @scala.inline
  def apply(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card_present
  ): ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethod]
  }
  
  @scala.inline
  implicit class ICardPresentPaymentMethodMutableBuilder[Self <: ICardPresentPaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: card_present): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
