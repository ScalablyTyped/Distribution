package typings.winrt.WindowsNs.NetworkingNs.ProximityNs

import typings.winrt.WindowsNs.NetworkingNs.SocketsNs.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs")
@js.native
class TriggeredConnectionStateChangedEventArgs () extends ITriggeredConnectionStateChangedEventArgs {
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var socket: StreamSocket = js.native
  /* CompleteClass */
  override var state: TriggeredConnectState = js.native
}

