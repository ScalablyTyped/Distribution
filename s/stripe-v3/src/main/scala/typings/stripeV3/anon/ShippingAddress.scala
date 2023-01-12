package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingAddress extends StObject {
  
  var shippingAddress: typings.stripeV3.stripe.paymentRequest.ShippingAddress
  
  def updateWith(options: UpdateDetails): Unit
}
object ShippingAddress {
  
  inline def apply(
    shippingAddress: typings.stripeV3.stripe.paymentRequest.ShippingAddress,
    updateWith: UpdateDetails => Unit
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingAddress] (val x: Self) extends AnyVal {
    
    inline def setShippingAddress(value: typings.stripeV3.stripe.paymentRequest.ShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setUpdateWith(value: UpdateDetails => Unit): Self = StObject.set(x, "updateWith", js.Any.fromFunction1(value))
  }
}
