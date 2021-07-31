package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Authorization or Proxy-Authorization HTTP header on an HTTP request. */
trait HttpCredentialsHeaderValue extends StObject {
  
  /** Gets a set of name/value pairs included in the Authorization or Proxy-Authorization HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
  
  /** Gets the scheme to use for authentication. */
  var scheme: String
  
  /** Gets the user token information used in the Authorization or Proxy-Authorization HTTP header. */
  var token: String
}
object HttpCredentialsHeaderValue {
  
  @scala.inline
  def apply(parameters: IVector[HttpNameValueHeaderValue], scheme: String, token: String): HttpCredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCredentialsHeaderValue]
  }
  
  @scala.inline
  implicit class HttpCredentialsHeaderValueMutableBuilder[Self <: HttpCredentialsHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
