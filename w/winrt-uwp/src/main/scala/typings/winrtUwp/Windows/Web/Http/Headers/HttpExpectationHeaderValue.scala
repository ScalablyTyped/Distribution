package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a token for a particular server behavior required by the client that is used in the Expect HTTP header on an HTTP request. */
trait HttpExpectationHeaderValue extends StObject {
  
  /** Gets or sets a token that represents a name for a server behavior used in the Expect HTTP header. */
  var name: String
  
  /** Gets a set of parameters for a server behavior included in the Expect HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
  
  /** Gets or sets a value for a server behavior used in the Expect HTTP header. */
  var value: String
}
object HttpExpectationHeaderValue {
  
  inline def apply(name: String, parameters: IVector[HttpNameValueHeaderValue], value: String): HttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpExpectationHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpExpectationHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
