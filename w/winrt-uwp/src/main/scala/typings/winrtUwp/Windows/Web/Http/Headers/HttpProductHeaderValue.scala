package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents product information used by the HttpProductHeaderValue and HttpProductInfoHeaderValueCollection classes in the User-Agent HTTP header. */
trait HttpProductHeaderValue extends StObject {
  
  /** Gets a token that represents the name of the product to be used in the User-Agent HTTP header. */
  var name: String
  
  /** Gets a token that represents the version of the product to be used in the User-Agent HTTP header. */
  var version: String
}
object HttpProductHeaderValue {
  
  inline def apply(name: String, version: String): HttpProductHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProductHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpProductHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
