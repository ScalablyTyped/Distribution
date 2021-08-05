package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingOption extends StObject {
  
  var shippingOption: typings.stripeV3.stripe.paymentRequest.ShippingOption
  
  def updateWith(options: UpdateDetails): Unit
}
object ShippingOption {
  
  inline def apply(
    shippingOption: typings.stripeV3.stripe.paymentRequest.ShippingOption,
    updateWith: UpdateDetails => Unit
  ): ShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingOption]
  }
  
  extension [Self <: ShippingOption](x: Self) {
    
    inline def setShippingOption(value: typings.stripeV3.stripe.paymentRequest.ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    inline def setUpdateWith(value: UpdateDetails => Unit): Self = StObject.set(x, "updateWith", js.Any.fromFunction1(value))
  }
}
