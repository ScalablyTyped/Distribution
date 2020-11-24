package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectServiceIPProtocol extends js.Object
/** Values that specify the IP protocol of the new port when a WiFiDirectServiceSession.RemotePortAdded event is raised. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol")
@js.native
object WiFiDirectServiceIPProtocol extends js.Object {
  
  /** TCP */
  @js.native
  sealed trait tcp extends WiFiDirectServiceIPProtocol
  
  /** UDP */
  @js.native
  sealed trait udp extends WiFiDirectServiceIPProtocol
}
