package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_CONNECT_TIMEOUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectTimeoutError
  extends StObject
     with Error {
  
  var code: UND_ERR_CONNECT_TIMEOUT
  
  @JSName("name")
  var name_ConnectTimeoutError: typings.undici.undiciStrings.ConnectTimeoutError
}
object ConnectTimeoutError {
  
  inline def apply(message: String): ConnectTimeoutError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_CONNECT_TIMEOUT", message = message.asInstanceOf[js.Any], name = "ConnectTimeoutError")
    __obj.asInstanceOf[ConnectTimeoutError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectTimeoutError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_CONNECT_TIMEOUT): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.ConnectTimeoutError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
