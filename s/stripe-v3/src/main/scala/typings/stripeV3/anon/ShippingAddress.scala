package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingAddress extends StObject {
  
  var shippingAddress: typings.stripeV3.stripe.paymentRequest.ShippingAddress = js.native
  
  def updateWith(options: UpdateDetails): Unit = js.native
}
object ShippingAddress {
  
  @scala.inline
  def apply(
    shippingAddress: typings.stripeV3.stripe.paymentRequest.ShippingAddress,
    updateWith: UpdateDetails => Unit
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingAddress]
  }
  
  @scala.inline
  implicit class ShippingAddressMutableBuilder[Self <: ShippingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShippingAddress(value: typings.stripeV3.stripe.paymentRequest.ShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateWith(value: UpdateDetails => Unit): Self = StObject.set(x, "updateWith", js.Any.fromFunction1(value))
  }
}
