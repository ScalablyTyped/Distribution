package typings.stripe.mod.charges

import typings.stripe.stripeStrings.klarna
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKlarnaPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: klarna = js.native
}
object IKlarnaPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: klarna): IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKlarnaPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IKlarnaPaymentMethodDetailsMutableBuilder[Self <: IKlarnaPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: klarna): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
