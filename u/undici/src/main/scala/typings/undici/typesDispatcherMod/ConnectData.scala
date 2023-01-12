package typings.undici.typesDispatcherMod

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectData extends StObject {
  
  var headers: IncomingHttpHeaders
  
  var opaque: Any
  
  var socket: Duplex
  
  var statusCode: Double
}
object ConnectData {
  
  inline def apply(headers: IncomingHttpHeaders, opaque: Any, socket: Duplex, statusCode: Double): ConnectData = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectData] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: Duplex): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
