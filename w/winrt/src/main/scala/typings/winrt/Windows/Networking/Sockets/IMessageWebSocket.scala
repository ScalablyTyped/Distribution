package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageWebSocket extends IWebSocket {
  
  var control: MessageWebSocketControl = js.native
  
  var information: MessageWebSocketInformation = js.native
  
  var onmessagereceived: js.Any = js.native
}
