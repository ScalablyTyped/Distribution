package typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket error status for operations on a DatagramSocket , StreamSocket , or StreamSocketListener . */
@JSGlobal("Windows.Networking.Sockets.SocketError")
@js.native
abstract class SocketError () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.Sockets.SocketError")
@js.native
object SocketError extends js.Object {
  /**
    * Gets a SocketErrorStatus value based on an error encountered by a socket operation.
    * @param hresult The error encountered by a socket operation represented as an HRESULT.
    * @return The socket error status value for a socket operation.
    */
  def getStatus(hresult: Double): SocketErrorStatus = js.native
}

