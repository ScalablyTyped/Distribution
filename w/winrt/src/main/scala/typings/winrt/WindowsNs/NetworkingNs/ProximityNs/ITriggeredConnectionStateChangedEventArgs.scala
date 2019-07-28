package typings.winrt.WindowsNs.NetworkingNs.ProximityNs

import typings.winrt.WindowsNs.NetworkingNs.SocketsNs.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggeredConnectionStateChangedEventArgs extends js.Object {
  var id: Double
  var socket: StreamSocket
  var state: TriggeredConnectState
}

object ITriggeredConnectionStateChangedEventArgs {
  @scala.inline
  def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): ITriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id, socket = socket, state = state)
  
    __obj.asInstanceOf[ITriggeredConnectionStateChangedEventArgs]
  }
}

