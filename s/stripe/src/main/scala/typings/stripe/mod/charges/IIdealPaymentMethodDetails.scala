package typings.stripe.mod.charges

import typings.stripe.stripeStrings.ideal
import org.scalablytyped.runtime.StObject
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
  implicit class IIdealPaymentMethodDetailsMutableBuilder[Self <: IIdealPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ideal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
