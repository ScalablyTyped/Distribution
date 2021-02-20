package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketProtectionLevel extends StObject
@JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
@js.native
object SocketProtectionLevel extends StObject {
  
  @js.native
  sealed trait plainSocket extends SocketProtectionLevel
  
  @js.native
  sealed trait ssl extends SocketProtectionLevel
  
  @js.native
  sealed trait sslAllowNullEncryption extends SocketProtectionLevel
}
