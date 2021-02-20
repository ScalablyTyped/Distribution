package typings.stripe.mod.charges

import typings.stripe.stripeStrings.alipay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAlipayPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: alipay = js.native
}
object IAlipayPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: alipay): IAlipayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlipayPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IAlipayPaymentMethodDetailsMutableBuilder[Self <: IAlipayPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: alipay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
