package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_HEADERS_OVERFLOW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersOverflowError
  extends StObject
     with Error {
  
  var code: UND_ERR_HEADERS_OVERFLOW
  
  @JSName("name")
  var name_HeadersOverflowError: typings.undici.undiciStrings.HeadersOverflowError
}
object HeadersOverflowError {
  
  inline def apply(message: String): HeadersOverflowError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_HEADERS_OVERFLOW", message = message.asInstanceOf[js.Any], name = "HeadersOverflowError")
    __obj.asInstanceOf[HeadersOverflowError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadersOverflowError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_HEADERS_OVERFLOW): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.HeadersOverflowError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
