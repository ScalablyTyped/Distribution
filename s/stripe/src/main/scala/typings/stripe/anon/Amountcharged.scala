package typings.stripe.anon

import typings.stripe.stripeStrings.available
import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.missing
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amountcharged extends StObject {
  
  var address: String
  
  var amount_charged: Double
  
  var amount_received: Double
  
  var amount_returned: Double
  
  var refund_attributes_method: email | manual | none
  
  var refund_attributes_status: missing | requested | available
}
object Amountcharged {
  
  @scala.inline
  def apply(
    address: String,
    amount_charged: Double,
    amount_received: Double,
    amount_returned: Double,
    refund_attributes_method: email | manual | none,
    refund_attributes_status: missing | requested | available
  ): Amountcharged = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount_charged = amount_charged.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], refund_attributes_method = refund_attributes_method.asInstanceOf[js.Any], refund_attributes_status = refund_attributes_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amountcharged]
  }
  
  @scala.inline
  implicit class AmountchargedMutableBuilder[Self <: Amountcharged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_charged(value: Double): Self = StObject.set(x, "amount_charged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_received(value: Double): Self = StObject.set(x, "amount_received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_returned(value: Double): Self = StObject.set(x, "amount_returned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_attributes_method(value: email | manual | none): Self = StObject.set(x, "refund_attributes_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_attributes_status(value: missing | requested | available): Self = StObject.set(x, "refund_attributes_status", value.asInstanceOf[js.Any])
  }
}
