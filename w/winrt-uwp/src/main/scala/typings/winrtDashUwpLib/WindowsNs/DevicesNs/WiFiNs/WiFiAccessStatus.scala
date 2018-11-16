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
  
  val allowed: allowed with java.lang.String = js.native
  val deniedBySystem: deniedBySystem with java.lang.String = js.native
  val deniedByUser: deniedByUser with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAccessStatus with java.lang.String
  ] = js.native
}

