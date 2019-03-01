package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggeredConnectionStateChangedEventArgs extends js.Object {
  var id: scala.Double
  var socket: winrtLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocket
  var state: TriggeredConnectState
}

object ITriggeredConnectionStateChangedEventArgs {
  @scala.inline
  def apply(
    id: scala.Double,
    socket: winrtLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocket,
    state: TriggeredConnectState
  ): ITriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("socket")(socket)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ITriggeredConnectionStateChangedEventArgs]
  }
}

