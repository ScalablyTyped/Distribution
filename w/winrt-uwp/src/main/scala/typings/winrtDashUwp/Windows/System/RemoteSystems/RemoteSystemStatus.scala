package typings.winrtDashUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteSystemStatus extends js.Object

/** Contains the values that describe a remote system's availability status. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatus")
@js.native
object RemoteSystemStatus extends js.Object {
  /** The remote system is available. */
  @js.native
  sealed trait available extends RemoteSystemStatus
  
  /** The availability of the remote system is currently being discovered. */
  @js.native
  sealed trait discoveringAvailability extends RemoteSystemStatus
  
  /** The remote system is unavailable. */
  @js.native
  sealed trait unavailable extends RemoteSystemStatus
  
  /** The availability of the remote system is unknown. */
  @js.native
  sealed trait unknown extends RemoteSystemStatus
  
  /* 2 */ val available: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemStatus.available with Double = js.native
  /* 1 */ val discoveringAvailability: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemStatus.discoveringAvailability with Double = js.native
  /* 0 */ val unavailable: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemStatus.unavailable with Double = js.native
  /* 3 */ val unknown: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemStatus.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemStatus with Double] = js.native
}

