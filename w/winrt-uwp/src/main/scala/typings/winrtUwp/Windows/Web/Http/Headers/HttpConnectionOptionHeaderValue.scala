package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents connection information used in the Connection HTTP header on an HTTP request. */
trait HttpConnectionOptionHeaderValue extends StObject {
  
  /** Gets the value of the connection-token in the Connection HTTP header. */
  var token: String
}
object HttpConnectionOptionHeaderValue {
  
  inline def apply(token: String): HttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpConnectionOptionHeaderValue]
  }
  
  extension [Self <: HttpConnectionOptionHeaderValue](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
