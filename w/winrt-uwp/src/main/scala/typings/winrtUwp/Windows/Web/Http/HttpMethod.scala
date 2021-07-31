package typings.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves standard HTTP methods such as GET and POST and creates new HTTP methods. */
trait HttpMethod extends StObject {
  
  /** Gets the HTTP method. */
  var method: String
}
object HttpMethod {
  
  @scala.inline
  def apply(method: String): HttpMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMethod]
  }
  
  @scala.inline
  implicit class HttpMethodMutableBuilder[Self <: HttpMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
