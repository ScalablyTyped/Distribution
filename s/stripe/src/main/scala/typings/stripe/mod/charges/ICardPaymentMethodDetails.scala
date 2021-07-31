package typings.stripe.mod.charges

import typings.stripe.anon.Brand
import typings.stripe.stripeStrings.card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICardPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var card: Brand
  
  var `type`: card
}
object ICardPaymentMethodDetails {
  
  @scala.inline
  def apply(card: Brand): ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("card")
    __obj.asInstanceOf[ICardPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class ICardPaymentMethodDetailsMutableBuilder[Self <: ICardPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: Brand): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: card): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
