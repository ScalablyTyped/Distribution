package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the level of encryption to use on a StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
@js.native
object SocketProtectionLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel with Double] = js.native
  
  /* 3 */ val bluetoothEncryptionAllowNullAuthentication: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.bluetoothEncryptionAllowNullAuthentication with Double = js.native
  
  /* 4 */ val bluetoothEncryptionWithAuthentication: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.bluetoothEncryptionWithAuthentication with Double = js.native
  
  /* 0 */ val plainSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.plainSocket with Double = js.native
  
  /* 1 */ val ssl: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.ssl with Double = js.native
  
  /* 5 */ val ssl3AllowWeakEncryption: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.ssl3AllowWeakEncryption with Double = js.native
  
  /* 2 */ val sslAllowNullEncryption: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.sslAllowNullEncryption with Double = js.native
  
  /* 6 */ val tls10: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls10 with Double = js.native
  
  /* 7 */ val tls11: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls11 with Double = js.native
  
  /* 8 */ val tls12: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls12 with Double = js.native
}
