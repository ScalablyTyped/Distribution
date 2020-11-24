package typings.winrt.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
@js.native
object SocketProtectionLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel with Double] = js.native
  
  /* 0 */ val plainSocket: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.plainSocket with Double = js.native
  
  /* 1 */ val ssl: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.ssl with Double = js.native
  
  /* 2 */ val sslAllowNullEncryption: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.sslAllowNullEncryption with Double = js.native
}
