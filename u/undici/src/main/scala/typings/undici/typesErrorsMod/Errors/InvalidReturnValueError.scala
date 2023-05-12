package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_INVALID_RETURN_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidReturnValueError
  extends StObject
     with Error {
  
  var code: UND_ERR_INVALID_RETURN_VALUE
  
  @JSName("name")
  var name_InvalidReturnValueError: typings.undici.undiciStrings.InvalidReturnValueError
}
object InvalidReturnValueError {
  
  inline def apply(message: String): InvalidReturnValueError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_INVALID_RETURN_VALUE", message = message.asInstanceOf[js.Any], name = "InvalidReturnValueError")
    __obj.asInstanceOf[InvalidReturnValueError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidReturnValueError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_INVALID_RETURN_VALUE): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.InvalidReturnValueError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
