package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceSessionErrorStatus extends js.Object

/** Values used in the WiFiDirectServiceSession.ErrorStatus property. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus")
@js.native
object WiFiDirectServiceSessionErrorStatus extends js.Object {
  /** The L2 connection was disassociated unexpectedly. */
  @js.native
  sealed trait disassociated extends WiFiDirectServiceSessionErrorStatus
  
  /** The session was closed from the local side of the session. */
  @js.native
  sealed trait localClose extends WiFiDirectServiceSessionErrorStatus
  
  /** Session timed out due to no response from the remote side of the session. */
  @js.native
  sealed trait noResponseFromRemote extends WiFiDirectServiceSessionErrorStatus
  
  /** Session status is OK. */
  @js.native
  sealed trait ok extends WiFiDirectServiceSessionErrorStatus
  
  /** The session was closed from the remote side of the session. */
  @js.native
  sealed trait remoteClose extends WiFiDirectServiceSessionErrorStatus
  
  /** A general system failure has occurred. */
  @js.native
  sealed trait systemFailure extends WiFiDirectServiceSessionErrorStatus
  
  /* 1 */ val disassociated: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus.disassociated with Double = js.native
  /* 2 */ val localClose: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus.localClose with Double = js.native
  /* 5 */ val noResponseFromRemote: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus.noResponseFromRemote with Double = js.native
  /* 0 */ val ok: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus.ok with Double = js.native
  /* 3 */ val remoteClose: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus.remoteClose with Double = js.native
  /* 4 */ val systemFailure: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus.systemFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceSessionErrorStatus with Double] = js.native
}

