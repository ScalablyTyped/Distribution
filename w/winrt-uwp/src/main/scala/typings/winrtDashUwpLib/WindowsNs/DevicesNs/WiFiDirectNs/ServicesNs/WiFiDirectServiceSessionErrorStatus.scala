package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

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
  sealed trait disassociated
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus
  
  /** The session was closed from the local side of the session. */
  @js.native
  sealed trait localClose
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus
  
  /** Session timed out due to no response from the remote side of the session. */
  @js.native
  sealed trait noResponseFromRemote
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus
  
  /** Session status is OK. */
  @js.native
  sealed trait ok
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus
  
  /** The session was closed from the remote side of the session. */
  @js.native
  sealed trait remoteClose
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus
  
  /** A general system failure has occurred. */
  @js.native
  sealed trait systemFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus
  
  val disassociated: disassociated with java.lang.String = js.native
  val localClose: localClose with java.lang.String = js.native
  val noResponseFromRemote: noResponseFromRemote with java.lang.String = js.native
  val ok: ok with java.lang.String = js.native
  val remoteClose: remoteClose with java.lang.String = js.native
  val systemFailure: systemFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceSessionErrorStatus with java.lang.String
  ] = js.native
}

