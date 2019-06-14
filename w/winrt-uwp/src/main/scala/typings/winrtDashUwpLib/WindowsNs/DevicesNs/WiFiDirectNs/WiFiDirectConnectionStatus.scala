package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectConnectionStatus extends js.Object

/** Describes the connection status of a WiFiDirectDevice object. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus")
@js.native
object WiFiDirectConnectionStatus extends js.Object {
  /** The device is connected to an associated Wi-Fi Direct device. */
  @js.native
  sealed trait connected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConnectionStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConnectionStatus
  
  /* 1 */ val connected: connected with scala.Double = js.native
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConnectionStatus with scala.Double
  ] = js.native
}

