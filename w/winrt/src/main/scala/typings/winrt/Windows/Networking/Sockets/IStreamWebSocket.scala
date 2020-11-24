package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamWebSocket extends IWebSocket {
  
  var control: StreamWebSocketControl = js.native
  
  var information: StreamWebSocketInformation = js.native
  
  var inputStream: IInputStream = js.native
}
