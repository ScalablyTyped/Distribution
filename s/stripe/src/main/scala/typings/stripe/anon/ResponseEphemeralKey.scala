package typings.stripe.anon

import typings.stripe.stripeStrings.ephemeral_key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.EphemeralKey> */
trait ResponseEphemeralKey extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Time at which the key will expire. Measured in seconds since the Unix epoch.
    */
  var expires: Double
  
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
  var `object`: ephemeral_key
  
  /**
    * The key's secret. You can use this value to make authorized requests to the Stripe API.
    */
  var secret: js.UndefOr[String] = js.undefined
}
object ResponseEphemeralKey {
  
  inline def apply(created: Double, expires: Double, id: String, lastResponse: ApiVersion, livemode: Boolean): ResponseEphemeralKey = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("ephemeral_key")
    __obj.asInstanceOf[ResponseEphemeralKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseEphemeralKey] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ephemeral_key): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
