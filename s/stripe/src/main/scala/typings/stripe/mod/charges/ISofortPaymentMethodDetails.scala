package typings.stripe.mod.charges

import typings.stripe.stripeStrings.sofort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISofortPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: sofort = js.native
}
object ISofortPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: sofort): ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISofortPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class ISofortPaymentMethodDetailsOps[Self <: ISofortPaymentMethodDetails] (val x: Self) extends AnyVal {
    
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
    def setType(value: sofort): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
