package typings.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastingConnectionErrorStatus extends js.Object

/** Indicates the error status when starting or ending a casting connection. */
@JSGlobal("Windows.Media.Casting.CastingConnectionErrorStatus")
@js.native
object CastingConnectionErrorStatus extends js.Object {
  /** The device did not respond to the attempt to start or end theconnection. */
  @js.native
  sealed trait deviceDidNotRespond extends CastingConnectionErrorStatus
  
  /** The device returned an error when attempting to start or end the connection. */
  @js.native
  sealed trait deviceError extends CastingConnectionErrorStatus
  
  /** The device was locked and a start or end the connection could not be made. */
  @js.native
  sealed trait deviceLocked extends CastingConnectionErrorStatus
  
  /** The casting source was invalid. */
  @js.native
  sealed trait invalidCastingSource extends CastingConnectionErrorStatus
  
  /** The device could not provide protected playback. */
  @js.native
  sealed trait protectedPlaybackFailed extends CastingConnectionErrorStatus
  
  /** Starting or ending the connection was successful. */
  @js.native
  sealed trait succeeded extends CastingConnectionErrorStatus
  
  /** An unknown error occurred when attempting to start or end the connection. */
  @js.native
  sealed trait unknown extends CastingConnectionErrorStatus
  
}

