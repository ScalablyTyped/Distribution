package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val tcp: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.tcp with Double = js.native
  /* 1 */ val udp: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol.udp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceIPProtocol with Double] = js.native
}

