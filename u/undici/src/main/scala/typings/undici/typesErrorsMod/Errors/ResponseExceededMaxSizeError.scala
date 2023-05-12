package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_RES_EXCEEDED_MAX_SIZE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseExceededMaxSizeError
  extends StObject
     with Error {
  
  var code: UND_ERR_RES_EXCEEDED_MAX_SIZE
  
  @JSName("name")
  var name_ResponseExceededMaxSizeError: typings.undici.undiciStrings.ResponseExceededMaxSizeError
}
object ResponseExceededMaxSizeError {
  
  inline def apply(message: String): ResponseExceededMaxSizeError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_RES_EXCEEDED_MAX_SIZE", message = message.asInstanceOf[js.Any], name = "ResponseExceededMaxSizeError")
    __obj.asInstanceOf[ResponseExceededMaxSizeError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseExceededMaxSizeError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_RES_EXCEEDED_MAX_SIZE): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.ResponseExceededMaxSizeError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
