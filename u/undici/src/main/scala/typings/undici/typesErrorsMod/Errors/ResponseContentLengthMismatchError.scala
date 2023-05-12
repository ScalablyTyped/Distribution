package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_RES_CONTENT_LENGTH_MISMATCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseContentLengthMismatchError
  extends StObject
     with Error {
  
  var code: UND_ERR_RES_CONTENT_LENGTH_MISMATCH
  
  @JSName("name")
  var name_ResponseContentLengthMismatchError: typings.undici.undiciStrings.ResponseContentLengthMismatchError
}
object ResponseContentLengthMismatchError {
  
  inline def apply(message: String): ResponseContentLengthMismatchError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_RES_CONTENT_LENGTH_MISMATCH", message = message.asInstanceOf[js.Any], name = "ResponseContentLengthMismatchError")
    __obj.asInstanceOf[ResponseContentLengthMismatchError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseContentLengthMismatchError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_RES_CONTENT_LENGTH_MISMATCH): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.ResponseContentLengthMismatchError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
