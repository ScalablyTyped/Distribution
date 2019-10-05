package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketProtectionLevel extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
@js.native
object SocketProtectionLevel extends js.Object {
  @js.native
  sealed trait plainSocket extends SocketProtectionLevel
  
  @js.native
  sealed trait ssl extends SocketProtectionLevel
  
  @js.native
  sealed trait sslAllowNullEncryption extends SocketProtectionLevel
  
  /* 0 */ val plainSocket: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.plainSocket with Double = js.native
  /* 1 */ val ssl: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.ssl with Double = js.native
  /* 2 */ val sslAllowNullEncryption: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.sslAllowNullEncryption with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketProtectionLevel with Double] = js.native
}

