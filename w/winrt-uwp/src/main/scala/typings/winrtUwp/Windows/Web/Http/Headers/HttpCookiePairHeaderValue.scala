package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
trait HttpCookiePairHeaderValue extends StObject {
  
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  var name: String
  
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  var value: String
}
object HttpCookiePairHeaderValue {
  
  inline def apply(name: String, value: String): HttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookiePairHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpCookiePairHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
