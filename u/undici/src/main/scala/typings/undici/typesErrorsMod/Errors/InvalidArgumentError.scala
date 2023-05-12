package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_INVALID_ARG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidArgumentError
  extends StObject
     with Error {
  
  var code: UND_ERR_INVALID_ARG
  
  @JSName("name")
  var name_InvalidArgumentError: typings.undici.undiciStrings.InvalidArgumentError
}
object InvalidArgumentError {
  
  inline def apply(message: String): InvalidArgumentError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_INVALID_ARG", message = message.asInstanceOf[js.Any], name = "InvalidArgumentError")
    __obj.asInstanceOf[InvalidArgumentError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidArgumentError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_INVALID_ARG): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.InvalidArgumentError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
