package typings.stripe.anon

import typings.stripe.stripeStrings.apple_pay_domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.ApplePayDomain> */
trait ResponseApplePayDomain extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  var domain_name: String
  
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
  var `object`: apple_pay_domain
}
object ResponseApplePayDomain {
  
  inline def apply(created: Double, domain_name: String, id: String, lastResponse: ApiVersion, livemode: Boolean): ResponseApplePayDomain = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], domain_name = domain_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("apple_pay_domain")
    __obj.asInstanceOf[ResponseApplePayDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseApplePayDomain] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDomain_name(value: String): Self = StObject.set(x, "domain_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: apple_pay_domain): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
