package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketProtectionLevel with Double] = js.native
  /* 0 */ @js.native
  object plainSocket extends TopLevel[plainSocket with Double]
  
  /* 1 */ @js.native
  object ssl extends TopLevel[ssl with Double]
  
  /* 2 */ @js.native
  object sslAllowNullEncryption extends TopLevel[sslAllowNullEncryption with Double]
  
}

