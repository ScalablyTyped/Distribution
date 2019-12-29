package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceSessionErrorStatus with Double] = js.native
  /* 1 */ @js.native
  object disassociated extends TopLevel[disassociated with Double]
  
  /* 2 */ @js.native
  object localClose extends TopLevel[localClose with Double]
  
  /* 5 */ @js.native
  object noResponseFromRemote extends TopLevel[noResponseFromRemote with Double]
  
  /* 0 */ @js.native
  object ok extends TopLevel[ok with Double]
  
  /* 3 */ @js.native
  object remoteClose extends TopLevel[remoteClose with Double]
  
  /* 4 */ @js.native
  object systemFailure extends TopLevel[systemFailure with Double]
  
}

