package typings.stripe.anon

import typings.stripe.mod.Stripe.Mandate.CustomerAcceptance
import typings.stripe.mod.Stripe.Mandate.MultiUse
import typings.stripe.mod.Stripe.Mandate.PaymentMethodDetails
import typings.stripe.mod.Stripe.Mandate.SingleUse
import typings.stripe.mod.Stripe.Mandate.Status
import typings.stripe.mod.Stripe.PaymentMethod
import typings.stripe.stripeStrings.mandate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Mandate> */
trait ResponseMandate extends StObject {
  
  var customer_acceptance: CustomerAcceptance
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  var multi_use: js.UndefOr[MultiUse] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: mandate
  
  /**
    * ID of the payment method associated with this mandate.
    */
  var payment_method: String | PaymentMethod
  
  var payment_method_details: PaymentMethodDetails
  
  var single_use: js.UndefOr[SingleUse] = js.undefined
  
  /**
    * The status of the mandate, which indicates whether it can be used to initiate a payment.
    */
  var status: Status
  
  /**
    * The type of the mandate.
    */
  var `type`: typings.stripe.mod.Stripe.Mandate.Type
}
object ResponseMandate {
  
  inline def apply(
    customer_acceptance: CustomerAcceptance,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    payment_method: String | PaymentMethod,
    payment_method_details: PaymentMethodDetails,
    status: Status,
    `type`: typings.stripe.mod.Stripe.Mandate.Type
  ): ResponseMandate = {
    val __obj = js.Dynamic.literal(customer_acceptance = customer_acceptance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], payment_method = payment_method.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("mandate")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMandate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseMandate] (val x: Self) extends AnyVal {
    
    inline def setCustomer_acceptance(value: CustomerAcceptance): Self = StObject.set(x, "customer_acceptance", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMulti_use(value: MultiUse): Self = StObject.set(x, "multi_use", value.asInstanceOf[js.Any])
    
    inline def setMulti_useUndefined: Self = StObject.set(x, "multi_use", js.undefined)
    
    inline def setObject(value: mandate): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPayment_method(value: String | PaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_details(value: PaymentMethodDetails): Self = StObject.set(x, "payment_method_details", value.asInstanceOf[js.Any])
    
    inline def setSingle_use(value: SingleUse): Self = StObject.set(x, "single_use", value.asInstanceOf[js.Any])
    
    inline def setSingle_useUndefined: Self = StObject.set(x, "single_use", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.Mandate.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
