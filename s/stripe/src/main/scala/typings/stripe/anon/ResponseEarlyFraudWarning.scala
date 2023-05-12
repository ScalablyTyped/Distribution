package typings.stripe.anon

import typings.stripe.mod.Stripe.Charge
import typings.stripe.mod.Stripe.PaymentIntent
import typings.stripe.stripeStrings.radarDotearly_fraud_warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Radar.EarlyFraudWarning> */
trait ResponseEarlyFraudWarning extends StObject {
  
  /**
    * An EFW is actionable if it has not received a dispute and has not been fully refunded. You may wish to proactively refund a charge that receives an EFW, in order to avoid receiving a dispute later.
    */
  var actionable: Boolean
  
  /**
    * ID of the charge this early fraud warning is for, optionally expanded.
    */
  var charge: String | Charge
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The type of fraud labelled by the issuer. One of `card_never_received`, `fraudulent_card_application`, `made_with_counterfeit_card`, `made_with_lost_card`, `made_with_stolen_card`, `misc`, `unauthorized_use_of_card`.
    */
  var fraud_type: String
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: radarDotearly_fraud_warning
  
  /**
    * ID of the Payment Intent this early fraud warning is for, optionally expanded.
    */
  var payment_intent: js.UndefOr[String | PaymentIntent] = js.undefined
}
object ResponseEarlyFraudWarning {
  
  inline def apply(
    actionable: Boolean,
    charge: String | Charge,
    created: Double,
    fraud_type: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean
  ): ResponseEarlyFraudWarning = {
    val __obj = js.Dynamic.literal(actionable = actionable.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], fraud_type = fraud_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("radar.early_fraud_warning")
    __obj.asInstanceOf[ResponseEarlyFraudWarning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseEarlyFraudWarning] (val x: Self) extends AnyVal {
    
    inline def setActionable(value: Boolean): Self = StObject.set(x, "actionable", value.asInstanceOf[js.Any])
    
    inline def setCharge(value: String | Charge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setFraud_type(value: String): Self = StObject.set(x, "fraud_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: radarDotearly_fraud_warning): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent(value: String | PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentUndefined: Self = StObject.set(x, "payment_intent", js.undefined)
  }
}
