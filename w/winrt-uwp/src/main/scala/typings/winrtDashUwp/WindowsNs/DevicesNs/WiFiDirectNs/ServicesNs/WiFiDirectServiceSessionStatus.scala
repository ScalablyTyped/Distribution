package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

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
  sealed trait closed extends WiFiDirectServiceSessionStatus
  
  /** The session has been initiated. */
  @js.native
  sealed trait initiated extends WiFiDirectServiceSessionStatus
  
  /** The session is open. */
  @js.native
  sealed trait open extends WiFiDirectServiceSessionStatus
  
  /** A session has been requested. */
  @js.native
  sealed trait requested extends WiFiDirectServiceSessionStatus
  
  /* 0 */ val closed: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus.closed with Double = js.native
  /* 1 */ val initiated: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus.initiated with Double = js.native
  /* 3 */ val open: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus.open with Double = js.native
  /* 2 */ val requested: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionStatus.requested with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceSessionStatus with Double] = js.native
}

