package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamWebSocket extends IWebSocket {
  var control: StreamWebSocketControl = js.native
  var information: StreamWebSocketInformation = js.native
  var inputStream: IInputStream = js.native
}

