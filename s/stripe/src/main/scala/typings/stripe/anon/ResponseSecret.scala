package typings.stripe.anon

import typings.stripe.mod.Stripe.Apps.Secret.Scope
import typings.stripe.stripeStrings.appsDotsecret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Apps.Secret> */
trait ResponseSecret extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * If true, indicates that this secret has been deleted
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Unix timestamp for the expiry time of the secret, after which the secret deletes.
    */
  var expires_at: Double | Null
  
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
    * A name for the secret that's unique within the scope.
    */
  var name: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: appsDotsecret
  
  /**
    * The plaintext secret value to be stored.
    */
  var payload: String | Null
  
  var scope: Scope
}
object ResponseSecret {
  
  inline def apply(
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    name: String,
    scope: Scope
  ): ResponseSecret = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], expires_at = null, payload = null)
    __obj.updateDynamic("object")("apps.secret")
    __obj.asInstanceOf[ResponseSecret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSecret] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: appsDotsecret): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
