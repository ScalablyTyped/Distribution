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
  
  val plainSocket: plainSocket with java.lang.String = js.native
  val ssl: ssl with java.lang.String = js.native
  val sslAllowNullEncryption: sslAllowNullEncryption with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel with java.lang.String
  ] = js.native
}

