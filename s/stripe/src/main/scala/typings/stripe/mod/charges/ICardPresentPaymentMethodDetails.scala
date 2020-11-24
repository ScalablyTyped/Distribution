package typings.stripe.mod.charges

import typings.stripe.stripeStrings.card_present
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardPresentPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: card_present = js.native
}
object ICardPresentPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: card_present): ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class ICardPresentPaymentMethodDetailsOps[Self <: ICardPresentPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: card_present): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
