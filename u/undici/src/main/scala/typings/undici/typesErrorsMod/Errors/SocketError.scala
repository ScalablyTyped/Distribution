package typings.undici.typesErrorsMod.Errors

import typings.std.Error
import typings.undici.typesClientMod.Client.SocketInfo
import typings.undici.undiciStrings.UND_ERR_SOCKET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketError
  extends StObject
     with Error {
  
  var code: UND_ERR_SOCKET
  
  @JSName("name")
  var name_SocketError: typings.undici.undiciStrings.SocketError
  
  var socket: SocketInfo | Null
}
object SocketError {
  
  inline def apply(message: String): SocketError = {
    val __obj = js.Dynamic.literal(code = "UND_ERR_SOCKET", message = message.asInstanceOf[js.Any], name = "SocketError", socket = null)
    __obj.asInstanceOf[SocketError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: UND_ERR_SOCKET): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.undici.undiciStrings.SocketError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: SocketInfo): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketNull: Self = StObject.set(x, "socket", null)
  }
}
