package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamSocketListenerInformation extends StObject {
  
  var localPort: String
}
object IStreamSocketListenerInformation {
  
  inline def apply(localPort: String): IStreamSocketListenerInformation = {
    val __obj = js.Dynamic.literal(localPort = localPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListenerInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStreamSocketListenerInformation] (val x: Self) extends AnyVal {
    
    inline def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
  }
}
