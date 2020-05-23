package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

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
  
}

