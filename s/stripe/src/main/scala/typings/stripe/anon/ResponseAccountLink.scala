package typings.stripe.anon

import typings.stripe.stripeStrings.account_link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.AccountLink> */
trait ResponseAccountLink extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The timestamp at which this account link will expire.
    */
  var expires_at: Double
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: account_link
  
  /**
    * The URL for the account link.
    */
  var url: String
}
object ResponseAccountLink {
  
  inline def apply(created: Double, expires_at: Double, lastResponse: ApiVersion, url: String): ResponseAccountLink = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("account_link")
    __obj.asInstanceOf[ResponseAccountLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseAccountLink] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: account_link): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
