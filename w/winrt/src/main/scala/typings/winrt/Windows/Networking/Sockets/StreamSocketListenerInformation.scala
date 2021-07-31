package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSocketListenerInformation
  extends StObject
     with IStreamSocketListenerInformation
object StreamSocketListenerInformation {
  
  @scala.inline
  def apply(localPort: String): StreamSocketListenerInformation = {
    val __obj = js.Dynamic.literal(localPort = localPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerInformation]
  }
}
