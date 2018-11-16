package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketActivityConnectedStandbyAction extends js.Object

/** Indicates whether an app that uses the socket brokering service can receive packets when the system goes to connected stand by. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityConnectedStandbyAction")
@js.native
object SocketActivityConnectedStandbyAction extends js.Object {
  /** The app should not receive packets when the system goes to stand by. */
  @js.native
  sealed trait doNotWake
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityConnectedStandbyAction
  
  /** The app can receive packets even when the system goes to stand by. */
  @js.native
  sealed trait wake
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityConnectedStandbyAction
  
  val doNotWake: doNotWake with java.lang.String = js.native
  val wake: wake with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityConnectedStandbyAction with java.lang.String
  ] = js.native
}

