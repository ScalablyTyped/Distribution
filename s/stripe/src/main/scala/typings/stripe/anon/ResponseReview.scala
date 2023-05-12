package typings.stripe.anon

import typings.stripe.mod.Stripe.Charge
import typings.stripe.mod.Stripe.PaymentIntent
import typings.stripe.mod.Stripe.Review.ClosedReason
import typings.stripe.mod.Stripe.Review.IpAddressLocation
import typings.stripe.mod.Stripe.Review.OpenedReason
import typings.stripe.mod.Stripe.Review.Session
import typings.stripe.stripeStrings.review
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Review> */
trait ResponseReview extends StObject {
  
  /**
    * The ZIP or postal code of the card used, if applicable.
    */
  var billing_zip: String | Null
  
  /**
    * The charge associated with this review.
    */
  var charge: String | Charge | Null
  
  /**
    * The reason the review was closed, or null if it has not yet been closed. One of `approved`, `refunded`, `refunded_as_fraud`, `disputed`, or `redacted`.
    */
  var closed_reason: ClosedReason | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The IP address where the payment originated.
    */
  var ip_address: String | Null
  
  /**
    * Information related to the location of the payment. Note that this information is an approximation and attempts to locate the nearest population center - it should not be used to determine a specific address.
    */
  var ip_address_location: IpAddressLocation | Null
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: review
  
  /**
    * If `true`, the review needs action.
    */
  var open: Boolean
  
  /**
    * The reason the review was opened. One of `rule` or `manual`.
    */
  var opened_reason: OpenedReason
  
  /**
    * The PaymentIntent ID associated with this review, if one exists.
    */
  var payment_intent: js.UndefOr[String | PaymentIntent] = js.undefined
  
  /**
    * The reason the review is currently open or closed. One of `rule`, `manual`, `approved`, `refunded`, `refunded_as_fraud`, `disputed`, or `redacted`.
    */
  var reason: String
  
  /**
    * Information related to the browsing session of the user who initiated the payment.
    */
  var session: Session | Null
}
object ResponseReview {
  
  inline def apply(
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    open: Boolean,
    opened_reason: OpenedReason,
    reason: String
  ): ResponseReview = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], opened_reason = opened_reason.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], billing_zip = null, charge = null, closed_reason = null, ip_address = null, ip_address_location = null, session = null)
    __obj.updateDynamic("object")("review")
    __obj.asInstanceOf[ResponseReview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseReview] (val x: Self) extends AnyVal {
    
    inline def setBilling_zip(value: String): Self = StObject.set(x, "billing_zip", value.asInstanceOf[js.Any])
    
    inline def setBilling_zipNull: Self = StObject.set(x, "billing_zip", null)
    
    inline def setCharge(value: String | Charge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setChargeNull: Self = StObject.set(x, "charge", null)
    
    inline def setClosed_reason(value: ClosedReason): Self = StObject.set(x, "closed_reason", value.asInstanceOf[js.Any])
    
    inline def setClosed_reasonNull: Self = StObject.set(x, "closed_reason", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressNull: Self = StObject.set(x, "ip_address", null)
    
    inline def setIp_address_location(value: IpAddressLocation): Self = StObject.set(x, "ip_address_location", value.asInstanceOf[js.Any])
    
    inline def setIp_address_locationNull: Self = StObject.set(x, "ip_address_location", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: review): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpened_reason(value: OpenedReason): Self = StObject.set(x, "opened_reason", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent(value: String | PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentUndefined: Self = StObject.set(x, "payment_intent", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
  }
}
