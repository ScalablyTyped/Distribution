package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Socket extends StObject {
  
  var socket: Command
}
object Socket {
  
  inline def apply(socket: Command): Socket = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Socket] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: Command): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
