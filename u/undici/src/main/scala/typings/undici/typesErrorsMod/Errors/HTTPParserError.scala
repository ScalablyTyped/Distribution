package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPParserError
  extends StObject
     with Error {
  
  var code: String
  
  @JSName("name")
  var name_HTTPParserError: typings.undici.undiciStrings.HTTPParserError
}
object HTTPParserError {
  
  inline def apply(code: String, message: String): HTTPParserError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "HTTPParserError")
    __obj.asInstanceOf[HTTPParserError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTTPParserError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.HTTPParserError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
