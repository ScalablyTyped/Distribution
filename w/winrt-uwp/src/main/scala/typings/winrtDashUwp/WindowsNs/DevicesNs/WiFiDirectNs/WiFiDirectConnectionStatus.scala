package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

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
  sealed trait connected extends WiFiDirectConnectionStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait disconnected extends WiFiDirectConnectionStatus
  
  /* 1 */ val connected: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConnectionStatus.connected with Double = js.native
  /* 0 */ val disconnected: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectConnectionStatus.disconnected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectConnectionStatus with Double] = js.native
}

