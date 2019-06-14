package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiAccessStatus extends js.Object

/** Used to report the results of an attempt to request access to a Wi-Fi adapter. */
@JSGlobal("Windows.Devices.WiFi.WiFiAccessStatus")
@js.native
object WiFiAccessStatus extends js.Object {
  /** Access has been allowed. */
  @js.native
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAccessStatus
  
  /** Access has been denied by the system. */
  @js.native
  sealed trait deniedBySystem
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAccessStatus
  
  /** Access has been denied by the user, through the user interface. */
  @js.native
  sealed trait deniedByUser
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAccessStatus
  
  /** The asynchronous request has not completed yet. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAccessStatus
  
  /* 1 */ val allowed: allowed with scala.Double = js.native
  /* 3 */ val deniedBySystem: deniedBySystem with scala.Double = js.native
  /* 2 */ val deniedByUser: deniedByUser with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAccessStatus with scala.Double] = js.native
}

