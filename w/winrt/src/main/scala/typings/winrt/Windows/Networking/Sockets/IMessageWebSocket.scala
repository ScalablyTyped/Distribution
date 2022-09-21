package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageWebSocket
  extends StObject
     with IWebSocket {
  
  var control: MessageWebSocketControl = js.native
  
  var information: MessageWebSocketInformation = js.native
  
  var onmessagereceived: Any = js.native
}
