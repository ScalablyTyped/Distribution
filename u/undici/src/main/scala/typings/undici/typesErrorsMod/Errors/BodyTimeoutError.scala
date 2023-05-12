package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_BODY_TIMEOUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyTimeoutError
  extends StObject
     with Error {
  
  var code: UND_ERR_BODY_TIMEOUT
  
  @JSName("name")
  var name_BodyTimeoutError: typings.undici.undiciStrings.BodyTimeoutError
}
object BodyTimeoutError {
  
  inline def apply(message: String): BodyTimeoutError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_BODY_TIMEOUT", message = message.asInstanceOf[js.Any], name = "BodyTimeoutError")
    __obj.asInstanceOf[BodyTimeoutError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyTimeoutError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_BODY_TIMEOUT): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.BodyTimeoutError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
