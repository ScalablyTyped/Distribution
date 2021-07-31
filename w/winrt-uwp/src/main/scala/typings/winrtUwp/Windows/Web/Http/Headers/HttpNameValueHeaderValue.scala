package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents name and value information used in a number of HTTP headers. */
trait HttpNameValueHeaderValue extends StObject {
  
  /** Gets the name used in the HttpNameValueHeaderValue object. */
  var name: String
  
  /** Gets or sets the value associated with a name used in the HttpNameValueHeaderValue object. */
  var value: String
}
object HttpNameValueHeaderValue {
  
  @scala.inline
  def apply(name: String, value: String): HttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpNameValueHeaderValue]
  }
  
  @scala.inline
  implicit class HttpNameValueHeaderValueMutableBuilder[Self <: HttpNameValueHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
