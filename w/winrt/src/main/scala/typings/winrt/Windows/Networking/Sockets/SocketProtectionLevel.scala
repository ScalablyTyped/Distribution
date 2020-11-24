package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
