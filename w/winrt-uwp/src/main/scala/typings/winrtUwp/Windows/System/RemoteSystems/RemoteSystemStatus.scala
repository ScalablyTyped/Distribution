package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemStatus with Double] = js.native
  /* 2 */ @js.native
  object available extends TopLevel[available with Double]
  
  /* 1 */ @js.native
  object discoveringAvailability extends TopLevel[discoveringAvailability with Double]
  
  /* 0 */ @js.native
  object unavailable extends TopLevel[unavailable with Double]
  
  /* 3 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

