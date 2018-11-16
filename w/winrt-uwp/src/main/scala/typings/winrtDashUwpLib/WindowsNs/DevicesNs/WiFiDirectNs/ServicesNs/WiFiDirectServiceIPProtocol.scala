package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

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
  sealed trait tcp
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceIPProtocol
  
  /** UDP */
  @js.native
  sealed trait udp
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceIPProtocol
  
  val tcp: tcp with java.lang.String = js.native
  val udp: udp with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceIPProtocol with java.lang.String
  ] = js.native
}

