package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketCommandDescriptionParameters extends StObject {
  
  var socket: CommandDescriptionParameters
}
object SocketCommandDescriptionParameters {
  
  inline def apply(socket: CommandDescriptionParameters): SocketCommandDescriptionParameters = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketCommandDescriptionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketCommandDescriptionParameters] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: CommandDescriptionParameters): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
