package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceSessionStatus extends js.Object

/** Values used to describe the status of a Wi-Fi Direct Service Session. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus")
@js.native
object WiFiDirectServiceSessionStatus extends js.Object {
  /** The session has been closed. */
  @js.native
  sealed trait closed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus
  
  /** The session has been initiated. */
  @js.native
  sealed trait initiated
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus
  
  /** The session is open. */
  @js.native
  sealed trait open
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus
  
  /** A session has been requested. */
  @js.native
  sealed trait requested
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus
  
  val closed: closed with java.lang.String = js.native
  val initiated: initiated with java.lang.String = js.native
  val open: open with java.lang.String = js.native
  val requested: requested with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus with java.lang.String
  ] = js.native
}

