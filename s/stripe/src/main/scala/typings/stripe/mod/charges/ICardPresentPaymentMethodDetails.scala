package typings.stripe.mod.charges

import typings.stripe.stripeStrings.card_present
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICardPresentPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: card_present
}
object ICardPresentPaymentMethodDetails {
  
  @scala.inline
  def apply(): ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("card_present")
    __obj.asInstanceOf[ICardPresentPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class ICardPresentPaymentMethodDetailsMutableBuilder[Self <: ICardPresentPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: card_present): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
