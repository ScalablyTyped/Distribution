package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@js.native
trait HttpCookiePairHeaderValue extends StObject {
  
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  var name: String = js.native
  
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  var value: String = js.native
}
object HttpCookiePairHeaderValue {
  
  @scala.inline
  def apply(name: String, value: String): HttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookiePairHeaderValue]
  }
  
  @scala.inline
  implicit class HttpCookiePairHeaderValueMutableBuilder[Self <: HttpCookiePairHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
