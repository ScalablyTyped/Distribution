package typings.stripe.anon

import typings.stripe.stripeStrings.login_link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.LoginLink> */
trait ResponseLoginLink extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: login_link
  
  /**
    * The URL for the login link.
    */
  var url: String
}
object ResponseLoginLink {
  
  inline def apply(created: Double, lastResponse: ApiVersion, url: String): ResponseLoginLink = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("login_link")
    __obj.asInstanceOf[ResponseLoginLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseLoginLink] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: login_link): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
