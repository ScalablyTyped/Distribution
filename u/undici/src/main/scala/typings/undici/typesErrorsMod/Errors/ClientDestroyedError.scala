package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.undiciStrings.UND_ERR_DESTROYED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientDestroyedError
  extends StObject
     with Error {
  
  var code: UND_ERR_DESTROYED
  
  @JSName("name")
  var name_ClientDestroyedError: typings.undici.undiciStrings.ClientDestroyedError
}
object ClientDestroyedError {
  
  inline def apply(message: String): ClientDestroyedError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_DESTROYED", message = message.asInstanceOf[js.Any], name = "ClientDestroyedError")
    __obj.asInstanceOf[ClientDestroyedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientDestroyedError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_DESTROYED): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.ClientDestroyedError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
