package typings.stripe.mod.charges

import typings.stripe.stripeStrings.ideal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIdealPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: ideal = js.native
}
object IIdealPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: ideal): IIdealPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdealPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IIdealPaymentMethodDetailsOps[Self <: IIdealPaymentMethodDetails] (val x: Self) extends AnyVal {
    
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
    def setType(value: ideal): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
