package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketProtectionLevel extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
@js.native
object SocketProtectionLevel extends js.Object {
  @js.native
  sealed trait plainSocket
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  @js.native
  sealed trait ssl
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  @js.native
  sealed trait sslAllowNullEncryption
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
  
  /* 0 */ val plainSocket: plainSocket with scala.Double = js.native
  /* 1 */ val ssl: ssl with scala.Double = js.native
  /* 2 */ val sslAllowNullEncryption: sslAllowNullEncryption with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel with scala.Double
  ] = js.native
}

