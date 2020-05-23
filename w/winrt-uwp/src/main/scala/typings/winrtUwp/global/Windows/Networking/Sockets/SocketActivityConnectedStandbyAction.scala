package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates whether an app that uses the socket brokering service can receive packets when the system goes to connected stand by. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityConnectedStandbyAction")
@js.native
object SocketActivityConnectedStandbyAction extends js.Object {
  /* 0 */ val doNotWake: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.doNotWake with Double = js.native
  /* 1 */ val wake: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.wake with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction with Double
  ] = js.native
}

