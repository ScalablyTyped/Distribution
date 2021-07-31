package typings.stripe.mod.charges

import typings.stripe.stripeStrings.alipay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAlipayPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: alipay
}
object IAlipayPaymentMethodDetails {
  
  @scala.inline
  def apply(): IAlipayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("alipay")
    __obj.asInstanceOf[IAlipayPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IAlipayPaymentMethodDetailsMutableBuilder[Self <: IAlipayPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: alipay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
