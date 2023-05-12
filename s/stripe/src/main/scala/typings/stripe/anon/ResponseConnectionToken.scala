package typings.stripe.anon

import typings.stripe.stripeStrings.terminalDotconnection_token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Terminal.ConnectionToken> */
trait ResponseConnectionToken extends StObject {
  
  var lastResponse: ApiVersion
  
  /**
    * The id of the location that this connection token is scoped to. Note that location scoping only applies to internet-connected readers. For more details, see [the docs on scoping connection tokens](https://stripe.com/docs/terminal/fleet/locations#connection-tokens).
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: terminalDotconnection_token
  
  /**
    * Your application should pass this token to the Stripe Terminal SDK.
    */
  var secret: String
}
object ResponseConnectionToken {
  
  inline def apply(lastResponse: ApiVersion, secret: String): ResponseConnectionToken = {
    val __obj = js.Dynamic.literal(lastResponse = lastResponse.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("terminal.connection_token")
    __obj.asInstanceOf[ResponseConnectionToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseConnectionToken] (val x: Self) extends AnyVal {
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setObject(value: terminalDotconnection_token): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
